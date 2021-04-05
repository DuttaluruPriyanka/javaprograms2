interface Shape
{
public void display();
}
class Circle implements Shape
{
public void display()
{
System.out.println("Circle");
}
}
class Rectangle implements Shape
{
public void display()
{
System.out.println("Rectangle");
}
}
class Square implements Shape
{
public void display()
{
System.out.println("Square");
}
}
class IDemo
{
public static void main (String a[])
{
Shape S1=new Circle();
Shape S2=new Rectangle();
Shape S3=new Square();
S1.display();
S2.display();
S3.display();
}
}

