/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectanglesort;

/**
 *
 * @author KINHTHANH
 */
public class Rectangle extends Shape implements Comparable
{
    double width;
    double height;    
    public Rectangle(double w,double h)
    {
        width = w;
        height = h;
    }
    public double area()
    {
        return width*height;
    }
    public int compareTo(Object other)
    {
        Shape otherRect = (Shape)other;
        return (int)(this.area()-otherRect.area());
    }
    
}
