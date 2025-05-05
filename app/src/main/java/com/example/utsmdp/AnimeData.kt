package com.example.utsmdp

import android.content.Context
import com.example.utsmdp.R
import com.example.utsmdp.model.Anime

object AnimeData {

    fun getAnimeList(context: Context): List<Anime> {
        return listOf(
            Anime(
                id = 1,
                title = "Attack on Titan",
                description = "Attack on Titan berlatar di dunia di mana umat manusia berada di ambang kepunahan akibat ancaman raksasa bernama Titan. Untuk bertahan hidup, manusia membangun tiga lapis tembok raksasa sebagai perlindungan dari makhluk pemakan manusia tersebut. Cerita dimulai ketika tembok terluar, Wall Maria, dihancurkan oleh Titan Kolosal, memicu kekacauan dan tragedi besar bagi karakter utama, Eren Yeager.\n" +
                        "\n" +
                        "Demi membalas dendam dan melindungi umat manusia, Eren bergabung dengan pasukan militer khusus, Survey Corps, bersama teman-teman masa kecilnya, Mikasa dan Armin. Dalam perjalanan mereka, terungkap berbagai misteri tentang asal-usul Titan, rahasia di balik tembok, dan sejarah dunia yang sebenarnya. Anime ini dipenuhi dengan konflik brutal, kejutan tak terduga, dan eksplorasi mendalam tentang kebebasan dan kemanusiaan.\n" +
                        "\n" +
                        "Dengan narasi yang kompleks dan atmosfer yang kelam, Attack on Titan berkembang dari sekadar kisah bertahan hidup menjadi alegori politik dan filsafat yang penuh makna. Plot twist yang intens, karakter yang berkembang secara dinamis, dan animasi memukau membuat anime ini menjadi salah satu seri paling fenomenal dan dihormati dalam sejarah anime modern.",
                imageResourceId = R.drawable.anime_attack_on_titan
            ),
            Anime(
                id = 2,
                title = "Fullmetal Alchemist: Brotherhood",
                description = "Fullmetal Alchemist: Brotherhood mengikuti kisah dua bersaudara, Edward dan Alphonse Elric, yang mencoba menghidupkan kembali ibu mereka yang telah meninggal melalui ilmu alkimia terlarang. Namun eksperimen itu gagal dan membawa konsekuensi tragis: tubuh Alphonse menghilang, sementara Edward kehilangan lengan dan kakinya. Mereka pun memulai perjalanan untuk mencari Batu Bertuah, artefak legendaris yang diyakini mampu mengembalikan tubuh mereka.\n" +
                        "\n" +
                        "Perjalanan mereka membawa mereka pada konspirasi besar yang melibatkan militer, para homunculus, dan misteri bangsa mereka sendiri. Di balik pencarian itu, terselip pertanyaan mendalam tentang pengorbanan, nilai kehidupan, dan makna \"kemanusiaan\". Setiap karakter dalam anime ini memiliki latar belakang dan motivasi kuat yang membuat jalan ceritanya semakin hidup dan berkesan.\n" +
                        "\n" +
                        "Brotherhood merupakan adaptasi yang lebih setia terhadap manga aslinya, menawarkan narasi yang matang, penuh aksi, dan emosi. Dengan paduan cerita politik, spiritualitas, dan ilmu pengetahuan, anime ini berhasil menciptakan dunia yang imersif dan bermakna. Tak heran jika banyak yang menganggapnya sebagai salah satu anime terbaik sepanjang masa.",
                imageResourceId = R.drawable.anime_fmab
            ),
            Anime(
                id = 3,
                title = "Demon Slayer",
                description = "Demon Slayer mengisahkan Tanjiro Kamado, seorang pemuda berhati lembut yang hidup sederhana bersama keluarganya. Suatu hari, tragedi menimpa keluarganya ketika mereka dibantai oleh iblis, dan satu-satunya yang selamat, adiknya Nezuko, justru berubah menjadi iblis. Tanjiro pun bertekad untuk menyembuhkan adiknya dan membasmi iblis demi menegakkan keadilan.\n" +
                        "\n" +
                        "Tanjiro kemudian bergabung dengan Korps Pembasmi Iblis, sebuah organisasi rahasia yang melatih pendekar pedang untuk memburu para iblis. Dalam perjalanannya, ia bertemu dengan berbagai karakter unik seperti Zenitsu dan Inosuke yang menjadi teman seperjuangannya. Melalui berbagai misi dan pertarungan, mereka menghadapi musuh-musuh kuat dan mengungkap rahasia gelap di balik keberadaan iblis.\n" +
                        "\n" +
                        "Anime ini dikenal karena animasi yang luar biasa indah dari Ufotable, soundtrack yang emosional, serta pertarungan yang penuh gaya dan emosi. Demon Slayer bukan hanya kisah aksi, tapi juga tentang kasih sayang keluarga, tekad yang tak tergoyahkan, dan kemanusiaan dalam dunia yang kelam.",
                imageResourceId = R.drawable.anime_demon_slayer
            ),
            Anime(
                id = 4,
                title = "My Hero Academia",
                description = "My Hero Academia berlatar di dunia di mana hampir seluruh manusia memiliki kekuatan super yang disebut \"Quirk\". Di tengah dunia yang dipenuhi pahlawan super, Izuku Midoriya lahir tanpa kekuatan apa pun. Namun, tekadnya untuk menjadi pahlawan sejati membuatnya terpilih sebagai pewaris kekuatan dari pahlawan legendaris, All Might.\n" +
                        "\n" +
                        "Setelah menerima Quirk \"One For All\", Midoriya masuk ke sekolah pahlawan terkemuka, U.A. High School, dan mulai belajar untuk mengendalikan kekuatannya. Bersama teman-temannya seperti Bakugo, Todoroki, dan Uraraka, mereka menghadapi pelatihan keras, turnamen antar siswa, hingga ancaman nyata dari para penjahat. Dunia pahlawan pun ternyata tidak seideal yang dibayangkan, menyimpan konflik dan intrik yang kompleks.\n" +
                        "\n" +
                        "My Hero Academia menghadirkan kombinasi antara semangat kepahlawanan, drama remaja, dan kritik sosial tentang kekuasaan dan tanggung jawab. Dengan karakter yang berkembang pesat dan cerita yang terus meningkat skalanya, anime ini berhasil menyampaikan pesan bahwa menjadi pahlawan bukan soal kekuatan, tapi keberanian dan ketulusan hati.",
                imageResourceId = R.drawable.anime_my_hero_academia
            ),
            Anime(
                id = 5,
                title = "One Piece",
                description = "One Piece mengikuti petualangan Monkey D. Luffy, seorang pemuda yang bercita-cita menjadi Raja Bajak Laut. Dengan kekuatan karet dari Buah Iblis yang ia makan dan semangat yang tak pernah padam, Luffy menjelajahi lautan luas bernama Grand Line untuk mencari harta legendaris bernama One Piece. Dalam perjalanannya, ia membentuk kru unik bernama Topi Jerami.\n" +
                        "\n" +
                        "Setiap anggota kru memiliki impian dan masa lalu yang kuat, dari Zoro si pendekar pedang, Nami si navigator, Sanji si koki, hingga Robin si arkeolog. Mereka menghadapi berbagai tantangan mulai dari bajak laut kejam, angkatan laut, hingga makhluk-makhluk aneh dan kerajaan misterius. Di balik semua petualangan seru itu, terselip pesan tentang mimpi, persahabatan, dan kebebasan.\n" +
                        "\n" +
                        "Dengan dunia yang luas dan cerita yang terus berkembang selama puluhan tahun, One Piece adalah kisah epik yang memadukan humor, aksi, dan emosi. Eiichiro Oda telah menciptakan dunia yang penuh warna dan kehidupan, menjadikan One Piece salah satu karya paling berpengaruh dan dicintai di dunia anime.",
                imageResourceId = R.drawable.anime_one_piece
            ),
            Anime(
                id = 6,
                title = "Naruto",
                description = "Naruto menceritakan kisah Uzumaki Naruto, seorang ninja muda dari desa Konoha yang dikucilkan karena di dalam tubuhnya tersegel monster rubah berekor sembilan. Meski demikian, Naruto bermimpi menjadi Hokage, pemimpin desa yang dihormati oleh semua orang. Dengan semangat pantang menyerah, ia berjuang keras untuk mendapatkan pengakuan dan mencapai mimpinya.\n" +
                        "\n" +
                        "Di akademi ninja, Naruto bertemu dengan teman-temannya seperti Sasuke dan Sakura, serta guru mereka, Kakashi. Bersama-sama, mereka menjalani misi berbahaya dan menghadapi berbagai ancaman, termasuk organisasi kriminal kuat seperti Akatsuki. Naruto juga harus menghadapi konflik batin, terutama hubungannya dengan Sasuke yang berubah menjadi musuh.\n" +
                        "\n" +
                        "Naruto adalah kisah yang sarat dengan tema persahabatan, tekad, dan pengorbanan. Dengan dunia ninja yang kompleks dan sistem pertarungan yang kreatif, anime ini berhasil menciptakan karakter-karakter yang kuat secara emosional dan memorable. Kisah perjalanan Naruto dari anak terbuang hingga menjadi pahlawan dunia membuat anime ini menjadi ikon global.",
                imageResourceId = R.drawable.anime_death_note
            ),
            Anime(
                id = 7,
                title = "Jujutsu Kaisen",
                description = "Jujutsu Kaisen mengisahkan Itadori Yuji, seorang siswa SMA biasa yang tanpa sengaja terlibat dalam dunia kutukan setelah menelan jari iblis legendaris bernama Sukuna. Dengan menjadi wadah bagi Sukuna, Yuji pun ditarik masuk ke sekolah Jujutsu, tempat para penyihir belajar mengusir kutukan. Ia kemudian berjuang menyeimbangkan misinya dengan mempertahankan nilai kemanusiaannya.\n" +
                        "\n" +
                        "Bersama teman-temannya seperti Megumi dan Nobara, serta mentor karismatik Gojo Satoru, Yuji menjalani pelatihan dan menghadapi pertarungan berbahaya melawan kutukan-kutukan yang mengancam umat manusia. Di balik kekacauan tersebut, terungkap ancaman yang jauh lebih besar dari dunia kutukan yang semakin tak terkendali.\n" +
                        "\n" +
                        "Dengan animasi yang luar biasa, pertarungan yang brutal, serta atmosfer gelap yang khas, Jujutsu Kaisen berhasil memikat hati penggemar baru dan lama. Ceritanya menyuguhkan tema tentang kematian, penderitaan, dan kekuatan ikatan manusia. Anime ini membuktikan bahwa dalam dunia yang penuh kegelapan, cahaya bisa datang dari keberanian dan tekad.",
                imageResourceId = R.drawable.anime_jujutsu_kaisen
            )
        )
    }

    fun getAnimeById(context: Context, id: Int): Anime? {
        return getAnimeList(context).find { it.id == id }
    }
}