package xyz.fadh.praktikumelektronika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Module> modules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvModules = (RecyclerView) findViewById(R.id.rvModule);

        modules = Module.createModuleList();
        ModuleAdapter adapter = new ModuleAdapter(this, modules);
        rvModules.setAdapter(adapter);
        rvModules.setLayoutManager(new LinearLayoutManager(this));
    }
}
