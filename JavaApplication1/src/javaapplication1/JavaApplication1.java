/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;
class CreateTableExample {
  
private static final String CREATE_TABLE="CREATE TABLE railway("+"USER_ID int(10) NOT NULL,"+"FULLNAME VARCHAR(20) NOT NULL,"+"trainN varchar(20) NOT NULL,"+"EMAIL VARCHAR(50) NOT NULL)";
  
public static void main(String[] args) 
{
    

    Connection connect = null;
    PreparedStatement statement = null;

    try 
{
connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/rail", "root", "1234");
statement = connect.prepareStatement(CREATE_TABLE);
statement.executeUpdate();

System.out.println("Table created");

}catch(SQLException e) 
{
e.printStackTrace();
}finally
{
      try {
        if (statement != null) {
          statement.close();
        }
        if (connect!= null) {
          connect.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}*/
import java.sql.*;
import java.util.*;

class reservation{
    public void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("*************************************************");
        System.out.println("enter 1 for reservation");
        System.out.println("enter 2 for cancelling the ticket");
        System.out.println("enter 3  if you are authorized person");
        System.out.println("enter 4 for exit");
        System.out.println("enter choice");


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       reservation a =new reservation();
       a.display();
        int choice;
                int s1=0,cs1,us1=0;
                int s2=0,cs2,us2=0;
                int s3=0,cs3,us3=0;
                int s4=0,cs4,us4=0;



    try{
            
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/rail", "root", "1234");

    choice=sc.nextInt();
    while(choice!=4){
        if (choice==1){
         
      System.out.println("Enter user Id:");
      String userid =sc.next();
      System.out.println("Enter FULL NAME");
      String name =sc.next();
      System.out.println("enter 1 for solapur express that will run from solapur to pune");
      System.out.println("enter 2for solapur DEHLI express and will run from solapur to dehli ");
      System.out.println("enter 3 for solapur mumbai express and will run from solapur to mumbai");
      System.out.println("enter 4 for benglore express and will run from solapur to benglore ");
      System.out.println("Enter train number:");
      String trainN = sc.next();
      System.out.println("Enter Emailid:");
      String email = sc.next();
      PreparedStatement pst = connect.prepareStatement("insert into railway(USER_ID,FULLNAME,trainN,EMAIL) values(?,?,?,?)");
 
         pst.setString(1,userid);
         pst.setString(2, name);
         pst.setString(3, trainN);
         pst.setString(4, email);
          //  s=us;
          int tn=Integer.parseInt(trainN);
        if(tn==1){
        System.out.println("enter  no seats you want to book");
        s1=sc.nextInt();
        if ((s1+us1)>50){
            System.out.println("no seats are availablein this train ");
        }
        else{
            
        System.out.println("no of seats booked"+(s1+us1));
        }
        }
        else if(tn==2){
                 System.out.println("enter  no seats you want to book");

                s2=sc.nextInt();
                if ((s2+us2)>50){
            System.out.println("no seats are availablein this train ");
        }
        else{
            
        System.out.println("no of seats booked"+(s2+us2));
        }
        }
        else if(tn==3){
                System.out.println("enter  no seats you want to book");

                s3=sc.nextInt();
            if ((s3+us3)>50){
            System.out.println("no seats are availablein this train ");
        }
        else{
            
        System.out.println("no of seats booked"+(s3+us3));
        }
        }
        else if(tn==4){
            System.out.println("enter  no seats you want to book");

            s4=sc.nextInt();
            if ((s4+us4)>50){
            System.out.println("no seats are availablein this train ");
        }
        else{
            
        System.out.println("no of seats booked"+(s4+us4));
        }}
        else{
            System.out.println("please enter a valid train number");
        }

  int i = pst.executeUpdate();
  if(i!=0){
        System.out.println("ticket booked successfuly");
        System.out.println("This ticket is non-refundable and non-transferable.");

      }
      else{
        System.out.println("failed");
      }

    }
        
        else if(choice==2){
        System.out.println("Enter user Id:");
        String userid =sc.next();
        System.out.println("enter the train number");
        int tn=sc.nextInt();
        if(tn==1||tn==2||tn==3||tn==4){
        if(s1>0||s2>0||s3>0||s4>0){
        if(tn==1){
                System.out.println("enter no of seats to be canceled");

        cs1=sc.nextInt();
        if((s1+us1)<cs1){
            System.out.println("the no of seats you have entered are to cancel are greater then no of seats booked ");
        }else{
        us1=(s1+us1)-cs1;
        
            System.out.println("your tickit has been canceled sussfully");
        }
        }
          
        else if(tn==2){
            System.out.println("enter no of seats to be canceled");

        cs2=sc.nextInt();
            if((s2+us2)<cs2){
                    System.out.println("the no of seats you have entered are to cancel are greater then no of seats booked ");

            }else{

        us2=(s2+us2)-cs2;
        
        
            System.out.println("your tickit has been canceled sussfully");
        }
        }
        else if(tn==3){
        System.out.println("enter no of seats to be canceled");
        cs3=sc.nextInt();
            if((s3+us3)<cs3){            
                System.out.println("the no of seats you have entered are to cancel are greater then no of seats booked ");

            }else{

        us3=(s3+us3)-cs3;
        
            System.out.println("your tickit has been canceled sussfully");
        }
        }
       else if(tn==4){
            System.out.println("enter no of seats to be canceled");

        cs4=sc.nextInt();
            if((s4+us4)<cs4){          
                System.out.println("the no of seats you have entered are to cancel are greater then no of seats booked ");
            }else{

        us4=(s4+us4)-cs4;
        
            System.out.println("your tickit has been canceled sussfully");
        }
        }
      
        }
        else{
            System.out.println("there are no reserved seats in this train to cancel");
        }
        }else{
            System.out.println("enter valid train number");}
        }
        else if(choice==3){

            System.out.println("Enter your unique id no");
            int uidno =sc.nextInt();
                Statement mystatement = connect.createStatement();
                ResultSet output=mystatement.executeQuery("select * from railway");
                if(uidno==2281208){
                    System.out.println("here is the histroy of people that where here for reservation ");
                    System.out.println("==============================================================\n");    

                    while(output.next()){
                System.out.println(output.getString("USER_ID")+" || "+output.getString("FULLNAME")+" || "+output.getString("trainN")+" || "+output.getString("EMAIL"));  
          
                  }
                System.out.println("=================================================================\n");    

                System.out.println("total no of seats booked in train number 1 are "+us1);
                System.out.println("total no of seats booked in train number 2 are "+us2);
                System.out.println("total no of seats booked in train number 3 are "+us3);
                System.out.println("total no of seats booked in train number 4 are "+us4);

                System.out.println("================================================================\n");    
          
            }
                else{
                    System.out.println("wrong id you are not allowed to view this data");}
        }
        else if(choice>4){
            System.out.println("please choose a valid option ");
        }

    
        
        a.display();
        choice=sc.nextInt();

        
        }
            System.out.println("thanks for using our service");        
            Class.forName("mysql.jdbc.Driver");

 

    
    }
     catch (Exception e){
            System.out.println(""+e);
    }
  
}
}

