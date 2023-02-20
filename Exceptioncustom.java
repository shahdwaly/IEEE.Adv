
package javaapplication19;

public class Exceptioncustom extends Exception {

    public Exceptioncustom() {
        super();
    }
    
    Exceptioncustom(String msg){
        super(msg);
    }
    public void string(String s){
        System.out.print(s);
    }
    
    
    
}
