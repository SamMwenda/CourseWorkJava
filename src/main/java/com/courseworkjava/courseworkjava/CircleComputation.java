/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseworkjava.courseworkjava;

import java.util.Scanner;

/**
 *
 * @author thatguykullie
 */
public class CircleComputation {
    public void circleComputation(){
        double area = 0, circumfrence = 0;
        Scanner console = new Scanner(System.in);
      int number = 0;
        while (number != -1){
           System.out.print("Enter the radius: ");
           number = console.nextInt();
           area = 3.14 * number * number;
           circumfrence = 3.14 * (number *2);
           System.out.println("The area is: " + area);
           System.out.println("The circumference is: " + circumfrence);
        }
        
    }
}
