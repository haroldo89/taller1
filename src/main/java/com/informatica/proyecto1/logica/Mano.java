package com.informatica.proyecto1.logica;

import lombok.Getter;

/**
 *
 * @author Vamaya
 */
public class Mano extends Hueso{
    
    //VARIABLES    
    @Getter private final Dedo dedoIzq;
    @Getter private final Dedo dedoDer;
    
    //CONSTRUCTOR
    public Mano(int xFinal, int yFinal, int xInicial, int yInicial, int ancho, Dedo dedoIzq, Dedo dedoDer) {
        super(xFinal, yFinal, xInicial, yInicial, ancho);
        this.dedoIzq = dedoIzq;
        this.dedoDer = dedoDer;
    }    
    
    //METODOS
    @Override
    public void girarHueso(int alphaGrados){
        super.girarHueso(alphaGrados);
        int xn = this.getXFinalDinamica();
        int yn= this.getYFinalDinamica();
        dedoDer.cambiarCoordenadasBase(xn, yn);
        dedoIzq.cambiarCoordenadasBase(xn, yn);
        
    }
    
    @Override
    public void cambiarCoordenadasBase(int xTrasladada, int yTrasladada){
        super.cambiarCoordenadasBase(xTrasladada, yTrasladada);
        int xnf = this.getXFinalDinamica();
        int ynf= this.getYFinalDinamica();
        dedoDer.cambiarCoordenadasBase(xnf, ynf);
        dedoIzq.cambiarCoordenadasBase(xnf, ynf);
    }

}
