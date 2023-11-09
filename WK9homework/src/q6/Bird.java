package q6;

public class Bird extends AnimalFamily{

    @Override
    public void Sound(){
        System.out.println("I have charp sound");
    }
    public static void main(String []args){
        Bird s1 = new Bird();
        s1.Sound();
    }




}
