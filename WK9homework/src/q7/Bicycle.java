package q7;

public class Bicycle extends Vehicle {
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("Bicycle speed increased by 5 mph");

    }

    public static void main (String [] args){
        Car v1 = new Car();
        Bicycle v2 = new Bicycle();
        v1.speedUp();
        v2.speedUp();
        System.out.println("Car speed: "+ v1.getSpeed()+ " mph");
        System.out.println("Bicycle speed: " + v2.getSpeed() + " mph");


    }
}
