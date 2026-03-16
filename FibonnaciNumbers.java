public class FibonnaciNumbers{

    public static int[] arrayextender(int[] array){
        int[] newarray = new int[array.length +1];
        for(int i=0; i < array.length; i++){
            newarray[i] = array[i];
        }
        return newarray;
    }
    public static int[] FibonnaciCalculator(int range, int maxnum, int minnum, int[] fibonnaciarray){
        if (maxnum+minnum < range){
            fibonnaciarray = arrayextender(fibonnaciarray);
            int tempnum = maxnum;
            maxnum = maxnum + minnum;
            minnum = tempnum;
            fibonnaciarray[fibonnaciarray.length-1] = maxnum;
            return FibonnaciCalculator(range,maxnum,minnum,fibonnaciarray);
        } else{
            return(fibonnaciarray);
        }
    }
    public static void main(String[] args) {
        int range = 600;
        int maxnum = 1;
        int minnum = 1;
        int[] fibonacciarray = {1,1};
        int[] result = FibonnaciCalculator(range, maxnum, minnum, fibonacciarray);
        for(int i=0; i < result.length; i++){
            if(i == result.length-1){
                System.out.print(result[i]);
            } else{
                System.out.print(result[i]+",");
        }
    }
}
}