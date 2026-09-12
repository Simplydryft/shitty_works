public class break_continue {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if (i == 3) {
                continue;//结束本次循环，进行下次循环
            }
            if(i==4){
                break;
            }
            System.out.println(i);
        }


    }
}
