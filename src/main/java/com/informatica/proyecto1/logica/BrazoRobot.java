package com.informatica.proyecto1.logica;

import com.informatica.proyecto1.utils.Constantes;
import java.awt.Graphics;
import lombok.Getter;

/**
 *
 * @author Vamaya
 */
@Getter
public class BrazoRobot {
    
    //VARIABLES    
    private final Dedo dedoIzq;
    private final Dedo dedoDer;
    private final Mano mano;    
    private final AnteBrazo anteBrazo;    
    private final Brazo brazo; 
    private final Base base;
    
    //CONSTRUCTOR
    public BrazoRobot() {
        //Se inicializan los valores de la falange digital
        int xiFalDig = Constantes.ANCHO_MAXIMO_CANVAS/2;
        int yiFalDig = 0;
        int wFalDig = 10;
        int hFalDig = Constantes.ALTO_MAXIMO_CANVAS/10;

        //Se inicializan los valores de la falange proximal
        int xiFalProx = xiFalDig;
        int yiFalProx = yiFalDig + hFalDig;        
        int wFalProx = 10;
        int hFalProx = Constantes.ALTO_MAXIMO_CANVAS/10;
        
        dedoIzq = new Dedo(new Hueso(xiFalDig, yiFalDig, xiFalDig, yiFalDig+hFalDig, wFalDig), xiFalProx, yiFalProx, xiFalProx, yiFalProx+hFalProx, wFalProx);
        dedoDer = new Dedo(new Hueso(xiFalDig, yiFalDig, xiFalDig, yiFalDig+hFalDig, wFalDig), xiFalProx, yiFalProx, xiFalProx, yiFalProx+hFalProx, wFalProx);
        //dedoIzq = new Dedo(xiFalDig, yiFalDig, xiFalProx, yiFalProx, xiFalProx, yiFalProx + hFalProx, wFalProx);
        //dedoDer = new Dedo(xiFalDig, yiFalDig, xiFalProx, yiFalProx, xiFalProx, yiFalProx + hFalProx, wFalProx);
        
        
        
        //Se inicializan los valores de la mano
        int xiMano = xiFalProx;
        int yiMano = yiFalProx + hFalProx;
        int wMano = 20;
        int hMano = Constantes.ALTO_MAXIMO_CANVAS*2/10;
        
        mano = new Mano(dedoIzq, dedoDer, xiMano, yiMano, xiMano, yiMano + hMano, wMano);
    
        
        //Se inicializan los valores del antebrazo
        int xiAnteBrazo = xiMano;
        int yiAnteBrazo = yiMano + hMano;       
        int wAnteBrazo = 20;
        int hAnteBrazo = Constantes.ALTO_MAXIMO_CANVAS*3/10;
        
        anteBrazo = new AnteBrazo(mano, xiAnteBrazo, yiAnteBrazo, xiAnteBrazo, yiAnteBrazo + hAnteBrazo, wAnteBrazo);
        
        
        //Se inicializan los valores del brazo
        int xiBrazo = xiAnteBrazo;
        int yiBrazo = yiAnteBrazo + hAnteBrazo;
        int wBrazo = 20;
        int hBrazo = Constantes.ALTO_MAXIMO_CANVAS*3/10;
        
        brazo = new Brazo(anteBrazo, xiBrazo, yiBrazo, xiBrazo, yiBrazo + hBrazo, wBrazo);
        
        base= new Base(xiBrazo, yiBrazo+hBrazo, 100, wBrazo/2);
    }
   
    
    
    public void dibujarBrazo(Graphics lapiz){       
        
        dedoIzq.getHuesoUnido().dibujar(lapiz);
        dedoDer.getHuesoUnido().dibujar(lapiz);
        
        dedoIzq.dibujar(lapiz);
        dedoDer.dibujar(lapiz);
        
        mano.dibujar(lapiz);
        
        anteBrazo.dibujar(lapiz);
        
        brazo.dibujar(lapiz);
        
        base.dibujar(lapiz);
        
        //ARTICULACIONES
        brazo.getArticulacion().dibujar(lapiz);
        
        anteBrazo.getArticulacion().dibujar(lapiz);
        
        mano.getArticulacion().dibujar(lapiz);
        
        dedoIzq.getArticulacion().dibujar(lapiz);
        dedoDer.getArticulacion().dibujar(lapiz);
        
        dedoIzq.getHuesoUnido().getArticulacion().dibujar(lapiz);
        dedoDer.getHuesoUnido().getArticulacion().dibujar(lapiz);
        
    }   
    
}
