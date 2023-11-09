package q9;

public class Panther extends Animal{
    @Override
    public void move(){
        System.out.println("Panther is moving fast");

    }
    @Override
    public void makeSound(){
        System.out.println("Panther makes purr sound");

    }
    public static void main(String []args){
        Panther p1 = new Panther();
        p1.move();
        p1.makeSound();
        Bird b1 = new Bird();
        b1.move();
        b1.makeSound();

    }
}
