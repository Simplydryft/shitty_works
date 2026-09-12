public class array01 {
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3};
        int arr[]={4,5,6};

        System.out.println(arr);
        System.out.println(array);
        System.out.println(arr[2]);
        System.out.println(array[1]);

        System.out.println(arr.length);

        for (int i=0;i<arr.length;i++){
            System.out.println(array[i]);
        }
       /* arr.fori快捷生成
       for (int i = 0; i < arr.length; i++) {

        }*/
    }
}
