package xyz.fadh.praktikumelektronika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Module> modules = new ArrayList<Module>();
        ModuleAdapter adapter = new ModuleAdapter(this, modules);

        adapter.add(new Module(1,"Dasar Pengukuran"));
        adapter.add(new Module(2,"Simulasi Rangkaian Elektronika"));
        adapter.add(new Module(3,"Rangkaian Dioda"));
        adapter.add(new Module(4,"Transistor"));
        adapter.add(new Module(5,"Filter Pasif"));
        adapter.add(new Module(6,"Penguat Daya"));
        adapter.add(new Module(7,"Operational Amplifier"));
        adapter.add(new Module(8,"Elektronika Digital"));
        adapter.add(new Module(9,"Pengenalan CadSoft Eagle"));

        ListView listView =  (ListView) findViewById(R.id.lvModule);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3)
            {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
               startActivity(intent);
            }
        });
    }
}
