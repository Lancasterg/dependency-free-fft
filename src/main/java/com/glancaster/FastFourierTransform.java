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
    public FastFourierTransform() {

    }


     public Complex[] fft(Complex[] X) {
        ditfft(X, X.length - 1, 1);
        return X;
    }


    public void ditfft(Complex[] x, int N, int stride) {
        Complex xEven[] = new Complex[N/2];
        Complex xOdd[] = new Complex[N/2];

        if (N == 1) {
            xEven = new Complex[]{x[0]};
            xOdd = new Complex[]{x[1]};
        }
        else {
            for (int i = 0; i < N/2; i++){
                xEven[i] = x[i * 2];
                xOdd[i] = x[i + stride];
            }
            ditfft(xEven, N / 2, 2 * stride);
            ditfft(xOdd, N / 2, 2 * stride);
        }

        for (int k = 0; k < (N / 2) -1; k++) {
            Complex pEven = xEven[k];
            Complex pOdd = xOdd[k];

            float term = (float) ((-2 * Math.PI * k) / (float) N);
            Complex exp = new Complex( (float) Math.cos(term), (float) Math.sin(term));

            exp.mult(pOdd);

            Complex xk = pEven;
            xk.add(exp);
            x[k] = xk;

            Complex xk1 = pOdd;
            xk1.sub(exp);

            x[k + 1] = xk1;                
            }
    }
}