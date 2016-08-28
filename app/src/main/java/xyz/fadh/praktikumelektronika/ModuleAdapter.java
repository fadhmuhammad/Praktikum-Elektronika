package xyz.fadh.praktikumelektronika;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fadhl on 8/27/2016.
 * Tutorial : http://guides.codepath.com/android/Using-the-RecyclerView
 */
public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView noTextView;
        public TextView nameTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imgModule);
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
        int noImage= R.drawable.modul1;
        switch (position){
            case 0:
                noImage = R.drawable.modul1;
                break;
            case 1:
                noImage = R.drawable.modul2;
                break;
            case 2:
                noImage = R.drawable.modul3;
                break;
            case 3:
                noImage = R.drawable.modul4;
                break;
            case 4:
                noImage = R.drawable.modul5;
                break;
            case 5:
                noImage = R.drawable.modul6;
                break;
            case 6:
                noImage = R.drawable.modul7;
                break;
            case 7:
                noImage = R.drawable.modul8;
                break;
            case 8:
                noImage = R.drawable.modul9;
                break;
        }

        ImageView imgModul = viewHolder.imageView;
        imgModul.setImageResource(noImage);
        TextView notextView = viewHolder.noTextView;
        notextView.setText("Modul " + module.number);
        TextView nametextView = viewHolder.nameTextView;
        nametextView.setText(module.name);
    }

    public int getItemCount() {
        return modules.size();
    }
}