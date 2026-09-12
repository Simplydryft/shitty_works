import java.util.Scanner;

public class for_cycle2 {
    public static void main(String[] args) {
        /*数列求和
        S(n)=1-2+3-4+5-6.......*/

        Scanner sc=new Scanner(System.in);
        System.out.println("输入N的值");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if (i%2==0) {
                sum = sum - i;
            }else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
