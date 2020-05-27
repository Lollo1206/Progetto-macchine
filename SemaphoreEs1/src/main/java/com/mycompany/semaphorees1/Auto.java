/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.semaphorees1;

/**
 *
 * @author lorenzo
 */
public class Auto extends Thread{
    private Parcheggio parcheggio;

    //Costruttore
    public Auto(String nome, Parcheggio parcheggio) {
        super(nome);
        this.parcheggio = parcheggio;
        start();
    }
    
    @Override
    public void run(){
        while(true) { 
            synchronized (parcheggio){ 
                parcheggio.ingresso(); 
                System.out.println("Auto"+ super.getName() + " é entrata\nPosti disponibili: " + parcheggio.getTotalePosti() + "\n");
            }          
            synchronized (parcheggio){ 
                parcheggio.uscita();
                System.out.println("Auto"+ super.getName() + " é uscita\nPosti disponibili: " + parcheggio.getTotalePosti() + "\n");
            }
        }
    } 
}
