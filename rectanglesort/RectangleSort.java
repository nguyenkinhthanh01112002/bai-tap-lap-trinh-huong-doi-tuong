/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rectanglesort;

import java.util.Arrays;

/**
 *
 * @author KINHTHANH
 */
public class RectangleSort 
{

    public static void main(String[] args)
    {
       Rectangle vec[];
       vec = new Rectangle[10];
       double randomWidth = 0, randomHeight=0;
       for(int index=0;index<vec.length;index++)
       {
           randomWidth = 100*Math.random();
           randomHeight = 100*Math.random();
           vec[index] = new Rectangle(randomWidth,randomHeight);
       }
       Arrays.sort(vec);
       for(int index=0;index<vec.length;index++)
       {
           System.out.println("Dien tich HCN"+index+"= "+Math.round(vec[index].area())+", ");
       }
    }
}
