package basicjavaprograms118;
import java.util.Scanner;
abstract class mark {
    abstract float percentage();
}
class A extends mark
{
  int total,mark1,mark2,mark3;
  float percentage;
  A(int m1,int m2,int m3)
  {
     mark1=m1;
     mark2=m2;
     mark3=m3;
  }                                                                                
  float percentage() 
  {
   total=mark1+mark2+mark3;
   percentage=total/3;
   return percentage;    
  }        
}
class B extends mark
{
  int total,mark1,mark2,mark3,mark4;
  float percentage;
  B(int a,int b,int c,int d)
  {
     mark1=a;
     mark2=b;
     mark3=c;
     mark4=d;
  }                                                                                
  float percentage() 
  {
   total=mark1+mark2+mark3+mark4;
   percentage=total/4;
   return percentage;    
  }      
}
}
  public class student
  {
      public static void main(String[] args)
      {
          int samm1,samm2,samm3,jamm1,jamm2,jamm3,jamm4;
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the marks of sam:");
          samm1=s.nextInt();
          samm2=s.nextInt();
          samm3=s.nextInt();
          A obj=new A(samm1,samm2,samm3);
          System.out.println("Enter the marks of jam:");
          jamm1=s.nextInt();
          jamm2=s.nextInt();
          jamm3=s.nextInt();
          jamm4=s.nextInt();
          B obj1=new B(jamm1,jamm2,jamm3,jamm4);
          System.out.println("The average mark of sam is:"+obj.percentage());
          System.out.println("The average mark of Jam is:"+obj1.percentage());
      }
  }

                                                                               
                                                                             
                                                                             
                                                                             
                                   