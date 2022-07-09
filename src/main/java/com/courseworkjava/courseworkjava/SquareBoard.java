/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseworkjava.courseworkjava;

/**
 *
 * @author thatguykullie
 */
public class SquareBoard {
    public void squareBoard()
    {
        for( int i = 1; i <= 5; i++)
        {
            for(int j = 1; j<= 5;j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
