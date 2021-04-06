class Employee
{
 private int id;
 private String name;
Employee( int id,String name)
{
 this.id=id;
 this.name=name;
 }
public void display()
{
System.out.println("Employee Id:"+id);
System.out.println("Name:"+name);
}
}
class Edemo
{
public static void main(String args[]) 
 {
Employee e1=new Employee(1,"priya");
Employee e2=new Employee(2,"chopra");
e1.display();
e2.display();
}
}


