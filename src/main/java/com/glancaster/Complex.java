package com.glancaster;

/**
 * 
 * Supporting class to allow for the Fourier transform to be applied to 
 * complex numbers. A complex number is made of a real and imaginary part, 
 * and this class intends to encapsulate that. 
 *
 * @author  George Lancaster
 * @version 0.0.1
 * @since   14/01/2023
 */

public class Complex {
    private float real;
    private float imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(float realNumber, float imagNumber) {
        this.real = realNumber;
        this.imag = imagNumber;
    }

    public float getRealPart() { return this.real; }

    public float getImagPart() { return this.imag; }

    public void setRealPart(float realNumber) { this.real = realNumber; }

    public void setImagPart(float imagNumber) { this.imag = imagNumber; }

    @Override
    public String toString() {
        return String.format("%.1f + %.1fi", this.real, this.imag);
    }

    public void add(Complex x) {
        this.setRealPart(this.getRealPart() + x.getRealPart());
        this.setImagPart(this.getImagPart() + x.getImagPart());
    }

    public void mult(Complex x) {
        /*
         * (a+bi)(c+di) = (ac−bd) + (ad+bc)i
         */
        float realPart = (this.getRealPart() * x.getRealPart()) - (this.getImagPart() * x.getImagPart());
        float imagPart = (this.getRealPart() * x.getImagPart()) + (this.getImagPart() * x.getRealPart());

        this.setRealPart(realPart);
        this.setImagPart(imagPart);
    }

    public void mult(float x) {
        this.setRealPart(x * this.getRealPart());
        this.setImagPart(x * this.getImagPart());
    }

    public void sub(Complex x) {
        this.setRealPart(this.getRealPart() - x.getRealPart());
        this.setImagPart(this.getImagPart() - x.getImagPart());
    }

}