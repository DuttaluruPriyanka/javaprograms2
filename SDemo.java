abstract  class Shape
{
public abstract void display();
}
class Circle extends Shape
{
public void display()
{
System .out.println("Circle");
}
}
class Rectangle extends Shape
{
public void display()
{
System .out.println("Rectangle");
}
}
class Square extends Shape
{
public void display()
{
System .out.println("Square");
}
}
class SDemo
{
public static void main(String a[])
{
Shape S1=new Circle();
Shape S2=new Rectangle();
Shape S3=new Square();
S1.display();
S2.display();
S3.display();
}
}


