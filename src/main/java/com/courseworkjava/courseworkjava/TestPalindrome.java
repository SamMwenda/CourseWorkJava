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
public class TestPalindrome {
    public void isPalindrome () {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str= console.nextLine().toLowerCase();
        String nstr="";
        char ch;
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      if (!nstr.toLowerCase().equals(str)){
        System.out.println(str + " is not a palindrome");  
      }else{
         System.out.println(str + " is a palindrome");
      }
      
    } 
}
