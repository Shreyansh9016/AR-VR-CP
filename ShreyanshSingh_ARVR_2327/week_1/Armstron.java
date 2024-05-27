import java.util.Scanner; 

public class Armstron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int n=num;
        int arm=0;
        while(num>0){
            int d=num%10;
            num=num/10;
            arm=arm + (int)Math.pow(d,3);
        }
        if(arm==n){
            System.out.println("Armstrong");
        }
        else
        System.out.println("Not Armstrong");
    }
}
