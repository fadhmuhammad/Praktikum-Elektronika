package xyz.fadh.praktikumelektronika;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_module extends Fragment {


    public fragment_module() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_module, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        ArrayList<Module> modules = new ArrayList<Module>();
        final ModuleAdapter adapter = new ModuleAdapter(this.getContext(), modules);

        adapter.add(new Module(1,"Dasar Pengukuran"));
        adapter.add(new Module(2,"Simulasi Rangkaian Elektronika"));
        adapter.add(new Module(3,"Rangkaian Dioda"));
        adapter.add(new Module(4,"Transistor"));
        adapter.add(new Module(5,"Filter Pasif"));
        adapter.add(new Module(6,"Penguat Daya"));
        adapter.add(new Module(7,"Operational Amplifier"));
        adapter.add(new Module(8,"Elektronika Digital"));
        adapter.add(new Module(9,"Pengenalan CadSoft Eagle"));

        ListView listView =  (ListView) view.findViewById(R.id.lvModule);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3)
            {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("module", position);
                intent.putExtra("name",adapter.getItem(position).name);
                startActivity(intent);
            }
        });
    }

}
