public class for_cycle {
    public static void main(String[] args) {
        /* 斐波那契数列，求第十个数字
        0 1 1 2 3 5 8 13 21*/
        int a=0;
        int b=1;

        int c=0;

        for(int i=3;i<=10;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);

    }
}
