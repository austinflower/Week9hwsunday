package q2;

public class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Repairing a car");

    }
    public static void main(String []args){
        Car m1 = new Car();
        m1.drive();

    }
}
