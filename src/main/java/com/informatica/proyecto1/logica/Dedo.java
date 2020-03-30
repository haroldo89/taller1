package com.informatica.proyecto1.logica;

import lombok.Getter;

/**
 *
 * @author Vamaya
 */
public class Dedo extends Hueso{
    
    //VARIABLES    
    @Getter private final Hueso falangeDitial;
    
    //CONSTRUCTOR
    public Dedo(int xFinal1, int yFinal1, int xFinal2, int yFinal2,  int xInicial, int yInicial, int ancho){    
        super(xFinal2, yFinal2, xInicial, yInicial, ancho);
        this.falangeDitial = new Hueso(xFinal1, yFinal1, xFinal2, yFinal2, ancho);
    }

    //METODOS
    @Override
    public void girarHueso(int alphaGrados){
        super.girarHueso(alphaGrados);
        int xn = this.getXFinalDinamica();
        int yn= this.getYFinalDinamica();
        falangeDitial.cambiarCoordenadasBase(xn, yn);
        
    }
    
    @Override
    public void cambiarCoordenadasBase(int xTrasladada, int yTrasladada){
        super.cambiarCoordenadasBase(xTrasladada, yTrasladada);
        int xnf = this.getXFinalDinamica();
        int ynf= this.getYFinalDinamica();
        falangeDitial.cambiarCoordenadasBase(xnf, ynf);
    }
    
    }
    
