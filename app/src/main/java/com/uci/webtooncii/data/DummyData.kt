package com.uci.webtooncii.data

import com.uci.webtooncii.model.Webtoonh
import com.uci.webtooncii.R
import com.uci.webtooncii.model.Gallery
import com.uci.webtooncii.model.GalleryData
import com.uci.webtooncii.model.Webtoon
import kotlin.Int

object DummyData {
    val listwebtoon = listOf(
        Webtoonh(
            id = 1,
            title = "Dedes",
            author = "egestigi",
            genre = "Kerajaan",
            image = R.drawable.dedes,
            preview = "Isekai yang diangkat dari kisah sejarah Indonesia! Seorang mahasiswi tiba-tiba terbangun di tubuh Dedes, seorang gadis yang kelak akan menjadi ibu bagi para raja di tanah Jawa. Tetapi, semakin lama berada dalam tubuh Dedes, dia menyadari bahwa sejarah yang ada tak sepenuhnya benar."
        ) ,
        Webtoonh(
                id = 2,
        title = "Sweet Home",
        author = " Kimcharnby, Youngchan Hwang",
        genre = "Horror",
        image = R.drawable.sweethome,
                preview = "Ketika putus asa sudah melanda... Itulah saatnya kita keluar dari sini.. "
    ),
    Webtoonh(
    id = 3,
    title = "WEE!!!",
    author = "Amoeba UwU",
    genre = "Slice of life",
    image = R.drawable.wee,
    preview = "Di saat kangen sekolah dan bertemu teman-teman lagi, ada Amu yang kesehariannya di sekolah bisa kamu ikuti! Bersama teman-temannya yang berkelakuan aneh serta bodoh, mereka akan melalui masa SMA yang penuh suka, duka, cita, dan cinta! "
    ),
    Webtoonh(
    id = 4,
    title = "The Tiger God Of Jangsan",
    author = " Ryoung, SEORU",
    genre = "Romantis",
    image = R.drawable.jangsan,
    preview = "Hong Siah, pelajar super pintar yang telah ditinggal oleh orang tuanya ini kini hidup bersama sang bibi dan membuat kenangan masa sekolah bersama dua sahabatnya. Tapi kenapa dunia seperti tak berpihak padanya? Walau aneh, semua mulai berubah setelah pertemuan Siah dengan siluman harimau, Jangsanbeom. Kehidupannya berubah, tapi dengan cara khas Jangsanbeom. Bagaimana jadinya kehidupan baru Siah? "
    ),
    Webtoonh(
    id = 5,
    title = "Eh, Sorry Kesantet",
    author = " Alextradip",
    genre = "Komedi",
    image = R.drawable.santet,
    preview = "Biarpun blasteran dukun dan kuntilanak, tapi Mela ingin punya kehidupan seperti gadis remaja normal! Dia mulai bersekolah di SMA umum dan belajar mencari teman. Semua kelihatan lancar, sampai ketika Mela tidak sengaja menyantet salah satu teman sekelasnya... sampai kepalanya putus...."
    ),
    Webtoonh(
    id = 6,
    title = "Me VS Big Slacker Baby",
    author = "Re:ON Comics, Annisa Nisfihani",
    genre = "Drama",
    image = R.drawable.mevsbig,
    preview = " Arin, seorang gadis super rapi yang selalu senewen setiap kali melihat segala sesuatu yang berantakan. Suatu hari, kos yang dikelola oleh ibu Arin kedatangan seorang siswa SMA bernama Alvan yang ternyata selain pemalas juga manja dan super berantakan. Keadaan menjadi semakin tidak terkendali ketika Arin dan Alvan bersekolah di sekolah yang sama, apalagi Alvan ternyata juga cukup populer di kalangan para siswi. Apa jadinya ketika dua individu yang saling bertolak belakang sifatnya ini tinggal dan bersekolah di tempat yang sama? "
    ),
        Webtoonh(
            id = 7,
            title = "Bad Word Baby",
            author = " El Nareswara",
            genre = "Slice of life",
            image = R.drawable.badword,
            preview = "Kebayang gak sih, punya pacar yang pemarah, senang mengumpat, dan gualaaaknya minta ampun??? Udah gitu bundamu paling alergi sama kata-kata kasar! Jangan sampai deh mereka berdua bertemu! "
        ),
        Webtoonh(
            id = 8,
            title = "Meet Me in the Middle",
            author = " White Cho, Yoon Kim",
            genre = "Romantis",
            image = R.drawable.middle,
            preview = "Aku benar-benar bisa membuat semuanya jadi lebih menyenangkan! Suatu hari seorang pria muda misterius muncul di hadapan Yeorum, seorang wanita berusia 30 tahun yang menjalani hidup dengan membosankan. Pria yang bernama Jisung itu terus mendekati Yeorum dengan lucunya. Tapi mereka kan bertemu melalui aplikasi dating dengan saling mengganti umur aslinya?! Sebenarnya apa yang diinginkan pria itu?! Komedi romantis yang mendebarkan dari dua orang yang saling menipu!.. "
        ),
        Webtoonh(
            id = 9,
            title = "CHUBBINESS",
            author = "Ivonne Febriani",
            genre = "Romantis",
            image = R.drawable.dedes,
            preview = "Isekai yang diangkat dari kisah sejarah Indonesia! Seorang mahasiswi tiba-tiba terbangun di tubuh Dedes, seorang gadis yang kelak akan menjadi ibu bagi para raja di tanah Jawa. Tetapi, semakin lama berada dalam tubuh Dedes, dia menyadari bahwa sejarah yang ada tak sepenuhnya benar."
        ) ,
        Webtoonh(
            id = 10,
            title = "OTENBA",
            author = "Dihocchi",
            genre = "Komedi",
            image = R.drawable.sweethome,
            preview = "Ketika putus asa sudah melanda... Itulah saatnya kita keluar dari sini.. "
        ),
        Webtoonh(
            id = 11,
            title = "Not Your Typical Reincarnation Story",
            author = "DOYOSAY",
            genre = "Kerajaan",
            image = R.drawable.dedes,
            preview = "Isekai yang diangkat dari kisah sejarah Indonesia! Seorang mahasiswi tiba-tiba terbangun di tubuh Dedes, seorang gadis yang kelak akan menjadi ibu bagi para raja di tanah Jawa. Tetapi, semakin lama berada dalam tubuh Dedes, dia menyadari bahwa sejarah yang ada tak sepenuhnya benar."
        ) ,
        Webtoonh(
            id = 12,
            title = "A Child Who Looks Like Me",
            author = "FLADA, PATNOC",
            genre = "Romantis",
            image = R.drawable.sweethome,
            preview = "Ketika putus asa sudah melanda... Itulah saatnya kita keluar dari sini.. "
        ),
        Webtoonh(
            id = 13,
            title = "Killer Peter",
            author = "Kim Junghyun, Lim lina",
            genre = "Aksi",
            image = R.drawable.wee,
            preview = "Di saat kangen sekolah dan bertemu teman-teman lagi, ada Amu yang kesehariannya di sekolah bisa kamu ikuti! Bersama teman-temannya yang berkelakuan aneh serta bodoh, mereka akan melalui masa SMA yang penuh suka, duka, cita, dan cinta! "
        ),
        Webtoonh(
            id = 14,
            title = "Iseop's Romance",
            author = "248, Anna Kim",
            genre = "Romantis",
            image = R.drawable.jangsan,
            preview = "Hong Siah, pelajar super pintar yang telah ditinggal oleh orang tuanya ini kini hidup bersama sang bibi dan membuat kenangan masa sekolah bersama dua sahabatnya. Tapi kenapa dunia seperti tak berpihak padanya? Walau aneh, semua mulai berubah setelah pertemuan Siah dengan siluman harimau, Jangsanbeom. Kehidupannya berubah, tapi dengan cara khas Jangsanbeom. Bagaimana jadinya kehidupan baru Siah? "
        ),
        Webtoonh(
            id = 15,
            title = "You Cann't Kill Me: The Secret Bride Of the Black Wolf",
            author = "HAEMIN, Kingkang",
            genre = "Kerajaan",
            image = R.drawable.santet,
            preview = "Biarpun blasteran dukun dan kuntilanak, tapi Mela ingin punya kehidupan seperti gadis remaja normal! Dia mulai bersekolah di SMA umum dan belajar mencari teman. Semua kelihatan lancar, sampai ketika Mela tidak sengaja menyantet salah satu teman sekelasnya... sampai kepalanya putus...."
        ),
        Webtoonh(
            id = 16,
            title = "Operation: True Love",
            author = "Klokkalee, Dledumb",
            genre = "Romantis",
            image = R.drawable.mevsbig,
            preview = " Arin, seorang gadis super rapi yang selalu senewen setiap kali melihat segala sesuatu yang berantakan. Suatu hari, kos yang dikelola oleh ibu Arin kedatangan seorang siswa SMA bernama Alvan yang ternyata selain pemalas juga manja dan super berantakan. Keadaan menjadi semakin tidak terkendali ketika Arin dan Alvan bersekolah di sekolah yang sama, apalagi Alvan ternyata juga cukup populer di kalangan para siswi. Apa jadinya ketika dua individu yang saling bertolak belakang sifatnya ini tinggal dan bersekolah di tempat yang sama? "
        ),
        Webtoonh(
            id = 17,
            title = "Dorm Du",
            author = "-KAFAZA14-",
            genre = "Fantasi",
            image = R.drawable.badword,
            preview = "Kebayang gak sih, punya pacar yang pemarah, senang mengumpat, dan gualaaaknya minta ampun??? Udah gitu bundamu paling alergi sama kata-kata kasar! Jangan sampai deh mereka berdua bertemu! "
        ),
        Webtoonh(
            id = 18,
            title = "Hello Babby",
            author = "Enjelious",
            genre = "Romantis",
            image = R.drawable.middle,
            preview = "Aku benar-benar bisa membuat semuanya jadi lebih menyenangkan! Suatu hari seorang pria muda misterius muncul di hadapan Yeorum, seorang wanita berusia 30 tahun yang menjalani hidup dengan membosankan. Pria yang bernama Jisung itu terus mendekati Yeorum dengan lucunya. Tapi mereka kan bertemu melalui aplikasi dating dengan saling mengganti umur aslinya?! Sebenarnya apa yang diinginkan pria itu?! Komedi romantis yang mendebarkan dari dua orang yang saling menipu!.. "
        ),
        Webtoonh(
            id = 19,
            title = "My Demon",
            author = "Choi a-IL",
            genre = "Romantis",
            image = R.drawable.dedes,
            preview = "Isekai yang diangkat dari kisah sejarah Indonesia! Seorang mahasiswi tiba-tiba terbangun di tubuh Dedes, seorang gadis yang kelak akan menjadi ibu bagi para raja di tanah Jawa. Tetapi, semakin lama berada dalam tubuh Dedes, dia menyadari bahwa sejarah yang ada tak sepenuhnya benar."
        ) ,
        Webtoonh(
            id = 20,
            title = "I Thought My Time Was Up",
            author = "Essie",
            genre = "Kerajaan",
            image = R.drawable.sweethome,
            preview = "Ketika putus asa sudah melanda... Itulah saatnya kita keluar dari sini.. "
        ),
    )

