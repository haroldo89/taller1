/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informatica.proyecto1.presentacion;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author harol otro comentario
 */
public class Controlador implements ChangeListener{
    
    //VARIABLES
    private Vista ventana;
    private Modelo modelo;
    
    //CONSTRUCTOR
    public Controlador(Vista v) {
        this.ventana = v;
        modelo = ventana.getModelo();
    }

    //CHANGELISTENER METHOD
    @Override
    public void stateChanged(ChangeEvent e) {
        //Falange dig izq
        System.out.println("Entro a cambio de estado..");
        if(e.getSource().equals(ventana.getSldrFalangeDigIzq())){
            System.out.println("Falange dig izq");
            //Mover la falange dig izq
            modelo.girarFalDigIzq();
            
        }
        else if(e.getSource().equals(ventana.getSldFalangeDigDer())){
            System.out.println("Falange dig der");
            //Mover la falange dig der
            modelo.girarFalDigDer();
            
        }
        else if(e.getSource().equals(ventana.getSldFalangeProxIzq())){
            System.out.println("Falange prox izq");
            //Mover la falange prox izq
            modelo.girarFalProxIzq();
            
        }
        else if(e.getSource().equals(ventana.getSldFalangeProxDer())){
            System.out.println("Falange prox der");
            //Mover la falange prox der
            modelo.girarFalProxDer();
            
        }
        
        
        
    }
    
}
