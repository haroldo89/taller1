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
public class FalangeProximal {
    
    //VARIABLES    
    private Linea huesofalangeProximal;
    private FalangeDigital falangeDitial;
    
    //CONSTRUCTOR
    public FalangeProximal(int xi, int yi, int xf, int yf, int wl, FalangeDigital falangeDitial) {
        this.huesofalangeProximal = new Linea(xi, yi, xf, yf, wl);
        this.falangeDitial = falangeDitial;
    }
    
    
    //METODOS
    public void girar(int alphaGrados){
        huesofalangeProximal.girarLinea(alphaGrados);
        int xn = huesofalangeProximal.getXFinalDinamica();
        int yn= huesofalangeProximal.getYFinalDinamica();
        falangeDitial.cambiarCoordBase(xn, yn);
    }
    
     public void cambiarCoordBase(int xn, int yn){
        huesofalangeProximal.cambiarCoordenadasBase(xn, yn);
        int xnf = huesofalangeProximal.getXFinalDinamica();
        int ynf= huesofalangeProximal.getYFinalDinamica();
        falangeDitial.cambiarCoordBase(xnf, ynf);
    }
    
    public void dibujar(Graphics lapiz){
        huesofalangeProximal.dibujar(lapiz);
    }
    
    
    //GETTERS
    public Linea getHuesofalangeProximal() {
        return huesofalangeProximal;
    }

    public FalangeDigital getFalangeDitial() {
        return falangeDitial;
    }
    
    
    //SETTERS
    public void setHuesofalangeProximal(Linea huesofalangeProximal) {
        this.huesofalangeProximal = huesofalangeProximal;
    }

    public void setFalangeDitial(FalangeDigital falangeDitial) {
        this.falangeDitial = falangeDitial;
    }
    
    
    }
    
