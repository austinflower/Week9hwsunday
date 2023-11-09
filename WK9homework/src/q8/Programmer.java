package q8;

public class Programmer extends Employee{
    @Override
    public double calculateSalary(){
        double baseSalary = 2500;
        return baseSalary;

    }
    public static void main(String [] arge){

        Employee e1 = new Manager();
        Employee e2 = new Programmer();
        double mangerSalary = e1.calculateSalary();
        double progsalary = e2.calculateSalary();
        System.out.println("Manager's salary: $"+mangerSalary);
        System.out.println("Programmer's salary: $"+progsalary);
        }
    }