    val webtoongalleries = listOf(
    Gallery (
    id = 1,
    name = "foto1",
    photo = R.drawable.elios
    ),
    Gallery (
    id = 2,
    name = "foto2",
    photo = R.drawable.sarah
    ),
    Gallery (
    id = 3,
    name = "foto3",
    photo = R.drawable.sigit
    ),
    Gallery (
    id = 4,
    name = "foto4",
    photo = R.drawable.amu
    ),
    Gallery (
    id = 5,
    name = "foto5",
    photo = R.drawable.upi
    ),
    Gallery (
    id = 6,
    name = "foto6",
    photo = R.drawable.enzo
    ),
    Gallery (
    id = 7,
    name = "foto7",
    photo = R.drawable.foto1
    ),
    Gallery (
    id = 8,
    name = "foto8",
    photo = R.drawable.sho
    ),
    Gallery (
    id = 9,
    name = "foto9",
    photo = R.drawable.toro
    ),
    Gallery (
    id = 10,
    name = "foto10",
    photo = R.drawable.foto6
    ),
        Gallery (
            id = 11,
            name = "foto1",
            photo = R.drawable.foto12
        ),
    )

    val listwebtoon3 = listOf(
        Webtoon(
            id = 1,
            title = "Dedes",
            genre = "Kerajaan",
            image = R.drawable.dedes,
        ) ,
        Webtoon(
            id = 2,
            title = "Sweet Home",
            genre = "Horror",
            image = R.drawable.sweethome,
        ),
        Webtoon(
            id = 3,
            title = "WEE!!!",
            genre = "Slice of life",
            image = R.drawable.wee
        ),
        Webtoon(
            id = 4,
            title = "The Tiger God Of Jangsan",
            genre = "Romantis",
            image = R.drawable.jangsan
        ),
        Webtoon(
            id = 5,
            title = "Eh, Sorry Kesantet",
            genre = "Komedi",
            image = R.drawable.santet,
            ),
        Webtoon(
            id = 6,
            title = "Me VS Big Slacker Baby",
            genre = "Drama",
            image = R.drawable.mevsbig,
            ),
        Webtoon(
            id = 7,
            title = "Bad Word Baby",
            genre = "Slice of life",
            image = R.drawable.badword,
        ),
        Webtoon(
            id = 8,
            title = "Meet Me in the Middle",
            genre = "Romantis",
            image = R.drawable.middle,
        ),
        Webtoon(
            id = 9,
            title = "Dedes",
            genre = "Kerajaan",
            image = R.drawable.dedes,
        ) ,
        Webtoon(
            id = 10,
            title = "Sweet Home",
            genre = "Horror",
            image = R.drawable.sweethome,
        ),
    )

