/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informatica.proyecto1.presentacion;

// import logica;

import com.informatica.proyecto1.logica.Brazo;
import com.informatica.proyecto1.utils.Constantes;
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author harol
 */
public class Modelo implements Runnable {
    
    //VARIABLES
    private Vista ventanaApp;
    private Brazo brazo;
    private boolean activo;
    private Thread hiloDibujo;
    
    //CONSTRUCTOR
    public Modelo() {
        activo = true;
        hiloDibujo = new Thread(this);
    }

    
    //GETTERS
    public Vista getVentanaApp() {
        if(ventanaApp == null){
            ventanaApp = new Vista(this);
        }
        return ventanaApp;
    }

    public Brazo getBrazo() {
        if(brazo == null){
            brazo = new Brazo();
        }
        return brazo;
    }
    
    
    
    
    
    /**
     * Metodo para iniciar la ventana principal de la aplicación
     */
    public void iniciar() {
        getVentanaApp().setSize(Constantes.ANCHO_MAXIMO_FRAME, Constantes.ALTO_MAXIMO_FRAME);
        getVentanaApp().setVisible(true);
        hiloDibujo.start();
        
    }

    
    //METODOS
    public void girarFalDigIzq(){
        int alphaGrados = getVentanaApp().getSldrFalangeDigIzq().getValue();
        System.out.println("Grados: " + alphaGrados);
        getBrazo().girarFalDidIzq(alphaGrados);
        run();
    }
    
    
    public void girarFalDigDer(){
        int alphaGrados = getVentanaApp().getSldFalangeDigDer().getValue();
        System.out.println("Grados: " + alphaGrados);
        getBrazo().girarFalDidDer(alphaGrados);
        run();
    }
    
    private void dibujar(){
        getVentanaApp().getLienzo().getGraphics().clearRect(0, 0, Constantes.ANCHO_MAXIMO_CANVAS, Constantes.ALTO_MAXIMO_CANVAS);
        System.out.println("Diujando...");
        Canvas lienzo = getVentanaApp().getLienzo();
        Graphics lapiz = lienzo.getGraphics();
        getBrazo().dibujarBrazo(lapiz);
    }
    
    
    @Override
    public void run() {
        dibujar();
    }
    
}
