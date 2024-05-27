import java.util.*;
class CountDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter a number");
        num=sc.nextInt();
        while(num>0){
            int d=num%10;
            num=num/10;
            count=count+1;
        }
        System.out.println("Number of digits are : "+count);
    }
}