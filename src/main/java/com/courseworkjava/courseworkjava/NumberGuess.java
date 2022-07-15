/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseworkjava.courseworkjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thatguykullie
 */
public class NumberGuess {
    public void numberGuess(){
        Scanner console = new Scanner(System.in);
        int min = 0,max= 100,count=0;
        Random randomNum = new Random();
        int secretNumber = min + randomNum.nextInt(max);
        System.out.println("java numberguess");
        System.out.println("Key in your guess: ");
        int guess = console.nextInt();
        while(guess != secretNumber)
        {
            if(guess > secretNumber)
            {
                System.out.println("Try lower");
                guess = console.nextInt();
            }
            else if(guess < secretNumber){
               System.out.println("Try higher"); 
               guess = console.nextInt();
            }
            count++;
        }
        System.out.println("You got it in "+ count + 1 +" trials!");
    }
}
