class Car{
    public void myCar(){
        System.out.println("This is Parent class");
    }
   
}

public class NewMethod extends Car{
    
    public void myCar(){
        System.out.println("This is child class"); 
   
    }
    void work(){
        myCar();
        super.myCar();//super key word use in method

    }
    public static void main(String[]args){
        NewMethod obj = new NewMethod();
       obj.work();
        
        }

}