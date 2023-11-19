package com.example.mulyani.resepmakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RvResep);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);

        int[] imgGambar = {R.drawable.ayambetutu,
                R.drawable.ayamgulai,
                R.drawable.ayamkecap,
                R.drawable.ayamkemangi,
                R.drawable.ayamoporkuning,
                R.drawable.ayamrica,
                R.drawable.ayamrujak,
                R.drawable.ayamsop,
                R.drawable.ayamwoku,
                R.drawable.ayamyogurt};

        String[] namaJudul = {"Ayam Betutu Bali",
                "Gulai Ayam",
                "Ayam Kecap",
                "Ayam Kemangi",
                "Opor Ayam Bumbu Kuning",
                "Ayam Rica-Rica",
                "Ayam Goreng Bumbu Rujak",
                "Sop Ayam",
                "Ayam Woku",
                "Ayam Yoghurt"};

        String[] namaDeskripsi = {"Ayam betutu memiliki rasa yang sangat enak dan lezat dengan citarasa yang cukup pedas . karena ayam betutu sendiri juga dimasak seperti masakan khas bali pada umumnya . yaitu menggunakan bumbu cabai yang cukup banyak lalu di masak berbarengan dengan ayam sehingga bumbu meresap ke dalam",
                "Gulai ayam merupakan salah satu kreasi masakan asli khas Nusantara yang dimasak dengan bumbu gulai. Masakan dengan kuah kuning ini terbuat dari bahan-bahan seperti kunyit, jahe, kemiri, jintan, bawang merah, bawang putih, bawang merah, lengkuas dan bahan lainnya",
                "Menu ayam kecap merupakan menu yang banyak digemari juga oleh banyak orang. Rasanya yang manis dengan bumbu kecap yang meresap ke dalam daging ayam membuatnya begitu lezat untuk dinikmati",
                "Salah satu masakan dengan daging ayam adalah ayam kemangi. Kemangi adalah tumbuhan yang daunnya dapat dimakan sebagai lalap serta memiliki aroma yang khas",
                "Masakan ayam dengan ciri khas berkuah kental dari santan serta perpaduan bumbu dan rempah ini merupakan menu khas nusantara yang tidak hanya populer di pulau Jawa",
                "Ayam rica-rica merupakan salah satu masakan khas Manado, Sulawesi Utara, yang terkenal dengan cita rasa pedasnya. ",
                "Teksturnya yang cukup empuk dan rasanya lezat kerap kali diolah menjadi maskaan yang gurih dan lezat untuk disantap. Rasanya berpadu antara lezat, pedas dan gurih sehingga semakin membuat orang ketagihan untuk menikmatinya.",
                "Sop ayam yang masih hangat, cocok disantap dengan nasi, apalagi dibuat untuk menu hidangan buka puasa, rasanya yang gurih, enak, dan lezat akan tercium dari aroma sop ayam.",
                "Ayam woku adalah satu kuliner yang berasal dari Manado, dimana bumbu woku yang di gunakan sangat khas dan kaya akan rempah-rempah asli Nusantara.",
                "Masakan dengan olahan ayam dan yoghurt yang lezat dan tetap dengan kalori rendah. "};

        String[] bahanResep = {"•\tAyam kampung utuh 1 ekor ( atau 1 1/2 kilo gram )\n" +
                "•\tSerai 2 batang ( ambil bagian putihnya , lalu memarkan )\n" +
                "•\tDaun salam 2 lembar\n" +
                "•\tDaun pisang secukupnya ( digunakan untuk membungkus )\n" +
                "•\tAluminium foil\n" +
                "•\tMinyak 80 mili liter ( digunakan untuk menumis )\n" +
                "•\tCabai merah 15 buah ( dibuang bijinya )\n" +
                "•\tJahe 4 centi meter\n" +
                "•\tKunyit 4 centi meter ( dibakar )\n" +
                "•\tLengkuas 4 centi meter\n" +
                "•\tSerai 2 batang ( ambil bagian putihnya saja )\n" +
                "•\tBawang merah 100 gram\n" +
                "•\tBawang putih 6 siung\n" +
                "•\tKetumbar bubuk 1 sendok teh\n" +
                "•\tKemiri 4 butir ( di goreng atau sangrai )\n" +
                "•\tDaun jeruk purut 4 lembar\n" +
                "•\tMerica hitam 1/2 sendok teh\n" +
                "•\tGaram 2 sedok teh\n",

                "•\tAyam 500 gram (potong-potong sesuai selera)\n" +
                "•\tDaun kunyit 1 lembar\n" +
                "•\tDaun jeruk 2 lembar (sobek-sobek)\n" +
                "•\tLengkuas 3 centi meter (memarkan)\n" +
                "•\tSerai 1 batang\n" +
                "•\tAsam jawa 1/2 sendok teh\n" +
                "•\tGula merah 1/2 sendok teh\n" +
                "•\tCengkeh 2 butir\n" +
                "•\tKayu manis 3 centi meter\n" +
                "•\tSantan 400 mili liter (dari 1/4 butir kelapa)\n" +
                "•\tBawang merah 5 butir\n" +
                "•\tBawang putih 2 siung\n" +
                "•\tCabai merah 7 buah\n" +
                "•\tKemiri 2 butir (sangrai)\n" +
                "•\tJintan 1/2 sendok teh (sangrai)\n" +
                "•\tKunyit 2 centi meter\n" +
                "•\tJahe 2 centi meter\n" +
                "•\tKetumbar 1/2 sendok teh (sangrai)\n" +
                "•\tMerica bubuk 1/2 sendok teh\n" +
                "•\tGaram 1 sendok teh\n" +
                "•\tGula pasir 1 1/2 sendok teh\n",

                "•\t1/2 ekor ayam, potong 6 bagian, tambahkan 1/2 sendok teh garam dan 2 sendok makan air jeruk nipis, aduk rata\n" +
                "•\t4 siung bawang putih, memarkan\n" +
                "•\t1/2 ruas jari jahe, memarkan\n" +
                "•\t1/2 butir bawang bombai, potong panjang\n" +
                "•\t2 tangkai daun bawang, potong serong\n" +
                "•\t5 sendok makan Kecap Bango Manis Pedas Gurih\n" +
                "•\t1/2 sendok teh lada putih bubuk\n" +
                "•\t1/4 sendok teh garam\n" +
                "•\t1 buah tomat, potong panjang\n" +
                "•\t100 ml air\n" +
                "•\tMinyak goreng secukupknya untuk menggoreng\n" +
                "•\t1 sendok makan margarin, untuk menumis\n",

                "•\t1 Ekor ayam (di potong kecil kecil)\n" +
                "•\t1/2 Butir kelapa parut / kara 65 ml\n" +
                "•\tKemangi (basil) segar 1 genggam \n" +
                "•\tDaun bawang 1 batang (potong serong)\n" +
                "•\tKemiri 6 butir\n" +
                "•\tBawang putih 3 siung\n" +
                "•\tKunyit 1 buah (yang agak tua)\n" +
                "•\tJahe 1 ruas jari (di memarkan)\n" +
                "•\tSereh 1 batang (di memarkan)\n" +
                "•\tCabe rawit merah 5 buah (bisa di tambah sesuai selera)\n" +
                "•\tCabe merah keriting 4 buah (bisa di tambah sesuai selera)\n" +
                "•\tGula putih 1/2 sendok makan\n" +
                "•\tGaram\n" +
                "•\tBumbu penyedap/maggi\n" +
                "•\tMinyak goreng.\n",

                "•\t500 gram daging ayam\n" +
                "•\t1 buah jeruk nipis\n" +
                "•\t2 lembar daun salam\n" +
                "•\t2 batang serai digeprek\n" +
                "•\t700 ml santan dari 250 gram kelapa parut\n" +
                "•\t1 sdt merica bubuk\n" +
                "•\t1 sdt garam\n" +
                "•\t1 sdt gula pasir\n" +
                "•\t1/2 sdt kaldu bubuk penyedap atau sesuai selera\n" +
                "•\t5 sdm minyak sayur\n" +
                "•\t4 butir kemiri\n" +
                "•\t6 butir bawang merah\n" +
                "•\t4 siung bawang putih\n" +
                "•\t1 sdm ketumbar\n" +
                "•\t1/2 sdt jinten\n" +
                "•\t20 cm kunyit/ kunir\n" +
                "•\t4 cm lengkuas\n",

                "•\t1 ekor ayam kampung, cuci bersih lalu potong menjadi 8 bagian\n" +
                "•\t1 sdt air perasan jeruk nipis\n" +
                "•\t1 ¾ sdt garam, atau sesuai kebutuhan\n" +
                "•\t½ sdt gula pasir, atau sesuai kebutuhan\n" +
                "•\t4 lembar daun jeruk, cuci bersih lalu buang tulang daunnya\n" +
                "•\t2 batang serai, cuci bersih lalu memarkan agar aromanya keluar\n" +
                "•\t300 ml air\n" +
                "•\tMinyak goreng atau minyak sayur secukupnya untuk menumis\n" +
                "•\t6 buah cabai merah, buang tangkainya\n" +
                "•\t1 buah tomat, cuci bersih\n" +
                "•\t8 siung bawang merah\n" +
                "•\t3 siung bawang putih\n" +
                "•\t2 cm jahe ukuran sedang, kupas kulit luarnya\n",

                "•\t1 ekor Ayam, bersihkan, potong-potong sesuai selera\n" +
                "•\t500 ml Santan kental\n" +
                "•\t2 batang Sereh, keprek\n" +
                "•\t2 lembar Daun salam\n" +
                "•\t1 ruas Lengkuas, iris tipis/memarkan\n" +
                "•\t1 sendok makan Air asam, kental\n" +
                "•\tsecukupnya Garam\n" +
                "•\tsecukupnya Gula jawa/gula pasir\n" +
                "•\t8 siung Bawang merah\n" +
                "•\t4 siung Bawang putih\n" +
                "•\t6 buah Cabe merah, buang biji\n" +
                "•\t6 butir Kemiri, sangrai\n",

                "•\t1 ekor ayam kampung\n" +
                "•\tBawang seledri atau daun bawang (sesuai selera)\n" +
                "•\t2 buah tomat segar\n" +
                "•\t3 buah kentang\n" +
                "•\t1 buah wortel\n" +
                "•\t3 buah bawang putih\n" +
                "•\t1 sdm garam\n" +
                "•\t½ sdt merica\n" +
                "•\t½ sdm penyedap rasa (tambahan)\n" +
                "•\t1L air bersih\n" +
                "•\tBawang goreng (tambahan)\n",

                "•\t1 ekor Ayam, potong 8\n" +
                "•\t2 buah Jeruk nipis\n" +
                "•\t1 batang serai, iris\n" +
                "•\t4 lembar Daun jeruk, iris\n" +
                "•\t2 buah Tomat\n" +
                "•\t1 ikat Daun Kemangi\n" +
                "•\t2 batang Daun Bawang\n" +
                "•\t1 lembar Daun Kunyit\n" +
                "•\t1 lembar Daun Pandan\n" +
                "•\t1 sdt Garam\n" +
                "•\t1 sdt Lada hitam\n" +
                "•\t1 sdm Gula\n" +
                "•\t5 buah Cabai rawit merah\n" +
                "•\t5 butir Bawang merah\n" +
                "•\t1 ruas Kunyit\n" +
                "•\t2 ruas Jahe\n" +
                "•\t2 butir Kemiri sangrai\n",

                "•\t1 kg ayam\n" +
                "•\t4 gelas kaldu ayam\n" +
                "•\t2 bawang bombay\n" +
                "•\t4 siung bawang putih\n" +
                "•\t¾ gelas tepung terigu\n" +
                "•\t2 sdm margarin\n" +
                "•\t1 cangkir yoghurt tawar\n"};

        String[] caramembuat = {"1.\tBumbu : pertama-tama panaskan minyak goreng , tumis bumbu halus hingga harum dan matang . angkat .\n" +
                "2.\tSelanjutnya lumuri ayam dengan bumbu hingga terbalur rata , diamkan semalaman agar bumbu meresap .\n" +
                "3.\tSetelah itu tambahkan serai dan daun salam , bungkus dengan dau pisang , lalu bungkus kembali dengan aluminium foil .\n" +
                "4.\tKukus ayam ke dalam dandang panas selama 2 jam . angkat .\n" +
                "5.\tTerakhir panggang ayam dalam oven bersuhu 185 derajat celcius selama 20 menit atau sampai matang . angkat . Resep Ayam Betutu Bali Asli Lezat siap untuk disajikan dengan bahan pelengkap\n",

                "1.\tLangkah awal awal campur santan, bumbu halus dan semua bahan rempah lainnya kecuali ayam dalam panci atau wajan. Masak sambil terus diaduk sampai mendidih dan tercium aroma wangi gulai yang sedap.\n" +
                "2.\tSetelah itu masukkan ayam, masak kembali sambil terus diaduk sampai bumbu meresap dan santan mengental. Angkat.\n" +
                "3.\tResep Gulai Ayam Khas padang Sedap Makyuss siap disajikan. Mantap!!\n",

                "1.\tPanaskan minyak, goreng ayam dalam minyak panas hingga matang tapi tidak kering, angkat, sisihkan.\n" +
                "2.\tPanaskan margarin, tumis jahe dan bawang putih hingga harum, lalu masukkan bawang bombai, tumis hingga layu.\n" +
                "3.\tMasukkan ayam, aduk sebentar.\n" +
                "4.\tTambahkan Kecap Bango Manis Pedas Gurih, air, garam, lada, tumis hingga matang. Masukkan tomat dan daun bawang, aduk sebentar, angkat.\n" +
                "5.\tSajikan hangat.\n",

                "1.\tMasak air kira kira 1 liter, tambah garam 1 sendok teh. Setelah air menggolak masukan ayam, di rebus kira kira 10 menit. Lalu di angkat.\n" +
                "2.\tSetelah itu ayam di goreng setengah matang.\n" +
                "3.\tKemiri, bawang putih, kunyit di haluskan dan cabe di giling kasar.\n" +
                "4.\tBumbu di tumis sampai harum. Lalu masukan ayam sambil di aduk hingga bumbu menyatu dengan ayam.\n" +
                "5.\tMasukan air ke dalam tumisan ayam tadi kira kira 1 gelas. Tambahkan garam. gula dan penyedap.\n" +
                "6.\tSetelah itu masukan santan dan kemangi + daun bawang ( yang sudah di potong serong). Lalu di aduk aduk sebentar. Angkat. Dan siap untuk di sajikan. ;)\n",

                "1.\tPotong-potong daging ayam dan cuci bersih kemudian lumuri dengan air jeruk nipis selama 15 menit.\n" +
                "2.\tPanaskan minyak lalu tumis bumbu halus, daun salam dan serai hingga harum. Masukkan daging ayam, aduk-aduk lalu masak hingga berubah warna.\n" +
                "3.\tTuang santan, aduk-aduk serta beri garam, merica, kaldu bubuk dan gula pasir kemudian masak sampai daging ayam empuk sambil sesekali diaduk.\n" +
                "4.\tSetelah matang, angkat dan tuang dalam mangkuk saji dengan taburan bawang goreng di atasnya lalu siap untuk dihidangkan.\n",

                "1.\tLumuri daging ayam yang telah dipotong dengan campuran 1 sdt garam dan perasan jeruk nipis hingga merata. Lalu, diamkan selama sekitar 15 menit sampai meresap, sisihkan.\n" +
                "2.\tTumbuk kasar semua bahan untuk bumbu rica-rica. Siapkan penggorengan dan panaskan minyak lalu tumis bumbu yang telah ditumbuk kasar sampai harum. Tambahkan daun jeruk dan serai, lalu aduk kembali.\n" +
                "3.\tMasukkan daging ayam yang sudah disiapkan tadi ke dalam tumisan, aduk hingga berubah warna dan bumbunya meresap. Selanjutnya, tuangkan sisa garam dan gula pasir lalu kembali aduk hingga merata. \n" +
                "4.\tTuangkan air dan biarkan hingga bumbunya meresap. Aduk sesekali agar peresapannya maksimal lalu angkat.\n",

                "1.\tGoreng ayam yang sudah dipotong hingga matang\n" +
                "2.\tHaluskan bawang merah, bawang putih, cabe merah, kemiri. Tumis hingga matang dan harum.\n" +
                "3.\tMasukkan sereh, daun salam, lengkuas dan santan serta garam dan gula jawa/gula pasir.\n" +
                "4.\tMasak sampai santan menyusut airnya, tambahkan air asam, aduk.\n" +
                "5.\tMasukkan ayam yang sudah digoreng, lanjutkan memasak sambil sekali-sekali diaduk supaya bumbu merata/menyerap sampai berminyak.\n" +
                "6.\tBila suka, bisa melanjutkan memasak dengan memanggang ayam, sebelum disajikan. Tabur bawang goreng dan perciki air jeruk limau. Hmmmmmm.... sedap :)\n",

                "1.\tPotong ayam menjadi beberapa bagian sesuai selera (Anda dapat memisahkan bagian tulang dan daging jika diinginkan).\n" +
                "2.\tCuci kentang dan kupas kulitnya hingga bersih.\n" +
                "3.\tPotong kentang menjadi bagian-bagian kecil sesuai selera.\n" +
                "4.\tKupas wortel dan cuci hingga besih.\n" +
                "5.\tPotong wortel sesuai selera.\n" +
                "6.\tCuci tomat hingga bersih.\n" +
                "7.\tPotong tomat sesuai selera.\n" +
                "8.\tCuci bawang seledri atau daun bawang lalu iris.\n" +
                "9.\tPotong dan haluskan bawang putih.\n" +
                "10.\tTuang 1 liter air atau secukupnya dalam wadah.\n" +
                "11.\tMasukkan potongan ayam dan bawang putih dalam wadah dan godok selama kurang lebih setengah jam.\n" +
                "12.\tMasukkan kentang, tomat, wortel, daun seledri atau daun bawang.\n" +
                "13.\tTambahkan 1 sdm garam, ½ sdt merica, ½ sdm penyedap rasa (jika diinginkan).\n" +
                "14.\tBiarkan hingga kentang dan wortel menjadi empuk.\n" +
                "15.\tTuang isi dan kuah sop ayam dalam mangkok.\n" +
                "16.\tTambahkan bawang goreng jika perlu\n" +
                "17.\tSajikan \n",

                "1.\tHaluskan cabai rawit merah,bawang merah, jahe, kunyit, kemiri dan sedikit air.\n" +
                "2.\tPanaskan 3 sdm minyak lalu masukkan ayam dan bumbu yang telah dihaluskan tadi. Tambahkan iris daun jeruk, serai, daun pandan, daun kunyit, tomat dan air. Aduk rata, masak hingga mendidih.\n" +
                "3.\tBumbui dengan garam, gula dan merica. Tambahkan perasan jeruk nipis, daun kemangi dan daun bawang. Aduk hingga tercampur rata.\n" +
                "4.\tSajikan\n",

                "1.\tBersihkan ayam dan rebus sampai empuk.\n" +
                "2.\tJika sudah cukup lunak, angkat dan potong sesuai selera. Sisihkan.(Jangan buang air rebusan ya karena itu adalah air kaldu yang dibutuhkan.)\n" +
                "3.\tCampur yoghurt tawar dengan tepung terigu. Sisihkan selama ½ jam.\n" +
                "4.\tSetelah ½ jam, masukkan 4 gelas kaldu ayam ke dalamnya dan campur rata. Sisihkan.\n" +
                "5.\tPotong bawang bombay dan bawang putih. Panaskan margarin dan tumis sampai harum.\n" +
                "6.\tKemudian masukkan adonan tepung dan yoghurt yang telah dicampur dengan kaldu ayam. Kecilkan api dan masak sampai kental.\n" +
                "7.\tTaruh potongan ayam dalam piring, kemudian tuangkan saus yoghurt di atasnya.\n" +
                "8.\tSiap dihidangkan bersama taburan bawang goreng dan nasi hangat!\n"};

        ArrayList<ModelResep>resepList = new ArrayList<>();

        for (int i = 0; i<namaJudul.length; i++){
            ModelResep resep = new ModelResep(imgGambar[i],
                    namaJudul[i],
                    namaDeskripsi[i],
                    bahanResep[i],
                    caramembuat[i]);

            resepList.add(resep);

        }

        ResepAdapter resepAdapter = new ResepAdapter(this, resepList);
        recyclerView.setAdapter(resepAdapter);
    }
}
