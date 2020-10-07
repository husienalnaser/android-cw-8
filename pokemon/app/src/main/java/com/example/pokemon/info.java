package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ImageView iv=findViewById(R.id.iv);
        TextView name=findViewById(R.id.name6);
        TextView total=findViewById(R.id.total);
        TextView type=findViewById(R.id.type);
        TextView attack=findViewById(R.id.attack);
        TextView defence=findViewById(R.id.defence);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(info.this,MainActivity.class);
                startActivity(intent);
            }
        });


        Bundle b= getIntent().getExtras();
        iv.setImageResource(b.getInt("image"));
        name.setText(b.getString("name"));
        total.setText(b.getString("total"));
        type.setText(b.getString("type"));
        attack.setText(b.getString("attack"));
        defence.setText(b.getString("defence"));

    }
}