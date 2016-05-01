/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adneom.exercice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yo911
 */
public class Exercice {
    
    public static List<List<Integer>> partition(List<Integer> list, int nb) {
        if( nb == 0 || list.isEmpty() ) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        for( int i = 0; i < list.size(); i ++) {
            if( i > 0 && i % nb == 0 ) {
                result.add(subList);
                subList = new ArrayList<>();
            }
            subList.add( list.get(i) );
        }
        result.add(subList);
        return result;
    }
    
}
