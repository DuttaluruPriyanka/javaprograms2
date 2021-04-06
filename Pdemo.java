class StudentClass
{
public void display()
{
System.out.println("class");
}
}
class ScienceStudent extends StudentClass
{
private String practical;
public  ScienceStudent(String practical)
{
this.practical=practical;
}
public void display()
{
System.out.println(" Science student add practical");
}
}
class ArtStudent extends StudentClass
{
private String project;
public  ArtStudent(String project)
{
this.project=project;
}
public void display()
{
System.out.println(" Art student add projects");
}
}
class Pdemo
{
public  static void  main(String a[])
{
StudentClass p1=new ScienceStudent("practical");
StudentClass p2=new ArtStudent("project");
p1.display();
p2.display();
}
}

