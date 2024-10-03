#### Optional
1. d
2. b
3. a
4. c
5. b

#### Tru/False
1. False
2. True
3. False
4. True
5. False

#### Short Answer
1. onPause hanya memberhentikan sementara aktivitas yang sebelemnya berjalan, dan ketika pengguna ingin melanjutkan aktivitas pengguna tidak perlu mengulang dari awal. onStop akan menghentikan total aktivitas, dan pengguna harus mengulang dari awal jika ingin melanjutkan aktivitas tersebut
2. menggunakan method putExtra untuk mengirim data, dan menggunakan getIntent untuk mengirim data
3. method tersebut akan menyimpan data aktivitas yang terjadi, karena ketika screen rotate aktivitas tersebut akan di destroy dan di create ulang, dengan adanya method tersebut data tidak perlu dibuat ulang cukup di muat ulang
4. ketika menekan tombol back maka akan di panggil method onPause, kemudian method onStop juga akan dipanggil, dan method onDestroy juga akan dipanggil di akhir
5. dengan menggunakan startactivityforresult

#### Fix Code
1. 
    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
    explain : kode tersebut digunakan untuk perpindahan aktivitas dengan menggunakan intent, dan inten ini sangat diperlukan untuk perpindahan aktivitas, atau bisa menggunakan fragment, namun kasus ini adalah perpindahan menggunakan intent, dan dalam menggunakan intent harus diinisiasikan dulu intent tersebut mengarah kemana dan baru dimasukan kedalam startactivity

2. 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

3. 
    override fun onDestroy(){
        super.onDestroy()
        setContentView(R.layout.activity_main)
    }


#### Project
Jawaban dalam bentuk screenshoot terpisah dari file ini
