package com.informatica.proyecto1.logica;

import lombok.Getter;

/**
 *
 * @author Vamaya
 */
public class AnteBrazo extends HuesoConHueso{

    
    
    //VARIABLES    
    //@Getter private final Mano mano;
    
    //CONSTRUCTOR
    public AnteBrazo(Mano mano, int xFinal, int yFinal, int xInicial, int yInicial, int ancho) {
        super(mano, xFinal, yFinal, xInicial, yInicial, ancho);
    }
    
    
    
    
    /*
    public AnteBrazo(int xFinal, int yFinal, int xInicial, int yInicial, int ancho, Mano mano) {
        super(xFinal, yFinal, xInicial, yInicial, ancho);
        this.mano = mano;
    }
    
    //METODOS
    @Override
    public void girarHueso(int alphaGrados){
        super.girarHueso(alphaGrados);
        int xn = this.getXFinalDinamica();
        int yn= this.getYFinalDinamica();
        mano.cambiarCoordenadasBase(xn, yn);
        
    }
    
    @Override
    public void cambiarCoordenadasBase(int xTrasladada, int yTrasladada){
        super.cambiarCoordenadasBase(xTrasladada, yTrasladada);
        int xnf = this.getXFinalDinamica();
        int ynf= this.getYFinalDinamica();
        mano.cambiarCoordenadasBase(xnf, ynf);
    }
    */
}
