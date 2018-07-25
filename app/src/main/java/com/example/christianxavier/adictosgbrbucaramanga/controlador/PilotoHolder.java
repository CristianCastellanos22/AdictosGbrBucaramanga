package com.example.christianxavier.adictosgbrbucaramanga.controlador;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.christianxavier.adictosgbrbucaramanga.R;

/**
 * Created by christianxavier on 23/06/2017.
 */

public class PilotoHolder extends RecyclerView.ViewHolder {

    private View view;

    public PilotoHolder(View itemView) {
        super(itemView);
        this.view = itemView;
    }

    public void setEstado(String estado) {
        TextView textView = (TextView)view.findViewById(R.id.stateV);
        textView.setText(estado);
    }

    public void setCodigo(String codigo) {
        TextView textView = (TextView)view.findViewById(R.id.codeV);
        textView.setText(codigo);
    }

    public void setFoto(String foto) {
        ImageView imageView = (ImageView)view.findViewById(R.id.imageProfileV);
        Glide.with(view.getContext()).load(foto).into(imageView);
    }

    public void setNombres(String nombres) {
        TextView textView = (TextView)view.findViewById(R.id.nameV);
        textView.setText(nombres);
    }

    public void setApellidos(String apellidos) {
        TextView textView = (TextView)view.findViewById(R.id.lastNameV);
        textView.setText(apellidos);
    }

    public void setApodo(String apodo) {
        TextView textView = (TextView)view.findViewById(R.id.apodoV);
        textView.setText(apodo);
    }

    public void setCelular(String celular) {
        TextView textView = (TextView)view.findViewById(R.id.telPhoneV);
        textView.setText(celular);
    }

    public void setOcupacion(String ocupacion) {
        TextView textView = (TextView)view.findViewById(R.id.employmentV);
        textView.setText(ocupacion);
    }

    public void setIngreso(String ingreso) {
        TextView textView = (TextView)view.findViewById(R.id.admissionV);
        textView.setText(ingreso);
    }

    public void setCumple(String cumple) {
        TextView textView = (TextView)view.findViewById(R.id.dateV);
        textView.setText(cumple);
    }

    public void setMotivo(String motivo) {
        TextView textView = (TextView)view.findViewById(R.id.reasonV);
        textView.setText(motivo);
    }

    public void setRh(String rh) {
        TextView textView = (TextView)view.findViewById(R.id.rhV);
        textView.setText(rh);
    }

    public void setMoto(String moto) {
        TextView textView = (TextView)view.findViewById(R.id.motoV);
        textView.setText(moto);
    }

    public void setModelo(String modelo) {
        TextView textView = (TextView)view.findViewById(R.id.modeloV);
        textView.setText(modelo);
    }

    public void setPlaca(String placa) {
        TextView textView = (TextView)view.findViewById(R.id.placaV);
        textView.setText(placa);
    }

    public void setNombreContact(String nombreContact) {
        TextView textView = (TextView)view.findViewById(R.id.nameContactV);
        textView.setText(nombreContact);
    }

    public void setCelContact(String celContact) {
        TextView textView = (TextView)view.findViewById(R.id.celPhoneContactV);
        textView.setText(celContact);
    }
}
