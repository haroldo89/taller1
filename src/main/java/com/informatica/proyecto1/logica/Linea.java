/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informatica.proyecto1.logica;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


/**
 *
 * @author Vamaya
 */
public class Linea {
    //VARIABLES
    private int xb, yb, x0, y0, xf, yf, wl;//Coordenadas iniciales y finales del punto

    //CONSTRUCTOR
    public Linea(int xb, int yb, int xf, int yf, int wl) {
        this.xb = xb;
        this.yb = yb;
        this.x0 = xb;
        this.y0 = yb;
        this.xf = xf;
        this.yf = yf;
        this.wl = wl;
    }
    
    //METODOS
    
    /**
     * Metodo que permite girar n grados el extremo de la linea, respecto a una base fija
     * @param alphaGrados 
     */
    public void girarLinea(int alphaGrados){
        
        //Se revisa si alphaGrados es negativo
        if(alphaGrados<0){
            alphaGrados = 360 - Math.abs(alphaGrados);
        }
        //Movimiento en radianes
        double alpha = Math.toRadians(alphaGrados);
        
        //Se calcula la altura o el radio del vector(Hipotenusa)
        double diferenciaX = Math.abs(xf - xb);
        double diferenciaY = Math.abs(yf - yb);
        double h = Math.hypot(diferenciaX, diferenciaY);
        
        //deltas de desplaxamiento de acuerdo al angulo
        double deltaX = h*Math.sin(alpha);
        double deltaY = h*Math.cos(alpha);
        
        
        //Se inicializan variables de corrimiento
        double xm = 0;
        double ym = 0;
        
        //Se revisa el valor de alpha y se asigna valor al corrimiento
        if( (alphaGrados>=0 && alphaGrados <=90)){
            xm = xb + Math.abs(deltaX);
            ym = (yb + h) - Math.abs(deltaY);
        }
        else if( (alphaGrados>90 && alphaGrados <180)){
            xm = xb + Math.abs(deltaX);
            ym = (yb + h) + Math.abs(deltaY);
        }
        else if( (alphaGrados>=180 && alphaGrados <=270) ){
            xm = xb - Math.abs(deltaX);
            ym = (yb + h) + Math.abs(deltaY);
        }
        else if( (alphaGrados>270 && alphaGrados <=360)){
            xm = xb - Math.abs(deltaX);
            ym = (yb + h) - Math.abs(deltaY);
        }
        
        //Se pasan los valores a las variables de la clase
        x0=(int) xm;
        y0=(int) ym;
    }
    
    public void cambiarCoordenadasBase(int xn, int yn){
        //Se calcula el corrimiento de coordenadas
        int deltaBaseX = xf - xn;
        int deltaBaseY = yf - yn;
        
        //Se asigna el nuevo valor a la base
        xf = xn;
        yf = yn;
        
        //Se calcula el nuevo valor de las coordenadas en el extremo
        x0 = x0 - deltaBaseX;
        y0 = y0 - deltaBaseY;
        
        //Se cambia el valor de la base del extremo para hacer claculos
        xb = xb - deltaBaseX;
        yb = yb - deltaBaseY;
    }
    
    //GETTERS

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }

    public int getXF() {
        return xf;
    }

    public int getYF() {
        return yf;
    }
    
    
    public void dibujar(Graphics lapiz){
        Graphics2D lapiz2D = (Graphics2D) lapiz;
        lapiz2D.setStroke(new BasicStroke(wl));//Se aumenta anco de la liena
        lapiz2D.setColor(Color.BLACK);
        lapiz2D.drawLine(x0, y0, xf, yf);
    }
    
}
