package com.glancaster;


public class Main 
{
    public static void main( String[] args )
    {

        // // Init array of complex numbers
        // Complex[] x = new Complex[256];

        // // Fill the array with complex numbers of the form (k + k^2i)
        // System.out.println("Input data start");
        // for (int k = 0; k < 256; k++){
        //     x[k] = new Complex(k + 1, (k + 1) * (k + 1));
        //     System.out.printf("%03d: %s\n", k, x[k].toString());
        // }
        // System.out.println("Input data end");
        
        // // Perform transform
        // FastFourierTransform FFT = new FastFourierTransform();
        // Complex[] y = FFT.fft(x);

        // // Print the result
        // System.out.println("Output data start");
        // for (int k = 0; k < y.length; k++ ){
        //     System.out.printf("%03d: %s\n", k, y[k].toString());
        // }
        // System.out.println("Output data end");
        testFFT();

    }

    public static void testFFT() {
        double[] input = {1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0};

        Complex[] cinput = new Complex[input.length];

        for (int i = 0; i < input.length; i++)
            cinput[i] = new Complex(input[i], 0.0);

        FastFourierTransform FFT = new FastFourierTransform();
        Complex[] y = FFT.fft(cinput);

        System.out.println("Results:");
        for (Complex c : y) {
            System.out.println(c);
        }
    }
    
}
