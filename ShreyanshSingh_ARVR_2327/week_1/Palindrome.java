import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
     {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int n=num;
    int rev=0,d;
    while(num>0){
        d=num%10;
        rev=rev*10+d;
        num=num/10;
    }
    if(rev==n)
    System.out.println("Palindrome");
    else
    System.out.println("Not Palindrome");
}
}
