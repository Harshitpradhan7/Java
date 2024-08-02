package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ourArrayList {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();

        ArrayList<String> myArrayList1 = new ArrayList<>(Arrays.asList("apple", "mango","banana"));

        System.out.println(myArrayList1);
        System.out.println(myArrayList);    
    }
}
