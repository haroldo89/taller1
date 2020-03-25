package com.informatica.proyecto1;

import com.informatica.proyecto1.presentacion.Modelo;

/**
 *
 * @author harol
 */
public class Launcher {
    private Modelo modelo;

    /**
     * Constructor del lanzador, para inicar la aplicación
     */
    public Launcher() {
        modelo = new Modelo();
        modelo.iniciar();
    }
    
    /**
     * Metodo Main que permite el inicio de la aplicación principal
     * @param args 
     */
    public static void main(String[] args) {
        new Launcher();
    }
    
}
