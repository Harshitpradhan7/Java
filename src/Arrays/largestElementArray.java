package Arrays;

public class largestElementArray {
    public static void main(String[] args) {
        int elm = 0;
        int[] arr = {3,1,4,6,8,1,5,9,0};
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>elm){
                elm = arr[i];
                j = i;
            }
        }
        System.out.println("Largest Element is "+ elm + " at index "+ j);

    }
}


