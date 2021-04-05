class Demonstration
{
public  static void main(String args[])
{
int number,InvalidCount=0,validCount=0;
for(int i=0;i<args.length;i++)
{
try
{
number=Integer.parseInt(args[i]);
}
catch(NumberFormatException ne)
{
InvalidCount++;
System.out.println("Invalid number at "+i+" "+args[i]);
}
validCount++;
System.out.println("valid number at "+i+" "+args[i]);
}
System.out.println("Invalid entities:"+InvalidCount);
System.out.println("valid entities:"+validCount);
}
}