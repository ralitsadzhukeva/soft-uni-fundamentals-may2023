package beginning.extra;
import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =   Integer.parseInt(scanner.nextLine());
        String English="";
        int last = 0;
        if (num<10){
            last=num;
        } else {
            last= num % 10;
        }
        if (last==1){
            English = "one";
        } else if (last==2) {
            English="two";
        } else if (last==3) {
            English="three";
        } else if (last==4) {
            English="four";
        } else if (last==5) {
            English="five";
        } else if (last==6) {
            English="six";
        } else if (last==7) {
            English="seven";
        } else if (last==8) {
            English="eight";
        } else if (last==9) {
            English="nine";
        } else {
            English="zero";
        }
        System.out.println(English);
    }
}

