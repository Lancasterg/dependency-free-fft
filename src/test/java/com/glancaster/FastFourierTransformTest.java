package com.glancaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class FastFourierTransformTest {
    Complex cplx_0_0 = new Complex(0, 0);
    Complex cplx_1_1 = new Complex(1, 0);
    
    @Test
    public void testFFT() {
        Complex input[] = {cplx_1_1, cplx_1_1, cplx_1_1, cplx_1_1, cplx_0_0, cplx_0_0, cplx_0_0, cplx_0_0};
        Complex truth[] = {
            new Complex(4, 0), 
            new Complex(1, -2.414214),
            new Complex(0, 0),
            new Complex(1, -0.414214),
            new Complex(0, 0),
            new Complex(1, 0.414214),
            new Complex(0, 0),
            new Complex(1, 2.414214),
        };

        Complex output[];

        FastFourierTransform FFT = new FastFourierTransform();
        output = FFT.fft(input);

        for (int i = 0; i < input.length; i++) {
            assertEquals(truth[i].getRealPart(), output[i].getRealPart(), 0.01);
            assertEquals(truth[i].getImagPart(), output[i].getImagPart(), 0.01);
        }
    }

    @Test
    public void testInputUnchanged(){
        Complex input[] = {cplx_1_1, cplx_1_1, cplx_1_1, cplx_1_1, cplx_0_0, cplx_0_0, cplx_0_0, cplx_0_0};
        Complex truth[] = {cplx_1_1, cplx_1_1, cplx_1_1, cplx_1_1, cplx_0_0, cplx_0_0, cplx_0_0, cplx_0_0};
        Complex output[];

        FastFourierTransform FFT = new FastFourierTransform();
        output = FFT.fft(input);

        for (int i = 0; i < input.length; i++) {
            assertEquals(truth[i].getRealPart(), input[i].getRealPart(), 0.01);
            assertEquals(truth[i].getImagPart(), input[i].getImagPart(), 0.01);
        }

    }

}
