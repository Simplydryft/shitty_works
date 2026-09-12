import java.util.Random;

public class array04_difficult {
    public static void main(String[] args) {
        /*取10个在1-100之间的随机数，存入数组，并保证每个数据唯一*/
        Random sc=new Random();
         int arr[]=new int[10];

        for (int i = 0; i < arr.length; ) {
            int num=sc.nextInt(100)+1;
            int count=0;

            for (int j = 0; j < arr.length; j++) {
                if(num==arr[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr[i]=num;
                i++;//只有满足要求，才会自增
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");




        /*取10个在0-100之间的随机数，存入数组，并保证每个数据唯一*/
        Random sc1=new Random();
        int arr1[]=new int[10];

        for (int i = 0; i < arr.length; ) {
            int num=sc1.nextInt(100)+1;
            int count=0;

            for (int j = 0; j < i; j++) {
                if(num==arr1[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr1[i]=num;
                i++;//只有满足要求，才会自增
            }
        }

        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i]+" ");
        }
    }
}
