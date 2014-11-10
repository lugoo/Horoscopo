/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horoscopos;

/**
 *
 * @author LATITUDE
 */
public class pitoniza {
    Esoterica esot;
    public pitoniza(Esoterica esot){
        this.esot=esot;
    }

    pitoniza(zodiaco zodiaco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String obtenerfuturo (String parametro){
        return esot.futuro(parametro);
    }

}