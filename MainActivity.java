package info.makanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private  void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan,namaMakanan,infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){

        namaMakanan.add("Mie kocok bandung");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Mie-kocok-bandung.jpg");
        infoMakanan.add("Makanan pertama yang menjadi salah satu makanan khas dari negara ini adalah mie kocok bandung. Mie kocok merupakan makanan khas dari kota bandung yang memiliki rasa segar, gurih, dan juga nikmat. Salah satu mangkuk mie kocok anda akan menemukan beberapa bahan makanan seperti mie gepeng, sayur tauge, dan juga potongan kikil. Makanan ini akan memberikan anda pengalaman menikmati mie yang sangat khas. Kelezatan makanan ini sudah sangat terkenal di banyak wilayah. Jika anda sedang berkunjung ke kota bandung sebaiknya mencoba mencicipi makanan yang satu ini. Banyak dari masyarakat bandung bahkan dari luar daerah yang sangat menyukai mie kocok. ");

        namaMakanan.add("Ayam betutu Bali");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/ayam-betutu-bali.jpg");
        infoMakanan.add("Makanan berikutnya yang masuk sebagai salah satu makanan khas nusantara yang lezat adalah ayam betutu Bali. Makanan ini sangat khas Indonesia karena kaya akan rempah-rempah. Cara masak ayam ini sangat unik sehingga menjadikan rasanya terasa berbeda dengan makanan dengan bahan ayam lainnya. Cara memasak ayam betutu ini adalah dengan ayam utuh yang di beri bumbu special kemudian dibakar. Makanan ini merupakan makanan khas dari pulau bali. Rasa ayam yang lembut dan juga kaya akan rempah akan membuat pengalaman anda selama di bali semakin terasa lengkap dan tak terlupakan. ");

        namaMakanan.add("Papeda irian jaya");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Papeda-irian-jaya.jpg");
        infoMakanan.add("Makanan khas nusantara yang selanjutnya adalah papeda. Makanan ini begitu unik karena memiliki tekstur seperti lem yang lengket. Bahan utama dari papeda adalah sagu yang dimasak dengan air. Meskipun tawar namun papeda akan terasa sangat nikmat apabila dinikmati dengan sayur atau pelengkap seperti ikan bumbu kuning, sambal, gulai dan yang lainnya. Anda yang belum pernah merasakannya sebaiknya mencoba untuk mencicipi papeda. Sebagai makanan tradisional khas dari papua, papeda memiliki kandungan karbohidrat yang tinggi sehingga akan sangat mengenyangkan sama seperti makan nasi. ");

        namaMakanan.add("Rendang padang");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Rendang-padang.jpg");
        infoMakanan.add("Makanan yang sangat popular di Indonesia bahkan di dunia adalah rendang. Rendang merupakan makanan khas dari padang yang memiliki rasa begitu menggugah selera. Rendah menjadi salah satu makanan paling enak didunia karena memang rasanya begitu meninggalkan bekas di lidah dan dihati. Bahan yang digunakan untuk membuat makanan ini adalah daging sapi yang dimasak lama dengan bumbu rempah yang kaya. Anda tentu saja sudah sangat mengenal rasa dari rendang karena banyak dijual dirumah makan padang, restoran modern bahkan banyak restoran luar negeri yang juga menjual makanan ini. ");

        prosesRecyclerViewAdapter();

    }
}
