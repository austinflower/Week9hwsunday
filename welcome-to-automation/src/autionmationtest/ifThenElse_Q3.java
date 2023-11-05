package autionmationtest;

public class ifThenElse_Q3 {

    /*3.1 Create the class with the name "IfThenElse_Q3"*/
    /*3.2 Create a method with the name "isTeen" with boolean return type and one parameter with type int and name "age".
     */
    public boolean isTeen(int age){
     /*3 Write the logic into the "isTeen" method. if age is less than or equal to 18 then return 'true'
    else return 'false'.*/
        if (age<= 18){
            return true;

        }else {return false;}
    }/* Create the main method
3.5 Create the Object and call the 'isTeen' method inside the sout statement.

*/
    public static void main(String []args){
        ifThenElse_Q3 m1 = new ifThenElse_Q3();

        System.out.println("15 - "+ m1.isTeen(15));
        System.out.println("25 - "+ m1.isTeen(25));


    }


}