    val profilgalery = listOf(
        GalleryData(
            id=1,
            name="Elios Zanquen",
            photo= R.drawable.elios,
            tl= "3 Juli",
            goldar= "B",
            tb= "173 cm",
            bb= "54 kg",
            fav= "Susu tawar",
            suka="Tempat sepi yang nyaman",
            gsuka="Tempat ramai, Naik kendaraan",
        ),
        GalleryData(
            id=2,
            name="Sarah Fransesca",
            photo= R.drawable.sarah,
            tl= "25 September",
            goldar= "O",
            tb= "160 cm",
            bb= "46 kg",
            fav= "Makanan manis",
            suka="Naik wahana ekstrim, Berenang",
            gsuka="Antrian panjang",
        ),
        GalleryData(
            id=3,
            name="Sigit Sanjaya",
            photo= R.drawable.sigit,
            tl= "26 Oktober",
            goldar= "A",
            tb= "170 cm",
            bb= "60 kg",
            fav= "Nasi Goreng",
            suka="Main game memasak",
            gsuka="Orang yang membeda-bedakan orang lain",
        ),
        GalleryData(
            id=4,
            name="Amu",
            photo= R.drawable.amu,
            tl= "-",
            goldar= "-",
            tb= "143 cm",
            bb= "- kg",
            fav= "Semua makanan",
            suka="Melukis",
            gsuka="Deket-deket cowok",
        ),
        GalleryData(
            id=5,
            name="Upi",
            photo= R.drawable.upi,
            tl= "-",
            goldar= "-",
            tb= "-",
            bb= "-",
            fav= "Enzo",
            suka="Uang, Pria Tampan dan Olahraga",
            gsuka="Tempat ramai, Naik kendaraan",
        ),
        GalleryData(
            id=6,
            name="Elios",
            photo= R.drawable.enzo,
            tl= "-",
            goldar= "-",
            tb= "-",
            bb= "-",
            fav= "Sepak bola",
            suka="Olahraga",
            gsuka="Diganggu/diusilin",
        ),
        GalleryData(
            id=7,
            name="Kiki",
            photo= R.drawable.foto1,
            tl= "",
            goldar= "",
            tb= "",
            bb= "",
            fav= "Amu",
            suka="Musik",
            gsuka="Kehilangan orang yang dicintainya",
        ),
        GalleryData(
            id=8,
            name="Sho",
            photo= R.drawable.sho,
            tl= "-",
            goldar= "-",
            tb= "-",
            bb= "-",
            fav= "Bolos/Tidur",
            suka="Hewan",
            gsuka="Ayahnya",
        ),
        GalleryData(
            id=9,
            name="Toro",
            photo= R.drawable.toro,
            tl= "-",
            goldar= "-",
            tb= "-",
            bb= "-",
            fav= "Umami",
            suka="Memasak, melindungi sahabatnya",
            gsuka="Anak nakal",
        ),
        GalleryData(
            id=10,
            name="SeolBeom/Jangsanbeom",
            photo= R.drawable.foto6,
            tl= "-",
            goldar= "-",
            tb= "-",
            bb= "-",
            fav= "Hong Siah",
            suka="Melindungi orang-orang di Wilayah Jangsan",
            gsuka="Tidak dipercaya",
        ),
        GalleryData(
            id=11,
            name="Teo",
            photo= R.drawable.foto12,
            tl= "-",
            goldar= "-",
            tb= "-",
            bb= "-",
            fav= "Dimanja oleh Park Sejun",
            suka="Menjadi penjual keliling",
            gsuka="Dibohongi",
        ),
    )

