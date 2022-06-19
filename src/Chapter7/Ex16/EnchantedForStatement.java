package Chapter7.Ex16;

public class EnchantedForStatement {
    public static void main(String[] args) {

        double sum = 0.0;

        for (String arg : args)
            sum +=Double.parseDouble(arg);

        System.out.println(sum);
    }

}
