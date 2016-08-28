package xyz.fadh.praktikumelektronika;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fadhl on 8/27/2016.
 * Tutorial : http://guides.codepath.com/android/Using-the-RecyclerView
 */
public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView noTextView;
        public TextView nameTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            noTextView = (TextView) itemView.findViewById(R.id.tvNumber);
            nameTextView = (TextView) itemView.findViewById(R.id.tvName);
        }
    }

    private List<Module> modules;
    private Context context;


    public ModuleAdapter(Context mContext, List<Module> mModules) {
        modules = mModules;
        context = mContext;
    }

    private Context getContext() {
        return context;
    }

    public ModuleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);

        View moduleView = inflater.inflate(R.layout.item_module, parent, false);

        ViewHolder viewHolder = new ViewHolder(moduleView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ModuleAdapter.ViewHolder viewHolder, int position) {
        Module module = modules.get(position);

        TextView notextView = viewHolder.noTextView;
        notextView.setText("Modul " + module.number);
        TextView nametextView = viewHolder.nameTextView;
        nametextView.setText(module.name);
    }

    public int getItemCount() {
        return modules.size();
    }
}