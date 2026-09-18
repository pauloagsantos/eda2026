/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha0;

/**
 *
 * @author IPT
 */
public class Complex {
    private double r,i;
    
    
    /**
     * Create an complex number on 0+0i
     */
    public Complex() {
        this(0,0);
    }
    
    /**
     * Create an new Complex number
     * @param a real part of the complex number
     * @param b imaginary part of the complex number
     */
    public Complex(double a, double b) {
        this.r = a;
        this.i = b;
    }

    public double getReal() {
        return r;
    }

    public double getImaginary() {
        return i;
    }
    
    public static Complex sum(Complex c1, Complex c2) {
        double r = c1.r+c2.r;
        double i = c1.i+c2.i;
        return new Complex(r,i);
    }
    
    public static Complex sub(Complex c1, Complex c2) {
        double r = c1.r-c2.r;
        double i = c1.i-c2.i;
        return new Complex(r,i);
    }
    
    public static Complex mul(Complex c1, Complex c2) {
        double r = c1.r*c2.r-c1.i*c2.i;
        double i = c1.r*c2.i+c1.i*c2.r;
        return new Complex(r,i);
    }
    
    public static Complex div(Complex c1, Complex c2) {
        Complex num = mul(c1, conjugated(c2));
        Complex den = mul(c2, conjugated(c2));
        return new Complex(num.r/den.r, num.i/den.r);
    }
    
    public static Complex conjugated(Complex c) {
        return new Complex(c.r, -1*c.i);
    }

    @Override
    public String toString() {
        String str = String.valueOf(r);
        if (i>=0)
            str +="+";
        str += String.valueOf(i);
        str += "i";
        
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complex other = (Complex) obj;
        if (Double.doubleToLongBits(this.r) != Double.doubleToLongBits(other.r)) {
            return false;
        }
        return Double.doubleToLongBits(this.i) == Double.doubleToLongBits(other.i);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Complex(r,i);
    }
    
    
}
