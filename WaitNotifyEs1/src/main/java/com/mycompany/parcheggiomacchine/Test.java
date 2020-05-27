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
public class Test {
    public static void main(String[] args) {
        Parcheggio p = new Parcheggio(10);
        for (int i=1; i<= 10; i++) 
        {
        Macchina m = new Macchina("Auto numero "+i, p);
        }
    }
}
