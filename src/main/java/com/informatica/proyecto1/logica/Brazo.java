/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informatica.proyecto1.logica;

import com.informatica.proyecto1.utils.Constantes;
import java.awt.Graphics;

/**
 *
 * @author harol
 */
public class Brazo {
    
    //VARIABLES
    private FalangeDigital falangeDigitalIzquierda;
    private FalangeDigital falangeDigitalDerecha;
    
    private FalangeProximal falangeProximalIzquierda;
    private FalangeProximal falangeProximalDerecha;
    
    private Mano mano;
    
    private AnteBrazo anteBrazo;
    
    private Linea huesoBrazo;

    //CONSTRUCTOR
    public Brazo() {
        //Se inicializan los valores de la falange digital
        int xiFalDig = Constantes.ANCHO_MAXIMO_CANVAS/2;
        int yiFalDig = 0;
        
        int wFalDig = 5;
        int hFalDig = Constantes.ALTO_MAXIMO_CANVAS/10;
        
        falangeDigitalIzquierda = new FalangeDigital(xiFalDig, yiFalDig, xiFalDig, yiFalDig + hFalDig, wFalDig);
        falangeDigitalDerecha = new FalangeDigital(xiFalDig, yiFalDig, xiFalDig, yiFalDig + hFalDig, wFalDig);
    
        //Se inicializan los valores de la falange proximal
        int xiFalProx = xiFalDig;
        int yiFalProx = yiFalDig + hFalDig;
        
        int wFalProx = 5;
        int hFalProx = Constantes.ALTO_MAXIMO_CANVAS/10;
        
        falangeProximalIzquierda = new FalangeProximal(xiFalProx, yiFalProx, xiFalProx, yiFalProx + hFalProx, wFalProx, falangeDigitalIzquierda);
        falangeProximalDerecha = new FalangeProximal(xiFalProx, yiFalProx, xiFalProx, yiFalProx + hFalProx, wFalProx, falangeDigitalDerecha);
        
        
        
        //Se inicializan los valores de la mano
        int xiMano = xiFalProx;
        int yiMano = yiFalProx + hFalProx;
        
        int wMano = 10;
        int hMano = Constantes.ALTO_MAXIMO_CANVAS*2/10;
        
        mano = new Mano(xiMano, yiMano, xiMano, yiMano + hMano, wMano, falangeProximalIzquierda, falangeProximalDerecha);
    
        
        //Se inicializan los valores del antebrazo
        int xiAnteBrazo = xiMano;
        int yiAnteBrazo = yiMano + hMano;
        
        int wAnteBrazo = 10;
        int hAnteBrazo = Constantes.ALTO_MAXIMO_CANVAS*3/10;
        
        anteBrazo = new AnteBrazo(xiAnteBrazo, yiAnteBrazo, xiAnteBrazo, yiAnteBrazo + hAnteBrazo, wAnteBrazo, mano);
        
        
        //Se inicializan los valores del brazo
        int xiBrazo = xiAnteBrazo;
        int yiBrazo = yiAnteBrazo + hAnteBrazo;
        
        int wBrazo = 15;
        int hBrazo = Constantes.ALTO_MAXIMO_CANVAS*3/10;
        
        huesoBrazo = new Linea(xiBrazo, yiBrazo, xiBrazo, yiBrazo + hBrazo, wBrazo);
    
    }
    
    
    //METODOS
    public void girarFalDidIzq(int alphaGrados){
        falangeDigitalIzquierda.girar(alphaGrados);
    }
    
    
    public void girarFalDidDer(int alphaGrados){
        falangeDigitalDerecha.girar(alphaGrados);
    }
    
    
    
    
    public void girarFalProxIzq(int alphaGrados){
        falangeProximalIzquierda.girar(alphaGrados);
    }
    
    
    public void girarFalProxDer(int alphaGrados){
        falangeProximalDerecha.girar(alphaGrados);
    }
    
    
    
    
    public void girarMano(int alphaGrados){
        mano.girar(alphaGrados);
    }
    
    
    
    
    public void girarAnteBrazo(int alphaGrados){
        anteBrazo.girar(alphaGrados);
    }
    
    
    public void girarBrazo(int alphaGrados){
        huesoBrazo.girarLinea(alphaGrados);
        int xn = huesoBrazo.getXFinalDinamica();
        int yn= huesoBrazo.getYFinalDinamica();
        anteBrazo.cambiarCoordBase(xn, yn);
    }
    
    
    
    
    public void dibujarBrazo(Graphics lapiz){
        falangeDigitalIzquierda.dibujar(lapiz);
        falangeDigitalDerecha.dibujar(lapiz);
        
        falangeProximalIzquierda.dibujar(lapiz);
        falangeProximalDerecha.dibujar(lapiz);
        
        mano.dibujar(lapiz);
        
        anteBrazo.dibujar(lapiz);
        
        huesoBrazo.dibujar(lapiz);
        
        
    }
    
    //GETTERS
    
    
    //SETTERS

    
    
    
    
    
}
