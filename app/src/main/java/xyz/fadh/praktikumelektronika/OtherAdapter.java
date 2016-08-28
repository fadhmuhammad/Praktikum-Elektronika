package xyz.fadh.praktikumelektronika;

/**
 * Created by fadhl on 8/28/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class OtherAdapter extends RecyclerView.Adapter<OtherAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView nameTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imgOther);
            nameTextView = (TextView) itemView.findViewById(R.id.tvOther);
        }
    }

    private List<Other> others;
    private Context context;


    public OtherAdapter(Context mContext, List<Other> mOther) {
        others = mOther;
        context = mContext;
    }

    private Context getContext() {
        return context;
    }

    public OtherAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);

        View moduleView = inflater.inflate(R.layout.item_other, parent, false);

        ViewHolder viewHolder = new ViewHolder(moduleView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(OtherAdapter.ViewHolder viewHolder, int position) {
        Other other = others.get(position);
        int noImage= R.drawable.modul1;
        switch (position){
            case 0:
                noImage = R.drawable.icon1;
                break;
            case 1:
                noImage = R.drawable.icon2;
                break;
            case 2:
                noImage = R.drawable.icon3;
                break;
        }

        ImageView imgothers = viewHolder.imageView;
        imgothers.setImageResource(noImage);
        TextView nametextView = viewHolder.nameTextView;
        nametextView.setText(other.name);
    }

    public int getItemCount() {
        return others.size();
    }
}
