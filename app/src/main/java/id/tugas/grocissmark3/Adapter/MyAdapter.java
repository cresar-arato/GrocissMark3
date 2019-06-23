package id.tugas.grocissmark3.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import id.tugas.grocissmark3.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder<view extends View> extends RecyclerView.ViewHolder{
        ImageView img_icon;
        TextView txt_description;
        public MyViewHolder(@NonNull view itemView){
        super(itemView);
        img_icon = (ImageView)itemView.findViewById(R.id.img_icon);
        txt_description = (TextView) itemView.findViewById(R.id.txt_description);
        }
    }
}
