public class bitManipulation {
    public static void main(String[] args) {

        // Get Bit
        int n = 6;
        int index = 0;
        int bitMask = 1<<index;
        System.out.println(bitMask);
        if ((bitMask & n) == 0){
            System.out.println("It is a ZERO");
        }else {
            System.out.println("It is ONe");
        }
    }
}
