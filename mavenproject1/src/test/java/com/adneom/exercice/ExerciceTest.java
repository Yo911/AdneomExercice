/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adneom.exercice;

import static com.adneom.exercice.Exercice.partition;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Yo911
 */
public class ExerciceTest {
    
    public ExerciceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result;
        List<List<Integer>> expected = new ArrayList<>();
        for( int i = 0; i < 6; i++) {
            list.add(i);
        }
        
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        listTest.add(1);
        expected.add(listTest);
        
        listTest = new ArrayList<>();
        listTest.add(2);
        listTest.add(3);
        expected.add(listTest);
        
        listTest = new ArrayList<>();
        listTest.add(4);
        listTest.add(5);
        expected.add(listTest);
        
        result = partition(list, 2);
        
        Assert.assertArrayEquals(result.toArray(), expected.toArray());
        
        list = new ArrayList<>();
        for( int i = 0; i < 5; i++) {
            list.add(i);
        }
        expected = new ArrayList<>();
        
        listTest = new ArrayList<>();
        listTest.add(0);
        listTest.add(1);
        expected.add(listTest);
        
        listTest = new ArrayList<>();
        listTest.add(2);
        listTest.add(3);
        expected.add(listTest);
        
        listTest = new ArrayList<>();
        listTest.add(4);
        expected.add(listTest);
        
        result = partition(list, 2);
        
        Assert.assertArrayEquals(result.toArray(), expected.toArray());
    }
    
}
