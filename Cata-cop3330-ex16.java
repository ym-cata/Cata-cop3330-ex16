/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.*;
public class Main
{
  public static void main(String[] args) {
            
    int age;
    Scanner sc= new Scanner(System.in); //scans users input 
    System.out.print("What is your age? "); //asks user to input age 
      age=sc.nextInt();    
    if(age>=16) //uses if statement based on what the user inputs           
      System.out.println("You are old enough to legally drive");
    else              
      System.out.println("You are not old enough to legally drive");

                    
        }
}
