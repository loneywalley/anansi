#### Optional
1. c
2. c
3. a
4. b
5. b

#### True/False
1. False
2. false
3. true
4. true
5. false

#### Short Answer
1. MediaPlayer digunakan untuk memutar file audio di aplikasi Android. Ini bisa memainkan berbagai format audio seperti MP3.
2. Untuk menampilkan video dengan mengatur URI video yang ingin diputar menggunakan setVideoURI(), kemudian memanggil start() untuk memulai pemutaran
3. Untuk menangkap gambar, perlu menggunakan Intent.ACTION_IMAGE_CAPTURE. membuat intent ini dan memanggil startActivityForResult(). Setelah gambar diambil, hasilnya akan diterima dalam metode onActivityResult().
4. Izin RECORD_AUDIO untuk dapat merekam audio menggunakan mikrofon perangkat.
5. Memutar file audio dari direktori sumber mentah dengan menggunakan MediaPlayer dan memanggil create() dengan konteks dan ID sumber mentah untuk memuat file, kemudian memanggil start() untuk memutarnya.

#### Fix Code
1. 
    val mediaPlayer = MediaPlayer()
    val assetFileDescriptor = assets.openFd("audio.mp3") 
    mediaPlayer.setDataSource(assetFileDescriptor.fileDescriptor, assetFileDescriptor.startOffset, assetFileDescriptor.length)
    mediaPlayer.prepare() 
    mediaPlayer.start() 


2. 
    val videoView: VideoView = findViewById(R.id.videoView)
    videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.video) 
    videoView.start()


3. 
    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE) 
    startActivityForResult(intent, 1)


#### Project