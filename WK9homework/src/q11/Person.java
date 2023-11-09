package q11;

public class Person {
    private String name;
    private int age;
    private String country;

    public String getName(){ return name;}
    public void setName(String name){this.name = name;}
    public int getAge (){return  age;}
    public void setAge(int age){this.age = age;}
    public String getCountry(){return country;}
    public void setCountry(String country){this.country = country;}

    public static void main(String []args){
        Person p = new Person();
        p.setName("preksha");
        p.setAge(40);
        p.setCountry("India");
        
        System.out.println(p.getName());
        System.out.println(p.getCountry());
        System.out.println(p.getAge());


    }
}
