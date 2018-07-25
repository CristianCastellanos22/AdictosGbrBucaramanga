package com.example.christianxavier.adictosgbrbucaramanga.vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.christianxavier.adictosgbrbucaramanga.R;
import com.example.christianxavier.adictosgbrbucaramanga.controlador.PilotoHolder;
import com.example.christianxavier.adictosgbrbucaramanga.modelo.Piloto;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class ViewUser extends AppCompatActivity {

    FirebaseRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.listUser);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        Query reference = FirebaseDatabase.getInstance().getReference().child("Bucaramanga").child("Agbr").orderByChild("estado");

        adapter = new FirebaseRecyclerAdapter<Piloto,PilotoHolder>(Piloto.class,R.layout.list,PilotoHolder.class,reference) {
            @Override
            protected void populateViewHolder(PilotoHolder viewHolder, Piloto model, int position) {
                viewHolder.setFoto(model.getFoto());
                viewHolder.setNombres("Nombre : " + model.getNombres());
                viewHolder.setApellidos(model.getApellidos());
                viewHolder.setApodo("Apodo : " + model.getApodo());
                viewHolder.setRh("RH : " + model.getRh());
                viewHolder.setEstado("Estado : " + model.getEstado());
                viewHolder.setCodigo("Código : " + model.getCodigo());
                viewHolder.setCelular("Celular : " + model.getCelular());
                viewHolder.setOcupacion("Ocupacion : " + model.getOcupacion());
                viewHolder.setIngreso("Ingreso : " + model.getIngreso());
                viewHolder.setCumple("Cumpleaños : " + model.getCumple());
                viewHolder.setMotivo(model.getMotivo());
                viewHolder.setMoto("Moto : " + model.getMoto());
                viewHolder.setModelo("Modelo : " + model.getModelo());
                viewHolder.setPlaca("Placa : " + model.getPlaca());
                viewHolder.setNombreContact("Nombre : " + model.getNombreContact());
                viewHolder.setCelContact("Celular : " + model.getCelContact());

            }
        };
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewUser.this,Create.class));
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        adapter.cleanup();
    }
}
