import java.util.Arrays;

public class ROTATINGARRAY {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateright(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int times) {
        int n = arr.length;
        int[] newarr = new int[n];
        int k = 0;
        for (int i = times; i < arr.length; i++) {
            newarr[k] = arr[i];
            k++;
        }
//        System.out.println(Arrays.toString(newarr));
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < times; i++) {
            newarr[k] = arr[i];
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newarr[i];
        }


    }

    public static void rotateright(int[] arr, int times) {
        int n = arr.length;
        int[] newarr = new int[n];
        int k = 0;
        int i = arr.length - times;
        while (times > 0) {
            newarr[k] = arr[i];
            k++;
            times--;
            i++;

        }

       // System.out.println(Arrays.toString(newarr));
       for (int j = 0; j < arr.length - times-2; j++) {
          // System.out.println(k);
           newarr[k]=arr[j];

           k++;

       }
      //  System.out.println(Arrays.toString(newarr));
    }
}
