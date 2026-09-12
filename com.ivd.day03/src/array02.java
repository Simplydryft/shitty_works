import java.util.Scanner;

public class array02 {
    public static void main(String[] args) {
        //动态初始化
        int arr[]=new int[9];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入一个整数");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();

            arr[i]=num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
