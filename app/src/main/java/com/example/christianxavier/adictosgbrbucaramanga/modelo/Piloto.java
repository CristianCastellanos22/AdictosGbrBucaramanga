package com.example.christianxavier.adictosgbrbucaramanga.modelo;

/**
 * Created by christianxavier on 22/06/2017.
 */

public class Piloto {

    private String foto;
    private String estado;
    private String codigo;
    private String nombres;
    private String apellidos;
    private String rh;
    private String celular;
    private String ingreso;
    private String cumple;
    private String apodo;
    private String ocupacion;
    private String motivo;

    private String moto;
    private String modelo;
    private String placa;

    private String nombreContact;
    private String celContact;

    public Piloto() {
    }

    public Piloto(String foto, String estado, String codigo, String nombres, String apellidos, String rh, String celular, String ingreso, String cumple, String apodo, String ocupacion, String motivo, String moto, String modelo, String placa, String nombreContact, String celContact) {
        this.foto = foto;
        this.estado = estado;
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rh = rh;
        this.celular = celular;
        this.ingreso = ingreso;
        this.cumple = cumple;
        this.apodo = apodo;
        this.ocupacion = ocupacion;
        this.motivo = motivo;
        this.moto = moto;
        this.modelo = modelo;
        this.placa = placa;
        this.nombreContact = nombreContact;
        this.celContact = celContact;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreContact() {
        return nombreContact;
    }

    public void setNombreContact(String nombreContact) {
        this.nombreContact = nombreContact;
    }

    public String getCelContact() {
        return celContact;
    }

    public void setCelContact(String celContact) {
        this.celContact = celContact;
    }
}
