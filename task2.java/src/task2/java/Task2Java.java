/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2.java;


/**
 *
 * @author rusha
 */
import java.util.*;
public class Task2Java {

  
    public static void main(String[] args) {
       Random r=new Random();  
       Scanner sc =new Scanner(System.in);
       int num=r.nextInt(100);
       int win=0;
       int guess;
       int score=0;
       while(win!=1){
           System.out.println("**************************************************************************************");
           System.out.println("guess the number between 1 to 100");
           guess=sc.nextInt();
           if(guess==num){
               System.out.println("congratulations your guess was right and you have won the game");
               System.out.println("your score is "+score);
               win=1;
           }
           else if(guess>num){
               System.out.println("The number is less then guess ");
           }
           else if(guess<num){
               System.out.println("The number is greater then guess ");
           }
           ++score;
       }
    }
    
}
