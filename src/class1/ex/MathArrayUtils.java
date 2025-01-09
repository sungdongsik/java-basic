package class1.ex;

public class MathArrayUtils {

    public static int sum(int[] values){
        int total = 0;
        for(int a : values){
            total += a;
        }

        return total;
    }

    public static float average(int[] values){
        return sum(values) / values.length;
    }

    public static int min(int[] values){
        int minValue = values[0];

        for(int a : values){
            if(a < minValue){
                minValue = a;
            }
        }

        return minValue;
    }

    public static int max(int[] values){
        int maxValue = values[0];

        for(int a : values){
            if(a > maxValue){
                maxValue = a;
            }
        }

        return maxValue;
    }
}
