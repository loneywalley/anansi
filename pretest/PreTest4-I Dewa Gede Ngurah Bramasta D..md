#### Optional
1. b
2. b
3. b
4. c
5. b

#### Short Answer
6. list adalah list yang datanya tidak dapat diubah. sedangkan mutable list adalah list yang datanya dapat diubah
7. menggunakan onPause salah satunya
8. menghentikan sementara proses yang terjadi, ketika user memutuskan untuk keluar dari aplikasi yang sedang dia gunakan
9. recyler view adalah versi lanjutan dari list view, dengan beberapa pengembangan yang membuatnya lebih mudah digunakan
10. Digunakan untuk sebagai database pengganti SQLLite, sehingga developer tidak harus mengakses SQLLite secara langsung
11. Mengubah HTTP API menjadi java interface
12. digunakan untuk pertama kali user berinteraksi
13. LiveData digunakan untuk menampung perubahan yang terjadi, dan akan dikembalikan jika user mengakses data tersebut
14. dengan menggunakan fragment dengan memanggil fungsi setretaininstance
15. dapat menulis kode asinkronus dan lebih ringan dibandingan dengan threads

#### Yes/No Question
16. Yes
17. Yes
18. Yes
19. No
20. Yes

#### Correct Code
21. 
    val myList = mutableListOf(1, 2, 3)
    myList.add(4)

22. 
    suspend fun myFunction() {
        delay(1000L)
        println("Completed")
    }

    fun main() = runBlocking {
        myFunction()
    }

23. 
    val map = mutableMapOf(1 to "One", 2 to "Two")
    map[3] = "Three"

24. 
    val intent = Intent(this, SecondActivity::class.java)
    startActivity(intent)

25. 
    val view = findViewById<Button>(R.id.myButton)
    view.setOnClickListener {
        Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
    }

26. 
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    val result = add(5, 10)

27. 
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("KEY", 1)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val key = savedInstanceState.getInt("KEY")
    }

28. 
    val textView = findViewById<TextView>(R.id.textView)
    textView.text = getString(R.string.app_name)

29. 
    fun main() = runBlocking {
        val job = async {
            delay(1000L)
            "Hello"
        }

        val result = job.await()
        println(result)
    }

30. 

#### Story





