package com.zorrito.apiproductos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Precio_Antes")
    private double precio_antes;

    @Column(name = "Precio_Despues")
    private double precio_despues;

    @Column(name = "Descuento")
    private double descuento;

    @Column(name = "Marca")
    private String marca;

    @Column(name = "Modelo")
    private String modelo;

    @Column(name = "Garantia")
    private String garantia;

    @Column(name = "Color")
    private String color;

    @Column(name = "Voltaje")
    private String voltaje;

    @Column(name = "Alto")
    private int alto;

    @Column(name = "Ancho")
    private int ancho;

    @Column(name = "Profundidad")
    private int profundidad;

    @Column(name = "EficienciaEnergetica")
    private String eficienciaenergetica;

    @Column(name = "Peso")
    private double peso;   


    @Column(name = "Fotografia")
    private String fotografia;

    
    public Producto(int id, String nombre, double precio_antes, double precio_despues, double descuento, String marca,
            String modelo, String garantia, String color, String voltaje, int alto, int ancho, int profundidad,
            String eficienciaenergetica, double peso, String fotografia) {
        this.id = id;
        this.nombre = nombre;
        this.precio_antes = precio_antes;
        this.precio_despues = precio_despues;
        this.descuento = descuento;
        this.marca = marca;
        this.modelo = modelo;
        this.garantia = garantia;
        this.color = color;
        this.voltaje = voltaje;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.eficienciaenergetica = eficienciaenergetica;
        this.peso = peso;
        this.fotografia = fotografia;
    }


        



        public String getNombre() {
            return nombre;
        }






        public void setNombre(String nombre) {
            this.nombre = nombre;
        }






        public double getPrecio_antes() {
            return precio_antes;
        }






        public void setPrecio_antes(double precio_antes) {
            this.precio_antes = precio_antes;
        }






        public double getPrecio_despues() {
            return precio_despues;
        }






        public void setPrecio_despues(double precio_despues) {
            this.precio_despues = precio_despues;
        }






        public double getDescuento() {
            return descuento;
        }






        public void setDescuento(double descuento) {
            this.descuento = descuento;
        }






        public String getMarca() {
            return marca;
        }






        public void setMarca(String marca) {
            this.marca = marca;
        }






        public String getModelo() {
            return modelo;
        }






        public void setModelo(String modelo) {
            this.modelo = modelo;
        }






        public String getGarantia() {
            return garantia;
        }






        public void setGarantia(String garantia) {
            this.garantia = garantia;
        }






        public String getColor() {
            return color;
        }






        public void setColor(String color) {
            this.color = color;
        }






        public String getVoltaje() {
            return voltaje;
        }






        public void setVoltaje(String voltaje) {
            this.voltaje = voltaje;
        }






        public int getAlto() {
            return alto;
        }






        public void setAlto(int alto) {
            this.alto = alto;
        }






        public int getAncho() {
            return ancho;
        }






        public void setAncho(int ancho) {
            this.ancho = ancho;
        }






        public int getProfundidad() {
            return profundidad;
        }






        public void setProfundidad(int profundidad) {
            this.profundidad = profundidad;
        }






        public String getEficienciaenergetica() {
            return eficienciaenergetica;
        }






        public void setEficienciaenergetica(String eficienciaenergetica) {
            this.eficienciaenergetica = eficienciaenergetica;
        }






        public double getPeso() {
            return peso;
        }






        public void setPeso(double peso) {
            this.peso = peso;
        }






        public String getFotografia() {
            return fotografia;
        }






        public void setFotografia(String fotografia) {
            this.fotografia = fotografia;
        }






        public Producto() {
                // Constructor sin argumentos necesario para Hibernate
            }






        public int getId() {
            return id;
        }






        public void setId(int id) {
            this.id = id;
        }

 }
