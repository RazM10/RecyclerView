package org.richit.recyclerview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolderClass> {

    private String[] data;
    private List<Person> personList;

    public AdapterClass(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        String title = personList.get(position).getName();
        holder.title_tv.setText(title);

        holder.linearLayoutParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {

        ImageView imgIcon;
        TextView title_tv;
        LinearLayout linearLayoutParent;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);

            imgIcon = itemView.findViewById(R.id.imgIcon);
            title_tv = itemView.findViewById(R.id.title_tv);
            linearLayoutParent = itemView.findViewById(R.id.itemParent);
        }
    }
}
