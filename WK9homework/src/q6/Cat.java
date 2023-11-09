package q6;

public class Cat extends AnimalFamily {
    @Override
    public void Sound(){
        System.out.println("I have a meow sound");
    }
    public static void main(String []args){
        Cat noies = new Cat();
        noies.Sound();

    }

}
