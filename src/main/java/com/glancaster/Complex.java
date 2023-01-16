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
    private double real;
    private double imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double realNumber, double imagNumber) {
        this.real = realNumber;
        this.imag = imagNumber;
    }

    public double getRealPart() { return this.real; }

    public double getImagPart() { return this.imag; }

    public void setRealPart(double realNumber) { this.real = realNumber; }

    public void setImagPart(double imagNumber) { this.imag = imagNumber; }

    @Override
    public String toString() {
        return String.format("%.3f + %.3fi", this.real, this.imag);
    }

    public Complex add(Complex x) {
        return new Complex(this.getRealPart() + x.getRealPart(), this.getImagPart() + x.getImagPart());
    }

    public Complex mult(Complex x) {
        /*
         * (a+bi)(c+di) = (ac−bd) + (ad+bc)i
         */
        return new Complex(
            (this.getRealPart() * x.getRealPart()) - (this.getImagPart() * x.getImagPart()), 
            (this.getRealPart() * x.getImagPart()) + (this.getImagPart() * x.getRealPart())
            );
    }

    public Complex mult(double x) {
        return new Complex(x * this.getRealPart(), x * this.getImagPart());
    }

    public Complex sub(Complex x) {
        return new Complex(this.getRealPart() - x.getRealPart(), this.getImagPart() - x.getImagPart());
    }

    public boolean equals(Complex cmp) {
        if (this.getRealPart() == cmp.getRealPart() && this.getImagPart() == cmp.getImagPart()){
            return true;
        }
        else{
            return false;
        }
    }

}