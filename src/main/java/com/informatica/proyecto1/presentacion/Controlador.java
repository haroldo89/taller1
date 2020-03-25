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
        //Sección A
        if(e.getSource().equals(ventana.getSldrSeccionA())){
            //Mover la sección A
            
        }
    }
    
}
