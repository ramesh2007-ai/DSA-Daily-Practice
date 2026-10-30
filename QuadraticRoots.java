import java.util.Scanner;
public class QuadraticRoots
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a:");
double a=sc.nextDouble();
System.out.println("enter b:");
double b=sc.nextDouble();
System.out.println("enter c:");
double c=sc.nextDouble();
double D=b*b-4*a*c;
System.out.println("discriminant value:"+D);
if(D>0)
{
double root1=(-b+Math.sqrt(D))/(2*a);
double root2=(-b-Math.sqrt(D))/(2*a);
System.out.println("roots are real and distict roots:");
System.out.println("root1:"+root1);
System.out.println("root2:"+root2);
}
else if(D==0)
{
double root=-b/(2*a);
System.out.println("the roots are real and equal:");
System.out.println("root1 and root2 is:"+root);
}
else
{
double realpart=-b/(2*a);
double imgpart=Math.sqrt(-D)/(2*a);
System.out.println("roots are complex and imaginary");
System.out.println("root1="+realpart+"+"+imgpart+"i");
System.out.println("root2="+realpart+"-"+imgpart+"i");
}
sc.close();
}
}