    /*val listwebtoon4 = listOf(
        Webtoon(
            id = 1,
            title = "Sweet Home",
            genre = "Horror",
            image = R.drawable.sweethome,
        ),
        Webtoon(
            id = 2,
            title = "Bad Word Baby",
            genre = "Slice of life",
            image = R.drawable.badword,
            ),
        Webtoon(
            id = 3,
            title = "Meet Me in the Middle",
            genre = "Romantis",
            image = R.drawable.middle,
            ),
        Webtoon(
            id = 4,
            title = "The Tiger God Of Jangsan",
            genre = "Romantis",
            image = R.drawable.jangsan
        ),
        Webtoon(
            id = 5,
            title = "Me VS Big Slacker Baby",
            genre = "Drama",
            image = R.drawable.mevsbig
        ),
        Webtoon(
            id = 6,
            title = "Sweet Home",
            genre = "Horror",
            image = R.drawable.sweethome,
        ),
        Webtoon(
            id = 7,
            title = "Bad Word Baby",
            genre = "Slice of life",
            image = R.drawable.badword,
        ),
        Webtoon(
            id = 8,
            title = "Meet Me in the Middle",
            genre = "Romantis",
            image = R.drawable.middle,
        ),
        Webtoon(
            id = 9,
            title = "The Tiger God Of Jangsan",
            genre = "Romantis",
            image = R.drawable.jangsan
        ),
        Webtoon(
            id = 10,
            title = "Me VS Big Slacker Baby",
            genre = "Drama",
            image = R.drawable.mevsbig
        )
    )*/
}