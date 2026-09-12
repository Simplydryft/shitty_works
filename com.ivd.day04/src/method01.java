public class method01 {
    public static void main(String[] args) {
       int sum=getSum(454,564);
        System.out.println(sum);

        System.out.println(getSum(4,9));
        System.out.println(getSum(4.2,9.2));

    }

    public static int getSum(int a,int b){
        int sum=a+b;
        return  sum;
    }
    public static double getSum(double a,double b){
        return a + b;//方法的重构
    }

}
