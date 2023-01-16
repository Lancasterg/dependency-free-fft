package com.glancaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ComplexNumbersTest {

    @Test
    public void testInstantationReal() {
        Complex a = new Complex(1, 5);
        double truth = 1f;

        assertEquals(a.getRealPart(), truth, 0);
    }

    @Test
    public void testInstantationImag() {
        Complex a = new Complex(4, 2);
        double truth = 2f;

        assertEquals(a.getImagPart(), truth, 0);
    }

    @Test
    public void testComplexRealGet() {
        Complex a = new Complex(300f, 2f);
        double truth = 300f;
        assertEquals(truth, a.getRealPart(), 0);

    }

    @Test
    public void testComplexRealSet() {
        Complex a = new Complex(3f, 1f);
        double truth = 10f;

        a.setRealPart(10f);

        assertEquals(truth, a.getRealPart(), 0);

    }

    @Test
    public void testComplexImagGet() {
        Complex a = new Complex(3f, 2f);
        double truth = 2f;
        assertEquals(truth, a.getImagPart(), 0);
    }

    @Test
    public void testComplexImagSet() {
        Complex a = new Complex(3f, 1f);
        double truth = 2f;

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
        Complex truth = new Complex(5f, 5f);
        Complex result;

        result = a.add(b);

        assertEquals(truth.getRealPart(), result.getRealPart(), 0);
        assertEquals(truth.getImagPart(), result.getImagPart(), 0);
    }

    @Test
    public void testComplexAddition2() {
        Complex a = new Complex(100f, 250f);
        Complex b = new Complex(0f, 250f);
        Complex truth = new Complex(100f, 500f);
        Complex result;

        result = a.add(b);

        assertEquals(truth.getRealPart(), result.getRealPart(), 0);
        assertEquals(truth.getImagPart(), result.getImagPart(), 0);
    }

    @Test
    public void testComplexSubtraction1() {
        Complex a = new Complex(99, 0);
        Complex b = new Complex(10f, 100f);
        Complex truth = new Complex(89, -100);
        Complex result;

        result = a.sub(b);

        assertEquals(truth.getRealPart(), result.getRealPart(), 0);
        assertEquals(truth.getImagPart(), result.getImagPart(), 0);
    }

    @Test
    public void testComplexSubtraction2() {
        Complex a = new Complex(-1000, 0);
        Complex b = new Complex(-2000, 0);
        Complex truth = new Complex(1000, 0);
        Complex result;

        result = a.sub(b);

        assertEquals(truth.getRealPart(), result.getRealPart(), 0);
        assertEquals(truth.getImagPart(), result.getImagPart(), 0);
    }

    @Test
    public void testComplexMultiplication1() {
        Complex a = new Complex(3f, 2f);
        Complex b = new Complex(1f, 7f);
        Complex truth = new Complex(-11f, 23f);
        Complex result;

        result = a.mult(b);

        assertEquals(result.getRealPart(), truth.getRealPart(), 0);
        assertEquals(result.getImagPart(), truth.getImagPart(), 0);
    }

    @Test
    public void testComplexMultiplication2() {
        Complex a = new Complex(1f, 1f);
        Complex b = new Complex(1f, 1f);
        Complex truth = new Complex(0f, 2f);
        Complex result;

        result = a.mult(b);

        assertEquals(result.getRealPart(), truth.getRealPart(), 0);
        assertEquals(result.getImagPart(), truth.getImagPart(), 0);
    }

    @Test
    public void testComplexMultiplicationReal() {
        Complex a = new Complex(3f, 5f);
        double n = 5;

        Complex truth = new Complex(15f, 25f);
        Complex result;

        result = a.mult(n);

        assertEquals(truth.getRealPart(), result.getRealPart(), 0);
        assertEquals(truth.getImagPart(), result.getImagPart(), 0);

    }

    @Test
    public void testConstructor() {
        Complex complex = new Complex();

        assertEquals(0, complex.getRealPart(), 0);
        assertEquals(0, complex.getImagPart(), 0);
    }
    
}
