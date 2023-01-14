package com.glancaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ComplexNumbersTest {

    @Test
    public void testInstantationReal() {
        Complex a = new Complex(1, 5);
        float truth = 1f;

        assertEquals(a.getRealPart(), truth, 0);
    }

    @Test
    public void testInstantationImag() {
        Complex a = new Complex(4, 2);
        float truth = 2f;

        assertEquals(a.getImagPart(), truth, 0);
    }

    @Test
    public void testComplexRealGet() {
        Complex a = new Complex(300f, 2f);
        float truth = 300f;
        assertEquals(truth, a.getRealPart(), 0);

    }

    @Test
    public void testComplexRealSet() {
        Complex a = new Complex(3f, 1f);
        float truth = 10f;

        a.setRealPart(10f);

        assertEquals(truth, a.getRealPart(), 0);

    }

    @Test
    public void testComplexImagGet() {
        Complex a = new Complex(3f, 2f);
        float truth = 2f;
        assertEquals(truth, a.getImagPart(), 0);
    }

    @Test
    public void testComplexImagSet() {
        Complex a = new Complex(3f, 1f);
        float truth = 2f;

        a.setImagPart(2f);

        assertEquals(truth, a.getImagPart(), 0);
        
    }

    @Test
    public void testComplexToString() {
        Complex a = new Complex(3f, 2f);
        String truth = "3.0 + 2.0i";

        assertEquals(truth, a.toString());
    }

    @Test
    public void testComplexAddition1() {
        Complex a = new Complex(1f, 2f);
        Complex b = new Complex(4f, 3f);

        a.add(b);


    }

    @Test
    public void testComplexMultiplication1() {
        Complex a = new Complex(3f, 2f);
        Complex b = new Complex(1f, 7f);
        Complex truth = new Complex(-11f, 23f);

        a.mult(b);

        assertEquals(a.getRealPart(), truth.getRealPart(), 0);
        assertEquals(a.getImagPart(), truth.getImagPart(), 0);
    }

    @Test
    public void testComplexMultiplication2() {
        Complex a = new Complex(1f, 1f);
        Complex b = new Complex(1f, 1f);
        Complex truth = new Complex(0f, 2f);

        a.mult(b);

        assertEquals(a.getRealPart(), truth.getRealPart(), 0);
        assertEquals(a.getImagPart(), truth.getImagPart(), 0);
    }

    @Test
    public void testComplexMultiplicationReal() {
        Complex a = new Complex(3f, 5f);
        float n = 5;

        Complex truth = new Complex(15f, 25f);

        a.mult(n);

        assertEquals(truth.getRealPart(), a.getRealPart(), 0);
        assertEquals(truth.getImagPart(), a.getImagPart(), 0);

    }

    @Test
    public void testConstructor() {
        Complex complex = new Complex();

        assertEquals(0, complex.getRealPart(), 0);
        assertEquals(0, complex.getImagPart(), 0);
    }
    
}
