package autionmationtest;

public class ForLoop_Q4 {
    /*Create the class with the name "ForLoop_Q4"*/
    /*Create a method with the name "printMyName" with no return type and two parameters
    with the type string and name "name" and int type name 'howManyTime'.*/
    /*Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
     */
     public void printMyName(String name, int howManyTime){
          for (int i =0; i <= howManyTime; i++ ){
               System.out.println("howManyTime = " + howManyTime + "-"+ name);
          }

     }
     public static void main(String []args){
          ForLoop_Q4 m2 = new ForLoop_Q4();
          m2.printMyName("Preksha", 10);
          m2.printMyName("Preksha", 15);
     }
}
