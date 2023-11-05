package autionmationtest;

public class Variable_Q2 {

 /* Declare two global variables with the name "id" and "name" with int and string type.*/
    String name;
    int id;
    /*Create a parameterized Constructor That assigns the value of the above two variables.*/
    Variable_Q2 (int id, String name){
        this.name = name;
        this.id = id;

    }
        /*Create a method with no return type no parameter with name "display" and write a SOUT statement to print the value of the above variables.*/
    public void display(){
        System.out.println(id +" - " + name );


    }
        /*Create the main method
2.6 Create the Object with name obj1 and pass the value '101', 'YourName'
2.7 Call the 'display method into the main method with obj1.
2.8 Create the second Object with name obj2 and pass the value '102', 'Prime'
2.9 Call the 'display method into the main method with obj2.*/
    public static void main(String []args){
        Variable_Q2 obj1 = new Variable_Q2(101,"Preksha Patel");
        obj1.display();
        Variable_Q2 obj2 = new Variable_Q2(102, "Codebuster");
        obj2.display();


    }

}
