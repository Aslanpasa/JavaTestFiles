public class Sum{
    public static int countZerotoNumber(int topnumber) {
        if (topnumber==0) {
            return 0;
        } else{
            return topnumber +countZerotoNumber(topnumber-1);
        }
    }
    public static void main(String[] args) {
        int result = countZerotoNumber(538);
        System.out.println(result);
    }
}