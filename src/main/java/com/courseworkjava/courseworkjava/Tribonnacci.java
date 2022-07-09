/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseworkjava.courseworkjava;

/**
 *
 * @author thatguykullie
 */
public class Tribonnacci {
    public void tribonacciNumbers(){    
        int n1=1,n2=1,n3 = 1,n4 = 1,i,sum = 0,count=20;
        double average  = 0;
        System.out.print(n1+" "+n2);//printing 0 and 1    
    
        for(i=3;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
            n4=n1+n2+n4;    
            System.out.print(" "+n4);
            sum += n4;
            n1=n2;    
            n2=n3;
            n3 = n4;
        }  
        average = sum/count;
        System.out.print("\nThe average is "+average);
     }
}
