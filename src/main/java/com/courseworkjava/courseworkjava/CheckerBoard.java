/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseworkjava.courseworkjava;

/**
 *
 * @author thatguykullie
 */
public class CheckerBoard {
   public void checkerBoard()
   {
        for( int i = 1; i <= 7; i++)
        {
            for(int j = 1; j<= 7;j++)
            {
                if (i%2 == 0)
                {
                    System.out.print(" #");
                }
                else
                {
                    System.out.print("# ");
                }
            }
            System.out.print(" ");
            System.out.println();
            
        }
   }
}
