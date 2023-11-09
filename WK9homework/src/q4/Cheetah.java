package q4;

public class Cheetah extends Animal{
    /*4. Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.*/
    @Override
    public void move(){
    System.out.println("Cheetah is running");

    }
    public static void main(String []args){
        Cheetah m1 = new Cheetah();
        m1.move();
    }

}

