public class array05_fast_slow {
    public static void main(String[] args) {
        //给一个递增有序数组，去除重复元素
        //11112222233333
        /*算法：快慢指针中
        快慢指的数据相等，则舍弃快指针所指的数据
                    不相等，则将快指针所指的数据存入慢指针*/

        int fast=1;//快指的[1]
        int slow=0;//慢指的[0]

        int num[]={1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,3,3,3};

        while(fast< num.length){
//   优化前 if(num[slow]==num[fast]){
//                fast++;
//            }else {
//                slow++;
//                num[slow]=num[fast];
//                fast++;
//            }
            if(num[slow]!=num[fast]){
                slow++;
                num[slow]=num[fast];
            }
            fast++;
        }

        for (int i = 0; i <=slow; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
