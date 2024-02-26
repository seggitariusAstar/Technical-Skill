import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int arr[]={3,5,6,9,20};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int []arr){

        for (int i = 0; i < arr.length/2; i++) {
            swap(arr,i, arr.length-1-i);

        }

    }
    public static void swap(int []arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
