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
public class GradesAverage {
    public void gradesAverage(){
        double sum = 0,average = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = console.nextInt();
        int[] marks = new int [numStudents];
        for(int i = 1; i<= marks.length;i++){
            System.out.print("Enter the grade for student " + i + ": ");
            int mark = console.nextInt();
            if(mark > 100 || mark < 0){
                System.out.println("Invalid grade, try again...");
                System.out.print("Enter the grade for student " + i + ": ");
                mark = console.nextInt();
            }
            marks[i-1] = mark;
            sum += marks[i-1];
        }
        System.out.print("The average is: "+ sum/numStudents);
    }
}
