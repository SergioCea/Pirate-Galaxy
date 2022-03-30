/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.pirate_galaxy;

/**
 *
 * @author Sergio Cea
 */
public class Clase_Misiones {
    
    private int id;
    private String nombre;
    private String sistema;
    private String desc;

    public Clase_Misiones() {
        this.sistema = "";
        this.desc = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Clase_Misiones{" + "nombre=" + nombre + ", sistema=" + sistema + ", desc=" + desc + '}';
    }
    
    

    
    
}

