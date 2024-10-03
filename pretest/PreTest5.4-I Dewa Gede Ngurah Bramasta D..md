#### Optional
1. b
2. b
3. b
4. e
5. a

#### True/False
1. True
2. False
3. True
4. False
5. False

#### Short Answer
1. GsonConverterFactory digunakan untuk mengubah data JSON yang diterima dari server menjadi objek Java/Kotlin secara otomatis
2. Menggunakan metode enqueue() pada objek Call. Ini akan menjalankan permintaan di latar belakang dan memberi tahu hasilnya ketika sudah selesai.
3. Panggilan sinkron menunggu hasil sebelum melanjutkan kode, sedangkan panggilan asinkron berjalan di latar belakang dan tidak menghentikan proses aplikasi sambil menunggu hasil.
4. Dengan menambahkan parameter dengan menggunakan anotasi @Query pada parameter metode di interface Retrofit. Ini akan mengirimkan data tersebut sebagai bagian dari URL.
5. Jika permintaan gagal, Retrofit memberikan objek kesalahan yang bisa kita periksa. Kita bisa menangani kesalahan ini dengan cara memberikan kode untuk menampilkan pesan kesalahan atau melakukan tindakan lain, seperti mencoba lagi atau memberi tahu pengguna.

#### Fixed Code
1. 
    @GET("users")
    fun getUsers(): Call<List<User>>


2. 
    @POST("login")
    fun loginUser(@Body credentials: Map<String, String>): Call<LoginResponse>

    val credentials = mapOf("username" to "yourUsername", "password" to "yourPassword")
    val response = loginUser(credentials)


3. 
    @GET("user/{id}")
    fun getUserById(@Path("id") userId: Int): Call<User>

    getUserById(123).enqueue(object : Callback<User> {
        override fun onResponse(call: Call<User>, response: Response<User>) {
            if (response.isSuccessful) {
                // Handle the successful response here
            }
        }

        override fun onFailure(call: Call<User>, t: Throwable) {
            // Handle the failure here
        }
    })



#### Project