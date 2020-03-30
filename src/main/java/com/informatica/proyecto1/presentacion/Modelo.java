/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informatica.proyecto1.presentacion;

// import logica;

import com.informatica.proyecto1.logica.Brazo;
import com.informatica.proyecto1.logica.BrazoCompleto;
import com.informatica.proyecto1.utils.Constantes;
import java.awt.Canvas;
import java.awt.Graphics;


/**
 *
 * @author harol
 */
public class Modelo implements Runnable {
    
    //VARIABLES
    private Vista ventanaApp;
    private BrazoCompleto brazoCompleto;
    Boolean inicio = true;
    
    //CONSTRUCTOR
    public Modelo() {
        ventanaApp = new Vista(this);
        brazoCompleto = new BrazoCompleto();
    }

    
    //GETTERS
    public Vista getVentanaApp() {
        if(ventanaApp == null){
            ventanaApp = new Vista(this);
        }
        return ventanaApp;
    }

    public BrazoCompleto getBrazoCompleto() {
        if(brazoCompleto == null){
            brazoCompleto = new BrazoCompleto();
        }
        return brazoCompleto;
    }
    
    
    
    
    
    /**
     * Metodo para iniciar la ventana principal de la aplicación
     */
    public void iniciar() {
        getVentanaApp().setSize(Constantes.ANCHO_MAXIMO_FRAME, Constantes.ALTO_MAXIMO_FRAME);
        getVentanaApp().setVisible(true); 
        run();
    }

    
    //METODOS
    public void girarFalDigIzq(){
        int alphaGrados = getVentanaApp().getSldrFalangeDigIzq().getValue();
        System.out.println("Grados: " + alphaGrados);
        //getBrazo().girarFalDidIzq(alphaGrados);
        getBrazoCompleto().getDedoIzq().getFalangeDitial().girarHueso(alphaGrados);
                //.getFalangeDigitalIzquierda().girarHueso(alphaGrados);
        run();
    }
    
    
    public void girarFalDigDer(){
        int alphaGrados = getVentanaApp().getSldFalangeDigDer().getValue();
        System.out.println("Grados: " + alphaGrados);
        getBrazoCompleto().getDedoDer().getFalangeDitial().girarHueso(alphaGrados);
                //.getFalangeDigitalDerecha().girarHueso(alphaGrados);
                //girarFalDidDer(alphaGrados);
        run();
    }
    
    
    
    public void girarFalProxIzq(){
        int alphaGrados = getVentanaApp().getSldFalangeProxIzq().getValue();
        System.out.println("Grados: " + alphaGrados);
        getBrazoCompleto().getDedoIzq().girarHueso(alphaGrados);
                //girarFalProxIzq(alphaGrados);
        run();
    }
    
    
    public void girarFalProxDer(){
        int alphaGrados = getVentanaApp().getSldFalangeProxDer().getValue();
        System.out.println("Grados: " + alphaGrados);
        getBrazoCompleto().getDedoDer().girarHueso(alphaGrados);
                //girarFalProxDer(alphaGrados);
        run();
    }
    
    
    public void girarMano(){
        int alphaGrados = getVentanaApp().getSldMano().getValue();
        System.out.println("Grados: " + alphaGrados);
        getBrazoCompleto().getMano().girarHueso(alphaGrados);
                //girarMano(alphaGrados);
        run();
    }
    
    
    public void girarAnteBrazo(){
        int alphaGrados = getVentanaApp().getSldAnteBrazo().getValue();
        System.out.println("Grados: " + alphaGrados);
        getBrazoCompleto().getAnteBrazo().girarHueso(alphaGrados);
                //girarAnteBrazo(alphaGrados);
        run();
    }
    
    
    public void girarBrazo(){
        int alphaGrados = getVentanaApp().getSldBrazo().getValue();
        System.out.println("Grados: " + alphaGrados);
        getBrazoCompleto().getBrazo().girarHueso(alphaGrados);
                //girarBrazo(alphaGrados);
        run();
    }
    
    
    
    private void dibujar(){
        getVentanaApp().getLienzo().getGraphics().clearRect(0, 0, Constantes.ANCHO_MAXIMO_CANVAS, Constantes.ALTO_MAXIMO_CANVAS);
        System.out.println("Diujando...");
        Canvas lienzo = getVentanaApp().getLienzo();
        Graphics lapiz = lienzo.getGraphics();
        getBrazoCompleto().dibujarBrazo(lapiz);
    }
    
    
    @Override
    public void run() {
        if(inicio){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error");
            }
            inicio = false;
        }
        dibujar();
    }
    
}
