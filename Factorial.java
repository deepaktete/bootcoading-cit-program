import java.util.Scanner;
public class Factorial{

  public static void main(String args [] ){



Scanner s1=new Scanner(System.in);

System.out.println("Enter a number");


int num=s1.nextInt();
int temp=num;
int fact=1;

for(; num>=1; num--){
fact=fact*num; 
}

System.out.println("factorial of "+temp+"is="+fact);
}
}
