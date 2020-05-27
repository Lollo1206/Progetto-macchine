/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcheggiomacchine;

/**
 *
 * @author lorenzo
 */
public class Macchina extends Thread{
    
    private Parcheggio p;
    
    public Macchina(String nome, Parcheggio p) 
    { 
    super(nome);
    this.p = p;
    start();
    }
   
    @Override
    public void run() {
        while (true) 
        {
            try 
            {
                sleep((int)(Math.random() * 20000)); 
            } 
            catch (InterruptedException e) {e.printStackTrace();} synchronized(p)
            {
            p.entra();
            System.out.println(getName()+" e'entrata, posti liberi: "+p.posti);
            } 
            
            try { sleep((int)(Math.random() * 10000)); 
            } catch (InterruptedException e) {e.printStackTrace();} synchronized(p){
            p.esce();
            System.out.println(getName()+" e'uscita, posti liberi: "+p.posti);
            } 
        } 
    } 
}
