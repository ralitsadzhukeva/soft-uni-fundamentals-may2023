package TextProcessingExercises_14;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 =scanner.nextLine();
        String num2 = scanner.nextLine();

        BigInteger firstNum = new BigInteger(num1);
        byte secondNum = Byte.parseByte(num2);

        System.out.println(firstNum.multiply(new BigInteger(secondNum+"")));
    }
}
