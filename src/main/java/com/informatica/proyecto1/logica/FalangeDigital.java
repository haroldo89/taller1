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
 * @author Vamaya
 */
public class FalangeDigital {

    //VARIABLES    
    private Linea huesofalangeDigital;
    
    //CONSTRUCTOR
    public FalangeDigital(int xi, int yi, int xf, int yf, int wl) {
        this.huesofalangeDigital = new Linea(xi, yi, xf, yf, wl);
    }
    
    
    //METODOS
    public void girar(int alphaGrados){
        huesofalangeDigital.girarLinea(alphaGrados);
    }
    
    public void cambiarCoordBase(int xn, int yn){
        huesofalangeDigital.cambiarCoordenadasBase(xn, yn);
    }
    
    public void dibujar(Graphics lapiz){
        huesofalangeDigital.dibujar(lapiz);
    }
    
    //GETTERS
    public Linea getHuesofalangeDigital() {
        return huesofalangeDigital;
    }
    
    
    //SETTERS
    public void setHuesofalangeDigital(Linea huesofalangeDigital) {
        this.huesofalangeDigital = huesofalangeDigital;
    }
    
    
    
}
