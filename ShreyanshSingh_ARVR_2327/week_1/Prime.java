import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int c=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0){
                c++;
            }
        }
        if(c>0)
        {
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
