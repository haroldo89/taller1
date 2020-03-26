/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informatica.proyecto1.logica;

import java.awt.Graphics;

/**
 *
 * @author DELL
 */
public class AnteBrazo {
    
    //VARIABLES    
    private Linea huesoAnteBrazo;
    private Mano mano;
    
    //CONSTRUCTOR
    public AnteBrazo(int xi, int yi, int xf, int yf, Mano mano) {
        this.huesoAnteBrazo = new Linea(xi, yi, xf, yf);
        this.mano = mano;
    }
    
    
    //METODOS
    public void girar(int alphaGrados){
        huesoAnteBrazo.girarLinea(alphaGrados);
        int xn = huesoAnteBrazo.getX0();
        int yn= huesoAnteBrazo.getY0();
        mano.cambiarCoordBase(xn, yn);
    }
    
     public void cambiarCoordBase(int xn, int yn){
        huesoAnteBrazo.cambiarCoordenadasBase(xn, yn);
        int xnf = huesoAnteBrazo.getX0();
        int ynf= huesoAnteBrazo.getY0();
        mano.cambiarCoordBase(xnf, ynf);
    }
    
    public void dibujar(Graphics lapiz){
        huesoAnteBrazo.dibujar(lapiz);
    }
    
    //GETTERS
    public Linea getHuesoAnteBrazo() {
        return huesoAnteBrazo;
    }

    public Mano getMano() {
        return mano;
    }
    
    
    //SETTERS
    public void setHuesoAnteBrazo(Linea huesoAnteBrazo) {
        this.huesoAnteBrazo = huesoAnteBrazo;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }
    
    
    
    
    
}
