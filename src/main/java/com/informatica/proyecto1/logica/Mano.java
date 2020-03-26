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
public class Mano {
    
    //VARIABLES    
    private Linea huesoMano;
    private FalangeProximal falangeProximalIzq;
    private FalangeProximal falangeProximalDer;
    
    //CONSTRUCTOR
    public Mano(int xi, int yi, int xf, int yf, FalangeProximal falangeProximalIzq, FalangeProximal falangeProximalDer) {
        this.huesoMano = new Linea(xi, yi, xf, yf);
        this.falangeProximalIzq = falangeProximalIzq;
        this.falangeProximalDer = falangeProximalDer;
    }
    
    
    //METODOS
    public void girar(int alphaGrados){
        huesoMano.girarLinea(alphaGrados);
        int xn = huesoMano.getX0();
        int yn= huesoMano.getY0();
        falangeProximalIzq.cambiarCoordBase(xn, yn);
        falangeProximalDer.cambiarCoordBase(xn, yn);
    }
    
     public void cambiarCoordBase(int xn, int yn){
        huesoMano.cambiarCoordenadasBase(xn, yn);
        int xnf = huesoMano.getX0();
        int ynf= huesoMano.getY0();
        falangeProximalIzq.cambiarCoordBase(xnf, ynf);
        falangeProximalDer.cambiarCoordBase(xnf, ynf);
    }
    
    public void dibujar(Graphics lapiz){
        huesoMano.dibujar(lapiz);
    }
    
    
    //GETTERS
    public Linea getHuesoMano() {
        return huesoMano;
    }

    public FalangeProximal getFalangeProximalIzq() {
        return falangeProximalIzq;
    }

    public FalangeProximal getFalangeProximalDer() {
        return falangeProximalDer;
    }
    
    
    //SETTERS
    public void setHuesoMano(Linea huesoMano) {
        this.huesoMano = huesoMano;
    }

    public void setFalangeProximalIzq(FalangeProximal falangeProximalIzq) {
        this.falangeProximalIzq = falangeProximalIzq;
    }

    public void setFalangeProximalDer(FalangeProximal falangeProximalDer) {
        this.falangeProximalDer = falangeProximalDer;
    }
    
}
