public class Main {
    public static void main(String[] args) {
        EasyAjalah playlist = new EasyAjalah();
        playlist.addLagu("Lee Young Ji", "Small girl", 1973, 3, 9, "R&B");
        playlist.addLagu("Why Don't We", "8 Letters", 2024, 3, 10, "Pop");
        playlist.addLagu("The Smiths", "There Is a Light That Never Goes Out", 2024, 4, 4, "Indie");
        playlist.addLagu("Bruno Mars dan Lady Gaga", "Die With A Smile", 2023, 4, 11, "Pop");
        playlist.addLagu("One Ok Rock", "We are", 2018, 4, 15, "Pop Rock");
        playlist.addLagu("Wave to Earth", "Bad", 1986, 4, 23, "Korean Rock, Thai Indie");
        playlist.addLagu(".Feast", "Nina", 2020, 4, 37, "Indonesian Rock");
        playlist.addLagu("Green Day", "21 Guns", 2017, 5, 21, "Punk Pop");
        playlist.addLagu("Billy Joel", "Piano Man", 2024, 5, 39, "Folk");
        playlist.addLagu("Pamungkas", "To the Bone", 2009, 5, 44, "Indonesian Indie");

        playlist.tampilkanPlaylist();
        
        System.out.println("====================================================");
        System.out.println("=                   LOL Playlist                   =");
        System.out.println("=            Pengurutan Berdasarkan Durasi         =");
        System.out.println("====================================================");

        playlist.urutkanBerdasarkanDurasi();
        playlist.tampilkanPlaylist();
        
        System.out.println("====================================================");
        System.out.println("=                   LOL Playlist                   =");
        System.out.println("=         Pengurutan Berdasarkan Tahun Rilis       =");
        System.out.println("====================================================");

        playlist.urutkanBerdasarkanRilis();
        playlist.tampilkanPlaylist();
        
        playlist.cariLagu("Runaway Baby");

        playlist.addLagu("Cinta Pertama dan Terakhir", "Sherina", 2009, 4, 13, "Pop");
        playlist.addLagu("To the Bone", "Pamungkas", 2020, 5, 12, "Indie Pop");
        playlist.addLagu("Dia", "Anji", 2016, 3, 37, "Pop");
        playlist.addLagu("Pupus", "Dewa 19", 2000, 5, 6, "Rock");
        playlist.addLagu("A Whole New World", "Zayn Malik & Zhavia Ward", 2019, 4, 2, "Soundtrack");
        playlist.addLagu("Rewrite the Stars", "Zac Efron & Zendaya", 2018, 3, 37, "Soundtrack");
        playlist.addLagu("Rewrite the Stars", "James Arthur & Anne-Marie", 2018, 3, 47, "Pop");
        playlist.addLagu("Say You Won't Let Go", "James Arthur", 2016, 3, 31, "Pop");
        playlist.addLagu("Let Her Go", "Passenger", 2012, 4, 12, "Folk Rock");
        playlist.addLagu("See You Again", "Wiz Khalifa ft. Charlie Puth", 2015, 3, 49, "Hip Hop");
        playlist.addLagu("Blinding Lights", "The Weeknd", 2019, 3, 22, "Pop");
        playlist.addLagu("Shape of You", "Ed Sheeran", 2017, 3, 53, "Pop");
        playlist.addLagu("Stay", "The Kid LAROI & Justin Bieber", 2021, 2, 21, "Pop");
        playlist.addLagu("Someone Like You", "Adele", 2011, 4, 45, "Pop");
        playlist.addLagu("Levitating", "Dua Lipa", 2020, 3, 23, "Pop");
        playlist.addLagu("Rolling in the Deep", "Adele", 2010, 3, 49, "Pop");
        playlist.addLagu("Bad Guy", "Billie Eilish", 2019, 3, 14, "Pop");
        playlist.addLagu("Memories", "Maroon 5", 2019, 3, 9, "Pop");
        playlist.addLagu("Counting Stars", "OneRepublic", 2013, 4, 17, "Pop Rock");
        playlist.addLagu("Perfect", "Ed Sheeran", 2017, 4, 23, "Pop");
        playlist.addLagu("Uptown Funk", "Mark Ronson ft. Bruno Mars", 2014, 4, 30, "Funk Pop");
        playlist.addLagu("Havana", "Camila Cabello", 2018, 3, 37, "Pop");
        playlist.addLagu("Cheap Thrills", "Sia", 2016, 3, 31, "Pop");
        playlist.addLagu("Closer", "The Chainsmokers ft. Halsey", 2016, 4, 5, "EDM");
        playlist.addLagu("Love Story", "Taylor Swift", 2008, 3, 57, "Country Pop");
        playlist.addLagu("Numb", "Linkin Park", 2003, 3, 7, "Rock");
        playlist.addLagu("Can't Stop the Feeling!", "Justin Timberlake", 2016, 3, 56, "Pop");
        playlist.addLagu("Believer", "Imagine Dragons", 2017, 3, 24, "Rock");
        playlist.addLagu("Toxic", "Britney Spears", 2003, 3, 19, "Pop");
        playlist.addLagu("Senorita", "Shawn Mendes & Camila Cabello", 2019, 3, 11, "Pop");
        playlist.addLagu("Photograph", "Ed Sheeran", 2014, 4, 18, "Pop");
        playlist.addLagu("Viva La Vida", "Coldplay", 2008, 4, 2, "Alternative");
        playlist.addLagu("Rockstar", "Post Malone ft. 21 Savage", 2017, 3, 38, "Hip Hop");
        playlist.addLagu("Thinking Out Loud", "Ed Sheeran", 2014, 4, 41, "Pop");
        playlist.addLagu("Don't Let Me Down", "The Chainsmokers ft. Daya", 2016, 3, 28, "EDM");
        playlist.addLagu("Shake It Off", "Taylor Swift", 2014, 3, 39, "Pop");
        playlist.addLagu("Old Town Road", "Lil Nas X", 2019, 2, 37, "Country Rap");
        playlist.addLagu("Faded", "Alan Walker", 2015, 3, 32, "EDM");
        playlist.addLagu("Dance Monkey", "Tones and I", 2019, 3, 29, "Pop");
        playlist.addLagu("All of Me", "John Legend", 2013, 4, 29, "Pop");
        playlist.addLagu("Kangen", "Dewa 19", 1992, 5, 25, "Rock");
        playlist.addLagu("Sampai Jadi Debu", "Banda Neira", 2013, 4, 5, "Indie");
        playlist.addLagu("Sesuatu di Jogja", "Adhitia Sofyan", 2016, 4, 15, "Folk");
        playlist.addLagu("Kasih Tak Sampai", "Padi", 2001, 4, 52, "Rock");
        playlist.addLagu("Akad", "Payung Teduh", 2017, 4, 4, "Pop");
        playlist.addLagu("Pelangi", "Efek Rumah Kaca", 2007, 4, 45, "Indie");
        playlist.addLagu("Biru", "Efek Rumah Kaca", 2007, 3, 50, "Indie");
        playlist.addLagu("Stasiun Balapan", "Didi Kempot", 1999, 4, 42, "Campursari");
        playlist.addLagu("Mungkin Nanti", "Peterpan", 2004, 4, 3, "Pop Rock");
        playlist.addLagu("Cinta Luar Biasa", "Andmesh Kamaleng", 2019, 4, 23, "Pop");
        playlist.addLagu("Separuh Aku", "Noah", 2012, 4, 20, "Pop Rock");
        playlist.addLagu("Adu Rayu", "Yovie & Nuno ft. Tulus, Glenn Fredly", 2019, 4, 18, "Pop");
        playlist.addLagu("Menunggumu", "Peterpan ft. Chrisye", 2004, 4, 3, "Pop Rock");
        playlist.addLagu("Berharap Tak Berpisah", "Reza Artamevia", 2002, 4, 25, "Pop");
        playlist.addLagu("Kisah Kasih di Sekolah", "Chrisye", 2002, 4, 11, "Pop");
        playlist.addLagu("Jangan Menyerah", "D'Masiv", 2009, 4, 39, "Pop");
        playlist.addLagu("Bento", "Iwan Fals", 1989, 4, 36, "Rock");
        playlist.addLagu("Risalah Hati", "Dewa 19", 2000, 5, 3, "Rock");
        playlist.addLagu("Juwita Malam", "Slank", 2007, 3, 40, "Pop Rock");
        playlist.addLagu("Laskar Pelangi", "Nidji", 2008, 5, 7, "Pop Rock");
        playlist.addLagu("Meraih Bintang", "Via Vallen", 2018, 4, 8, "Dangdut");
        playlist.addLagu("Bidadari Tak Bersayap", "Anji", 2018, 4, 23, "Pop");
        playlist.addLagu("Cinta Pertama dan Terakhir", "Sherina", 2009, 4, 13, "Pop");
        playlist.addLagu("To the Bone", "Pamungkas", 2020, 5, 12, "Indie Pop");
        playlist.addLagu("Dia", "Anji", 2016, 3, 37, "Pop");
        playlist.addLagu("Pupus", "Dewa 19", 2000, 5, 6, "Rock");
        playlist.addLagu("A Whole New World", "Zayn Malik & Zhavia Ward", 2019, 4, 2, "Soundtrack");
        playlist.addLagu("Rewrite the Stars", "Zac Efron & Zendaya", 2018, 3, 37, "Soundtrack");
        playlist.addLagu("Rewrite the Stars", "James Arthur & Anne-Marie", 2018, 3, 47, "Pop");
        playlist.addLagu("Say You Won't Let Go", "James Arthur", 2016, 3, 31, "Pop");
        playlist.addLagu("Let Her Go", "Passenger", 2012, 4, 12, "Folk Rock");
        playlist.addLagu("See You Again", "Wiz Khalifa ft. Charlie Puth", 2015, 3, 49, "Hip Hop");

        playlist.tampilkanPlaylist();
    }
}
