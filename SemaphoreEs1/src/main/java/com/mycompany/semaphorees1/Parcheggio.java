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
import java.util.concurrent.Semaphore;

public class Parcheggio {
    private int totPosti  = 10;
    private Semaphore disponibile;
    private Semaphore occupato;
    
  
    public Parcheggio() {
        disponibile = new Semaphore(totPosti, true); 
        occupato = new Semaphore(0, true); 
    }
    
    public int getTotalePosti() {
        return totPosti;
    }
    
    public void ingresso()
    {
        try
        {
            disponibile.acquire();
            totPosti--;
        } catch (InterruptedException e) {}       
        occupato.release();     
    }
    
    public void uscita()
    {
        try
        {
            disponibile.acquire(); 
            totPosti++;
        } catch (InterruptedException e) {}      
        occupato.release(); 
    }
}

