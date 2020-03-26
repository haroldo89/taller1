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
    

    //CONSTRUCTOR
    public Brazo() {
        //Se inicializan los valores de la falange digital
        int xiFalDig = Constantes.ANCHO_MAXIMO_CANVAS/2;
        int yiFalDig = 0;
        
        int wFalDig = Constantes.ANCHO_MAXIMO_CANVAS/10;
        int hFalDig = Constantes.ALTO_MAXIMO_CANVAS/10;
        
        falangeDigitalIzquierda = new FalangeDigital(xiFalDig, yiFalDig, xiFalDig, yiFalDig + hFalDig);
        falangeDigitalDerecha = new FalangeDigital(xiFalDig, yiFalDig, xiFalDig, yiFalDig + hFalDig);
    }
    
    
    //METODOS
    
    public void girarFalDidIzq(int alphaGrados){
        falangeDigitalIzquierda.girar(alphaGrados);
    }
    
    
    public void girarFalDidDer(int alphaGrados){
        falangeDigitalDerecha.girar(alphaGrados);
    }
    
    public void dibujarBrazo(Graphics lapiz){
        falangeDigitalIzquierda.dibujar(lapiz);
        falangeDigitalDerecha.dibujar(lapiz);
    }
    
    //GETTERS
    
    
    //SETTERS

    
    
    
    
    
}
