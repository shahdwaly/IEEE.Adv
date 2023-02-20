
package javaapplication19;

public class Geometry {
    public double raduis;
    public double length;
    public double width;
    public double higth;
    public double base;
    int choice;
    public double circleArea(double r) throws Exceptioncustom{
        this.raduis=r;
        double Area =3.14*r;
        if (Area<0){
            throw new Exceptioncustom("the area of circle is negative");
        }
        
            return Area;
    }
    public double rectangleArea(double length ,double width) throws Exceptioncustom{
        this.length=length;
        this.width=width;
        double Area =length*width;
         if (Area<0||width<0||length<0){
            throw new Exceptioncustom("the area of rectangle is negative");
        }
        
        return Area;
    }
    public double triangleArea(double heigth,double base) throws Exceptioncustom{
        this.base=base;
        this.higth=heigth;
       double Area = 0.5*base*heigth;
        if (Area<0||base<0||higth<0){
            throw new Exceptioncustom("the area of triangle is negative");
        }
        
        return Area;
    }
    public int choice(int c) throws Exceptionoutrange{
     
           this.choice=c;
           
                    if(choice<0||choice>4){
                         throw new Exceptionoutrange("the area of triangle is negative");
            
           
       }
       
       return c;}
        
           
}
     

       
