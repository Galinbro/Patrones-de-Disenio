/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author galindo
 */
public class SortCantidad implements Sortable,Comparator<Transaction>{
   
    public void sort(ArrayList<Transaction> o) {
         Collections.sort(o, new SortCantidad());
    }
    
    public int compare(Transaction o1, Transaction o2){ 
        return (o1.getCantidad() - o2.getCantidad());
    } 
    
} 
    

