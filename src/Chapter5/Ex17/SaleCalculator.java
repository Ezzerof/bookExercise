/* (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product. It
should calculate and display the total retail value of all products sold. Use a sentinel-controlled
loop to determine when the program should stop looping and display the final results.*/

package Chapter5.Ex17;
import java.util.Scanner;


public class SaleCalculator {

    public static void main(String[] args) {

        int qSold1 = 0, qSold2 = 0, qSold3 = 0, qSold4 = 0, qSold5 = 0;
        double sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
        int productNum = 0;

        while (productNum != -1) {


            Scanner input = new Scanner(System.in);
            System.out.println("Please input the product number: (1,2,3,4,5) ");
            productNum = input.nextInt();

            if (productNum == -1){
                break;
            }
            System.out.println("Please enter the quantity sold: ");
            int quantitySold = input.nextInt();

            if (productNum == 1){
                qSold1 = quantitySold;
            } else if (productNum == 2){
                qSold2 = quantitySold;
            } else if (productNum == 3){
                qSold3 = quantitySold;
            } else if (productNum == 4){
                qSold4 = quantitySold;
            } else if (productNum == 5){
                qSold5 = quantitySold;
            } else {
                System.out.println("Wrong number.");
            }

            switch (productNum){
                case 1:
                    double price1 = 2.98;
                    sum1 = qSold1 * price1;
                    break;
                case 2:
                    double price2 = 4.50;
                    sum2 = qSold2 * price2;
                    break;
                case 3:
                    double price3 = 9.98;
                    sum3 = qSold3 * price3;
                    break;
                case 4:
                    double price4 = 4.49;
                    sum4 = qSold4 * price4;
                    break;
                case 5:
                    double price5 = 6.87;
                    sum5 = qSold5 * price5;
                    break;
            }


        }
        System.out.printf("Product number 1. Quantity sold: %d. Profit is: $%f.\n",qSold1,sum1);
        System.out.printf("Product number 2. Quantity sold: %d. Profit is: $%f.\n",qSold2,sum2);
        System.out.printf("Product number 3. Quantity sold: %d. Profit is: $%f.\n",qSold3,sum3);
        System.out.printf("Product number 4. Quantity sold: %d. Profit is: $%f.\n",qSold4,sum4);
        System.out.printf("Product number 5. Quantity sold: %d. Profit is: $%f.\n",qSold5,sum5);

    }

}
