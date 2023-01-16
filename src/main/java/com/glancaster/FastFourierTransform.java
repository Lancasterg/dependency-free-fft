package com.glancaster;

import java.lang.Math;

/**
 * 
 * Implementation of a Fast Fourier Transform in pure Java.
 * This code has no dependencies and can be copied and pasted into any project
 * that includes the accompanying Complex.java .
 *
 * @author  George Lancaster
 * @version 0.0.1
 * @since   14/01/2023
 */

public class FastFourierTransform 
{

     public Complex[] fft(Complex[] X) {
        Complex[] transformedX = new Complex[X.length];

        for (int i = 0; i < X.length; i++){
            transformedX[i] = X[i];
        }

        ditfft(transformedX, transformedX.length);
        return transformedX;
    }


    public void ditfft(Complex[] x, int N) {
        double term;
        Complex exp;
        Complex xEven[] = new Complex[N/2];
        Complex xOdd[] = new Complex[N/2];

        if (N <= 1) {
            return;
        }
        else {
            for (int i = 0; i < N/2; i++){
                xEven[i] = x[i * 2];
                xOdd[i] = x[i * 2 + 1];
            }
            ditfft(xEven, N / 2);
            ditfft(xOdd, N / 2);
        }

        for (int k = 0; k < (N / 2) -1; k++) {            
            term = (-2 * Math.PI * k) / N;
            exp = (new Complex(Math.cos(term), Math.sin(term)).mult(xOdd[k]));
            // Complex p = (new Complex(Math.cos(term), Math.sin(term)).mult(xOdd));

            x[k] = xEven[k].add(exp);
            x[N/2 + k] = xEven[k].sub(exp);     
        }
    }
}