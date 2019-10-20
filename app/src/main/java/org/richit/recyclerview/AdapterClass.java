package org.richit.recyclerview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolderClass> {

    private String[] data;
    public AdapterClass(String[] data){
        this.data=data;
    }
    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        String title=data[position];
        holder.title_tv.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView title_tv;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);

            imgIcon=itemView.findViewById(R.id.imgIcon);
            title_tv=itemView.findViewById(R.id.title_tv);
        }
    }
}
