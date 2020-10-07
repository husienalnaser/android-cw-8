package com.example.pokemon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pokemonadapter extends RecyclerView.Adapter {

    ArrayList<pokemons> pArray;
    Context context;

    public pokemonadapter(ArrayList<pokemons> pArray, Context context) {
        this.pArray = pArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final int img=pArray.get(position).getImage();
        final String name=pArray.get(position).getName();
        final String total=pArray.get(position).getTotal()+"";
        final String type=pArray.get(position).getType();
        final String attack=pArray.get(position).getAttack()+"";
        final String defence=pArray.get(position).getDefence()+"";
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder)holder).img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,info.class);
                intent.putExtra("image",img);
                intent.putExtra("name",name);
                intent.putExtra("total",total);
                intent.putExtra("type",type);
                intent.putExtra("attack",attack);
                intent.putExtra("defence",defence);





                context.startActivity(intent);


            }
        });
        ((ViewHolder)holder).name.setText(pArray.get(position).getName());
        ((ViewHolder)holder).total.setText(pArray.get(position).getTotal()+"");
        ((ViewHolder)holder).type.setText(pArray.get(position).getType());


    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView name;
        public TextView total;
        public TextView type;
        public TextView attack;
        public TextView defence;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;
            img=itemView.findViewById(R.id.imageView);
            name=itemView.findViewById(R.id.textView);
            total=itemView.findViewById(R.id.textView3);
            type=itemView.findViewById(R.id.textView5);



        }
    }
}
