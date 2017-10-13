package resepmakanan.resepmakanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep = (RecyclerView) findViewById(R.id.list_resep);

        adapter = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("pecel", "nikmatnya makanan tradisional mengandung banyak vitamin",
                "<b>Bahan Dasar :</b><br>" +
                        "2 ikat daun singkong<br>"+
                         "2 ikat daun pepaya<br>"+
                        "1 ikat kacang panjang<br>"+
                        "1 bks tauge<br>"+
                        "1 sendok teh gula<br>" +
                        "Minyak untuk menumis<br>" +
                         "<b>Langkah Pembuatan :</b><br>" +
                        "Rebus semua sayuran.<br>"+

                "Goreng kacang tanah,cabe, bawang merah+ bawang putih.kemudian haluskan bersama daun jeruk dan gula merah.masukan garam dan asam.tes rasa,bumbu siap dihidangkan bersama sayuran.<br>"
                , "pecel"));

        dataResep.add(new Resep("pepes tahu salmon sayur", "pepes tahu salmon sayur merupakan makanan yang kaya akan protein",
                "<b>Bahan Dasar :</b><br>" +
                        "1 buah tahu cina - hancurkan<br>"+
                        "1 potong ikan salmon - hancurkan/cincang halus<br>"+
                        "Segenggam kangkung / sayuran lainnya - siangi dengan di iris"+
                        "2 buah telur<br>"+
                        "4 lembar daun jeruk<br>" +
                        "300 gram tauge<br>" +
                        "300 mie soun<br>" +
                        "2 lembar daun salam<br>" +
                        "2 batang daun bawang<br>" +
                        "garam secukupnya<br>" +
                        "<br>" +
                        "<b>Langkah langkah :</b><br>" +
                        "Siapkan/ panaskan kukusan<br>"+
                        "Setelah tahu dan salmon dihancurkan, masukkan kangkung yg sudah di iris. Campur dengan semua bumbu + telur. Aduk rata.<br>"+
                "Masukkan ke dalam daun pisang.<br>"+
                "Kukus hingga matang. Kurang lebih 20-30 menit."
                , "pepes"));

        dataResep.add(new Resep("pindang", "makanan tradisional khas indonesia yang kaya akan protein",
                "<b>Bahan Dasar :</b><br>" +
                        "1 ekor ikan lais segar<br>"+
                           "4 ekor udang bago besar<br>"+
                        "3 gls air<br>"+
                        "15 buah cabe merah keriting<br>"+
                        "15 butir bawmer<br>"+
                        "1/4 buah Nanas, diparut<br>"+
                        "Garam, gula, terasi<br>"+
                        "seukuran jempol jahe digeprek<br>" +
                        "3 lembar daun jeruk<br>" +
                        "1/2 sdt garam<br>" +
                        "50 ml kecap manis<br>" +
                        "2 sdm minyak goreng<br>" +
                        "<br>" +
                        "<b>Langkah langkah :</b><br>" +
                        "Bersihkan ikan, potong 4-5<br>"+
                "Didihkan air, masukkan cabe merah dan bawmer yg telah dihaluskan. Tambahkan lengkuas, salam, n sereh. Biarkan sampai bumbu matang.<br>"+
                "Masukkan ikan, parutan nenas, asam jawa, gula, garam, dan terasi. Biarkan mendidih selama 15 menit lalu masukkan udang, tomat, dan daun bawang masak lagi 5 menit, matikan api, angkat, hidangkan hangat.<br>"+
                "Pelengkap nasi putih, sambal terasi n lalapan. Hm"
                , "pindang"));
        dataResep.add(new Resep("Sate jamur", "sate nabati yang menyhatkan badan",
                "<b>Bahan Dasar :</b><br>" +
                        "10 buah jamur uk besar<br>"+
                "Bumbu halus :"+
        "3 sdm kecap manis<br>" +
                "1 buah kemiri sangrai<br>"+
        "3 buah cabe rawitm<br>" +
        "1 sdt ketumbar<br>" +
        "Secukupnya garam dan kaldu bubuk<br>"+
                        "1/2 buah gula jawa<br>" +
                        "2 batang asam jawa<br>" +
                        "seukuran jempol jahe digeprek<br>" +
                        "3 lembar daun jeruk<br>" +
                        "1/2 sdt garam<br>" +
                        "50 ml kecap manis<br>" +
                        "2 sdm minyak goreng<br>" +
                        "<br>" +
                        "<b>Langkah Langkah :</b><br>" +

                       " Cuci bersih jamur...rebus hanya agar lunglai...setelah itu peras dan suir<br>"+

        "Haluskan bumbu...kemudian baluri dengan bumbu diamkan 15 menit agar meresap<br>"+

        "Kemudian bakar sambil diolesi bumbu oles...siap dinikmati...<br>"
                , "sate_jamur"));
    }
}
