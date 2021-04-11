class StudentClass
{ 
  private String studenttype;
  private String labname;
  public student(String studenttype,String labname)
{
this.studenttype=studenttype;
this.labname=labname;
}
  void display()
  {
 System.out.println("student tupe is:"+studenttype);
    System.out.println("lab name:"+labname);
  }
}

class college extends StudentClass
{
public college(String studenttype,String labname)
{
super(studenttype,labname);
}
public void display()
{
super.display();
}
}

class Pdemo
{
public  static void  main(String a[])
{
StudentClass p1=new college("science student","practicals");
StudentClass p2=new collage("art student ","project");
p1.display();
p2.display();
}
}

