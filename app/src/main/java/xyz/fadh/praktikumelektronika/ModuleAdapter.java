package xyz.fadh.praktikumelektronika;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fadhl on 8/27/2016.
 * Tutorial : http://guides.codepath.com/android/Using-the-RecyclerView
 */
public class ModuleAdapter extends ArrayAdapter<Module> {
    public ModuleAdapter(Context context, ArrayList<Module> modules) {
        super(context, 0, modules);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Module module = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_module, parent, false);
        }

        TextView tvNumber = (TextView) convertView.findViewById(R.id.tvNumber);
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);

        tvNumber.setText("Modul " + module.number);
        tvName.setText(module.name);

        return convertView;
    }
}
