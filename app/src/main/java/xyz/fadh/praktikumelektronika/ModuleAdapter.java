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
public class ModuleAdapter extends
        RecyclerView.Adapter<ModuleAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNumber;
        public TextView tvName;

        public ViewHolder(View itemView) {
            super(itemView);

            tvNumber = (TextView) itemView.findViewById(R.id.tvNumber);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
        }
    }

    private List<Module> mModules;
    private Context mContext;

    public ModuleAdapter(Context context, List<Module> modules) {
        mModules = modules;
        mContext = context;
    }

    private Context getmContext() {
        return mContext;
    }

    @Override
    public ModuleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View moduleView = inflater.inflate(R.layout.item_module, parent, false);

        ViewHolder viewHolder = new ViewHolder(moduleView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ModuleAdapter.ViewHolder viewHolder, int position){
        Module module = mModules.get(position);

        TextView noTextView = viewHolder.tvNumber;
        noTextView.setText("Modul " + module.getNumber());
        TextView nameTextView = viewHolder.tvName;
        nameTextView.setText(module.getName());
    }

    @Override
    public  int getItemCount(){
        return  mModules.size();
    }
}
