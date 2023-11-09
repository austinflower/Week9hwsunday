package q13;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double salary;
    public int getEmployee_id(){
        return employee_id;
    }
    public void setEmployee_id(int employee_id){
        this.employee_id = employee_id;
    }
    public String getEmployee_name(){
        return employee_name;
    }
    public void setEmployee_name(String employee_name){
        this.employee_name = employee_name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public static void main(String []args){
        Employee e1 = new Employee();
        e1.setEmployee_id(200);
        e1.setEmployee_name("Sam");
        e1.setSalary(5000.25);
        System.out.println(e1.getEmployee_id());
        System.out.println(e1.getEmployee_name());
        System.out.println(e1.salary);

    }
}
