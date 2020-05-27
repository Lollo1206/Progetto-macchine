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
public class Parcheggio {
    
    public int posti;
    
    public Parcheggio(int posti) 
    {
        this.posti= posti;
    }
   
    public synchronized void entra() 
    { 
        while (posti==0) 
        {
            try 
            {
              wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        } 
        posti--;
    } 
    
    public synchronized void esce() 
    { 
    posti++;
    notifyAll();
    } 
}
