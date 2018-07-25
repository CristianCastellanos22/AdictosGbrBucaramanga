package com.example.christianxavier.adictosgbrbucaramanga.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.christianxavier.adictosgbrbucaramanga.R;

public class Info extends AppCompatActivity {

    private TextView name,link;
    private ImageView imgPro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        name=(TextView)findViewById(R.id.name);
        link=(TextView)findViewById(R.id.email);
        imgPro=(ImageView)findViewById(R.id.imgProfile);

        String nombre=getIntent().getStringExtra("nombre"),
                id=getIntent().getStringExtra("id"),
                img=getIntent().getStringExtra("profile");

        name.setText(nombre);
        link.setText("Id de usuario: " + id);

        Glide.with(Info.this).load(img).into(imgPro);
    }
}
