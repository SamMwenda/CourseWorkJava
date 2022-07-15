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
public class ReverseString {
   public void reverseString () {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str= console.nextLine();
        String nstr="";
        char ch;
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("The reverse of the String" + '"' +str+'"'+" is "+'"' +nstr+'"'  );
    } 
}
