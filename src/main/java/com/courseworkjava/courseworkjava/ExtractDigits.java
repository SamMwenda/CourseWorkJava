/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseworkjava.courseworkjava;

/**
 *
 * @author thatguykullie
 */
public class ExtractDigits {
    public void extractDigits()
    {
        int number = 15423;
         int reversedDigit = 0;
        while (number != 0)
        {
            int remainder = number % 10; 
            reversedDigit = reversedDigit * 10 + remainder;
            number = number/10; 
        }
        System.out.println(reversedDigit);
    }
}
