
package javaapplication19;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java .io.PrintWriter;
public class JavaApplication19 {
public static void main(String[] args) throws FileNotFoundException, IOException {
       int choice;
    
       try {
           Scanner in = new Scanner(System.in);
           Geometry o1= new Geometry();
           System.out.println(" choose\n1. Calculate the area of a circle");
               System.out.println("2. Calculate the area of a Rectangle");
               System.out.println("3. Calculate the area of a triangle");
               System.out.println("4. Quit");
               //choice= in.nextInt();
          choice=in.nextInt();
           
           PrintWriter pr = new PrintWriter("d:/out.txt.txt");
           
                if(choice==1||choice==2 ||choice==3||choice==4) {
              
             
               switch(choice){
                   case 1:
                       System.out.println("Enter the radius");
                       double r=in.nextDouble();
                       System.out.println(o1.circleArea(r));
                    
                       double pp=o1.circleArea(r);
                       pr.print("the area is circle ");
                       pr.println(pp);
                       pr.flush();
                        break;
                   case 2:
                        System.out.println("Enter length and width");
                        double l=in.nextDouble();
                        double w=in.nextDouble();
                        System.out.println(o1.rectangleArea(l, w));
                        double p=o1.rectangleArea(l, w);
                        
                        pr.print("the area is rectangle ");
                        pr.println(p);
                        pr.flush();
                        break;
                    case 3:
                        System.out.println("Enter base and higth");
                        double b=in.nextDouble();
                        double h=in.nextDouble();
                        System.out.println(o1.triangleArea(b,h));
                        double p3=o1.triangleArea(h, b);
                        
                        pr.print("the area of triangle is ");
                        pr.println(p3);
                        pr.flush();
                        break;
                    case 4:
                        System.out.println("Quit");
                        break;
        }
               
             
       }
               
              
  
       }
        catch( Exceptioncustom a1){
              a1.string("the area is negative becouse you entered negative value");
        }
       
        //catch( Exceptionoutrange e1){
           //   e1.string("the area is negative becouse you entered negative value");
        //}


            
                    
       }
       
       
       
       
       
     
         
       
  
 }

    


