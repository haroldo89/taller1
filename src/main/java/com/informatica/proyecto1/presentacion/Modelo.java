/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informatica.proyecto1.presentacion;

// import logica;

import com.informatica.proyecto1.utils.Constantes;


/**
 *
 * @author harol
 */
public class Modelo implements Runnable {
    
    //VARIABLES
    private Vista ventanaApp;
    
    
    //CONSTRUCTOR
    public Modelo() {
        
    }

    
    //GETTERS
    public Vista getVentanaApp() {
        if(ventanaApp == null){
            ventanaApp = new Vista(this);
        }
        return ventanaApp;
    }
    
    
    
    /**
     * Metodo para iniciar la ventana principal de la aplicación
     */
    public void iniciar() {
        getVentanaApp().setSize(Constantes.ANCHO_MAXIMO_FRAME, Constantes.ALTO_MAXIMO_FRAME);
        getVentanaApp().setVisible(true);
    }

    @Override
    public void run() {
        
    }
    
}
