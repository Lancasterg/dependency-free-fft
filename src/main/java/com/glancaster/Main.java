package com.glancaster;


public class Main 
{
    public static void main( String[] args )
    {

        // Instantiate array of complex numbers
        Complex[] x = new Complex[100];

        // Fill the array with complex numbers of the form (k + 3i)
        for (int k = 1; k < 100; k++){
            x[k] = new Complex(k, 3);
        }

        // Perform transform
        FastFourierTransform FFT = new FastFourierTransform();
        FFT.fft(x);

        // Print the result
        for (Complex xi : x){
            System.out.println(xi);
        }
 
    }
}
