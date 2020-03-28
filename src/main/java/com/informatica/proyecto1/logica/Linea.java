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
    private int xFinalDinamica, yFinalDinamica, xInicial, yInicial, ancho;//Coordenadas iniciales y finales del punto
    private double h;
    //CONSTRUCTOR
    public Linea(int xFinal, int yFinal, int xInicial, int yInicial, int ancho) {
        this.xFinalDinamica = xFinal;
        this.yFinalDinamica = yFinal;
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.ancho = ancho;
        
        //Se calcula la altura o el radio del vector(Hipotenusa)
        double catetoOpuestoX = Math.abs(xInicial - xFinal);
        double catetoAdyacenteY = Math.abs(yInicial - yFinal);
        h = Math.hypot(catetoOpuestoX, catetoAdyacenteY);
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
        
        //deltas de desplaxamiento de acuerdo al angulo
        double deltaX = h*Math.sin(alpha);
        double deltaY = h*Math.cos(alpha);
        
        
        //Se inicializan variables de corrimiento
        double xm = 0;
        double ym = 0;
        
        //Se revisa el valor de alpha y se asigna valor al corrimiento
        if( (alphaGrados>=0 && alphaGrados <=90)){
            xm = xInicial + Math.abs(deltaX);
            ym = yInicial - Math.abs(deltaY);
        }
        else if( (alphaGrados>90 && alphaGrados <180)){
            xm = xInicial + Math.abs(deltaX);
            ym = yInicial + Math.abs(deltaY);
        }
        else if( (alphaGrados>=180 && alphaGrados <=270) ){
            xm = xInicial - Math.abs(deltaX);
            ym = yInicial + Math.abs(deltaY);
        }
        else if( (alphaGrados>270 && alphaGrados <=360)){
            xm = xInicial - Math.abs(deltaX);
            ym = yInicial - Math.abs(deltaY);
        }
        
        //Se pasan los valores a las variables de la clase
        xFinalDinamica=(int) xm;
        yFinalDinamica=(int) ym;
    }
    
    public void cambiarCoordenadasBase(int xn, int yn){
        //Se calcula el corrimiento de coordenadas
        int deltaBaseX = xInicial - xn;
        int deltaBaseY = yInicial - yn;
        
        //Se asigna el nuevo valor a la base
        xInicial = xn;
        yInicial = yn;
        
        //Se calcula el nuevo valor de las coordenadas en el extremo
        xFinalDinamica = xFinalDinamica - deltaBaseX;
        yFinalDinamica = yFinalDinamica - deltaBaseY;
    }
    
    //GETTERS

    public int getX0() {
        return xFinalDinamica;
    }

    public int getY0() {
        return yFinalDinamica;
    }

    public int getXF() {
        return xInicial;
    }

    public int getYF() {
        return yInicial;
    }
    
    
    public void dibujar(Graphics lapiz){
        Graphics2D lapiz2D = (Graphics2D) lapiz;
        lapiz2D.setStroke(new BasicStroke(ancho));//Se aumenta anco de la liena
        lapiz2D.setColor(Color.BLACK);
        lapiz2D.drawLine(xFinalDinamica, yFinalDinamica, xInicial, yInicial);
    }
    
}
