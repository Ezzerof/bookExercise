package Chapter7.Ex14;

public class VariableLenght {
    public static void main(String[] args) {

        System.out.println(VariableLenCalc(20,30,40));
        System.out.println(VariableLenCalc(12,42,2,12));
        System.out.println(VariableLenCalc(22,52,50,22,32));

    }

    public static int VariableLenCalc(int... numbers){
        if (numbers.length == 0)
            return 0;

        int sum = 1;
        for (int number : numbers)
            sum  *= number;

        return sum;

    }
}
