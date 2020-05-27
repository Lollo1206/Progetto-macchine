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
public class Test {
    public static void main(String[] args) {
        Parcheggio p = new Parcheggio();
        for(int i = 1; i < 12; i++)
        {
            Auto a = new Auto (" numero " + i, p);
        }
    }
}
