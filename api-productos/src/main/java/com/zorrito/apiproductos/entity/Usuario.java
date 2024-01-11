package com.zorrito.apiproductos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correoElectronico")
    private String correoElectronico;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "pais")
    private String pais;

    @Column(name = "codigoPostal")
    private String codigoPostal;    

    @Column(name = "telefono")
    private String telefono;

    


    public Usuario(String nombre, String apellido, String correoElectronico, String contraseña, Date fechaNacimiento,
            String direccion, String ciudad, String pais, String codigoPostal, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
    }

    


    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public String getApellido() {
        return apellido;
    }




    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




    public String getCorreoElectronico() {
        return correoElectronico;
    }




    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }




    public String getContraseña() {
        return contraseña;
    }




    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }




    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }




    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }




    public String getDireccion() {
        return direccion;
    }




    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




    public String getCiudad() {
        return ciudad;
    }




    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }




    public String getPais() {
        return pais;
    }




    public void setPais(String pais) {
        this.pais = pais;
    }




    public String getCodigoPostal() {
        return codigoPostal;
    }




    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }




    public String getTelefono() {
        return telefono;
    }




    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




    public Usuario() {
        // Constructor sin argumentos necesario para Hibernate
    }

}