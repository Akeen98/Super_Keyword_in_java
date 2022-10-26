class Car{
    Car(){
        System.out.println("This is Parent class constructor");
    }
   
}

public class NewMethod1 extends Car{
    
    NewMethod1(){
        super();
        System.out.println("This is child class constructor"); 
        
   
    }
    
    public static void main(String[]args){
        NewMethod1 a = new NewMethod1();
       
        
        }

}