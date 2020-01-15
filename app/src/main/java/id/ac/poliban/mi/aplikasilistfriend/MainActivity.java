package id.ac.poliban.mi.aplikasilistfriend;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import id.ac.poliban.aplikasilistfriend.R;

@SuppressWarnings("Covert2Lambda")
public  class MainActivity extends AppCompatActivity {
    private String[] friend = {"Ahmad Irfan", "Ahkmad Indrawan", "Andre Ramadhandy", "Andri Sudarman", "Diana",
            "Gina Melati Addini", "Iffa Nafiatunnisa", "Lidya Lusiana", "Melisa Arianie",
            "Muhamad Ade Setiawan", "Purnama", "Radhika Rahmadani", "Rafi'i Hidayat Nor",
            "Renaldy Kambayu", "Sarwan", "Thasya Ismyanti Novianda", "Yunita Rahmah",
            "Rezal Alfansyah", "Agustya Fazriani", "Ratu Hana Yunita", "Rizky Maulana",
            "Radianysah", "Taufan Ryanda Utama", "Magfirah Maulidya"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, friend);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener (){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Telah terpilih "+friend[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
