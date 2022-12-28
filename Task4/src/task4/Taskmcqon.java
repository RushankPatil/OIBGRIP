/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4;

/**
 *
 * @author rusha
 */
import java.util.*;
public class Taskmcqon {
    Timer t;
    Scanner sc=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public void Time(int sec){
        t=new Timer();
        t.schedule(new end(), sec*1000);
    }
    class end extends TimerTask{
        public void run(){
            System.out.println("your time has ended thank you");
            t.cancel();
            
        }
    }
    public void display(){
    System.out.println("enter 1 for changing pin");
    System.out.println("enter 2 for giving MCQ test");
    System.out.println("enter 3 to logout");
    System.out.println("enter your choice");
    }
    public static void main(String[] args) {
      
        // TODO code application logic here
      Taskmcqon a=new Taskmcqon();
      Scanner sc=new Scanner(System.in);
    
        System.out.println("enter your login id");
        int li=sc.nextInt();
        System.out.println("enter your pin");
        int pin=sc.nextInt();
        if((li==4321)||(li==9876)||(li==2468) &&( pin==36912) ){
                    a.display();
                    int ch=sc.nextInt();



        while(ch!=3){
            
            if(ch==1){
                System.out.println("enter the new pin ");
                int pin1= sc.nextInt();
                pin=pin1;
                System.out.println("you have successfully changed your pin \n your new pin is :"+pin);
                
            }
            else if(ch==2){
                int marks=0;
               a.Time(300);
                System.out.println("enter your answer ");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                int ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                
                }

                  
                System.out.println("enter your answer 2 ");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                }   
                System.out.println("enter your answer 3");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                }    
                System.out.println("enter your answer 4 ");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                } 
                System.out.println("enter your answer 5");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                }   
                System.out.println("enter your answer 6 ");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                }  
                System.out.println("enter your answer 7 ");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                }    
                System.out.println("enter your answer 8");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                }   
                System.out.println("enter your answer 9");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                }   
                System.out.println("enter your answer 10");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                ans=sc.nextInt();
               
                if(ans==3){
                    marks++;
                }
                
                System.out.println("you score is "+marks);
            }
            else{
                System.out.println("enter a valid choice");
            }
            
        System.out.println("=============================================================================================================");
        a.display();
        ch=sc.nextInt();
 
                
        }
            System.out.println("THANK YOU FOR USING OUR SERVICE VISIT AGAIN");
        }
        else{
            System.out.println("please enter a valid login id and pin");
        
        }


    }
    
}

    
    

