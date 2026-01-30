public class forloops{
    public static void main(String[] args){
        int[] numbers = {2,6,2,3,2,4,5,1,6,6,2,3,1,1,3,5,2,6,1,4,4,5,3,6,5,2,4,3,2,5};
        for (int i = 1; i <= 6; i++) {
            System.out.println("\nMoving onto: " + i);
             int z= 0;
            for (int number : numbers){
                if (number == i){
                    if (z == 0) {
                        System.out.print(number);
                        z++;
                        continue;
                    }
                    System.out.print(","+number);
                }
            }
        }
    }
}