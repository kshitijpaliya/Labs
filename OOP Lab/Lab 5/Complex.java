/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Complex 
{
    double real;
    double imaginary;
    
    public Complex (double r, double i)
    {
        real=r;
        imaginary=i;
    }
    
    public void display()
    {
        System.out.println(real+ "r" + imaginary + "i");
    }
    
    public void add(int num, Complex complexNum)
    {
        double newReal = real + num;
        double newImaginary = imaginary + complexNum.imaginary;
        System.out.println("The sum is " + newReal + "+" + newImaginary + "i" );
    }
    
    
    public void main (String args[])
    {
    }
}