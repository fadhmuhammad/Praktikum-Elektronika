package xyz.fadh.praktikumelektronika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Module> modules = new ArrayList<Module>();

        modules.add(new Module(1,"Dasar Pengukuran"));
        modules.add(new Module(2,"Simulasi Rangkaian Elektronika"));
        modules.add(new Module(3,"Rangkaian Dioda"));
        modules.add(new Module(4,"Transistor"));
        modules.add(new Module(5,"Filter Pasif"));
        modules.add(new Module(6,"Penguat Daya"));
        modules.add(new Module(7,"Operational Amplifier"));
        modules.add(new Module(8,"Elektronika Digital"));
        modules.add(new Module(9,"Pengenalan CadSoft Eagle"));

        ModuleAdapter adapter = new ModuleAdapter(this, modules);
        RecyclerView recyclerView =  (RecyclerView) findViewById(R.id.rvItems);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(
                new ItemClickSupport.OnItemClickListener(){
                    @Override
                    public void onItemClicked(RecyclerView mRecycleView, int position, View v){
                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                        intent.putExtra("module", position);
                        startActivity(intent);
                    }
                }
        );
    }
}