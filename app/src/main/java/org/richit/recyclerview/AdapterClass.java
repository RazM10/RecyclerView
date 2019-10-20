package org.richit.recyclerview;

import android.view.View;
import android.view.ViewGroup;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder{

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
