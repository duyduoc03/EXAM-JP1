package EXAM;

public class Complex {
    public double real;
    public double imaginary;

    public Complex(){

    }

    public Complex (double realPart, double imaginaryPart){
        real = realPart;
        imaginary = imaginaryPart;
    }

    public Complex add (Complex C1, Complex C2){
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }
    public Complex subtract (Complex C1, Complex C2){
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
    }
    public Complex multiply(Complex C1, Complex C2){
        Complex temp = new Complex();
        temp.real = C1.real * C2.real;
        temp.imaginary = C1.imaginary * C2.imaginary;
        return temp;
    }
    public Complex divide (Complex C1, Complex C2){
        Complex temp = new Complex();
        temp.real = C1.real / C2.real;
        temp.imaginary = C1.imaginary / C2.imaginary;
        return temp;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public String toString(){
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
        return null;
    }
}