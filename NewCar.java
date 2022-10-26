class Car{
    String car = "Toyota";
}

public class NewCar extends Car{
    String car = "Nissan"; 
    public void myCar(){
       
    
        System.out.println(car); 
        System.out.println(super.car); // //super key word use in variable
    }
    public static void main(String[]args){
        NewCar obj = new NewCar();
        obj.myCar();
        }

}