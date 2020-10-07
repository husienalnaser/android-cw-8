package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemons> pokeball=new ArrayList<>();
        pokemons p1=new pokemons("bulbasaur",R.drawable.bulbasaur,49,49,318,"grass");
        pokemons p2=new pokemons("ivysaur",R.drawable.ivysaur,62,63,405,"grass");
        pokemons p3=new pokemons("pidgeot",R.drawable.pidgeot,80,75,479,"flying");
        pokemons p4=new pokemons("blastoise",R.drawable.blastoise,83,100,530,"water");
        pokemons p5=new pokemons("rattata",R.drawable.rattata,56,35,253,"normal");
        pokemons p6=new pokemons("Charmander",R.drawable.charmander,56,35,309,"fire");
        pokemons p7=new pokemons("metapod",R.drawable.metapod,56,35,205,"normal");
        pokemons p8=new pokemons("pikachu",R.drawable.pikachu,56,35,320,"electric");
        pokemons p9=new pokemons("golbat",R.drawable.golbat,56,35,455,"poison");
        pokemons p10=new pokemons("venomoth",R.drawable.venomoth,56,35,450,"bug");


        pokeball.add(p1);
        pokeball.add(p2);
        pokeball.add(p3);
        pokeball.add(p4);
        pokeball.add(p5);
        pokeball.add(p6);
        pokeball.add(p7);
        pokeball.add(p8);
        pokeball.add(p9);
        pokeball.add(p10);


        RecyclerView recyclerView=findViewById(R.id.recyclerview);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        recyclerView.addItemDecoration(new DividerItemDecoration(getBaseContext(),DividerItemDecoration.VERTICAL));



        pokemonadapter p=new pokemonadapter(pokeball,this);
        recyclerView.setAdapter(p);




    }
}