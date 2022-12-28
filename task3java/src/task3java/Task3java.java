/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3java;

/**
 *
 * @author rusha
 */
import java.util.*;
public class Task3java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for withdraw");
        System.out.println("enter 2 for deposit");
        System.out.println("enter 3 for transfer");
        System.out.println("enter 4 for transaction histScannerory");
        System.out.println("enter 5 to exit");
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        int b=1000;
        int t=0;
        int d=0;
        int w=0;
        int ac=0;
        System.out.println("enter your account number");
        int an=sc.nextInt();
        System.out.println("enter your pin");
        int pin=sc.nextInt();
        if((an==4321 && pin==2341)||(an==9876 && pin==7896)||(an==2468 && pin==36912) ){
        while(ch!=5){
            
            if(ch==1){
                System.out.println("enter the withdraw amount ");
                w=sc.nextInt();
                if(w<=b){
                    b=b-w;
                    System.out.println("now your total balance is :"+b);
                }
                else{
                    System.out.println("the bank balance is less than the withdraw amount");
                }
                
            }
            else if(ch==2){
                System.out.println("enter the amount you want to diposit ");
                d=sc.nextInt();
                b=b+d;
                System.out.println("now your total balance is :"+b);
                
            }
            else if(ch==3){
                System.out.println("enter the amount you want to transfer");
                t=sc.nextInt();
                if(t<=b){
                    System.out.println("enter the account number to which you want to transfer the money");
                    ac=sc.nextInt();
                    if(ac==an){
                        System.out.println("you cant transfer money to your own account");
                    }else{
                    b=b-t;
                    System.out.println("now your total balance is :"+b);
                }}
                else{
                    System.out.println("the bank balance is less than the transfer amount");
                }
                
                
            }
            else if(ch==4){
                System.out.println("last withdraw amount is :"+w);
                System.out.println("last deposit amount is :"+d);
                if(ac==an){
                }else{
                System.out.println("last transfer was to account  "+ac+" and amount was :"+t);

                }
            
            }
            else{
                System.out.println("enter a valid choice");
            }
            
        System.out.println("=============================================================================================================");
        System.out.println("enter 1 for withdraw");
        System.out.println("enter 2 for deposit");
        System.out.println("enter 3 for transfer");
        System.out.println("enter 4 for transaction history");
        System.out.println("enter 5 to exit");

        System.out.println("enter your choice");
        ch=sc.nextInt(); 
                
                
        }
            System.out.println("THANK YOU FOR USING OUR SERVICE VISIT AGAIN");
        }
        else{
            System.out.println("please enter a valid account number and pin");
        
        }


    }
    
}
