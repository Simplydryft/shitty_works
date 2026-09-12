public class array03 {
    public static void main(String[] args) {
        //最大值最小值
        int arr[]={5,6,69,99,545,789,123};
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

}
