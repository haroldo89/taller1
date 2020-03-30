package com.informatica.proyecto1.logica;

import lombok.Getter;

/**
 *
 * @author Harold
 */
public class Brazo extends Hueso{
    
    //VARIABLES    
    @Getter private final AnteBrazo anteBrazo;

    //CONSTRUCTOR
    public Brazo(int xFinal, int yFinal, int xInicial, int yInicial, int ancho, AnteBrazo anteBrazo) {
        super(xFinal, yFinal, xInicial, yInicial, ancho);
        this.anteBrazo = anteBrazo;
    }

    
    //METODOS
    @Override
    public void girarHueso(int alphaGrados){
        super.girarHueso(alphaGrados);
        int xn = this.getXFinalDinamica();
        int yn= this.getYFinalDinamica();
        anteBrazo.cambiarCoordenadasBase(xn, yn);
        
    }
    
    @Override
    public void cambiarCoordenadasBase(int xTrasladada, int yTrasladada){
        super.cambiarCoordenadasBase(xTrasladada, yTrasladada);
        int xnf = this.getXFinalDinamica();
        int ynf= this.getYFinalDinamica();
        anteBrazo.cambiarCoordenadasBase(xnf, ynf);
    }

}
