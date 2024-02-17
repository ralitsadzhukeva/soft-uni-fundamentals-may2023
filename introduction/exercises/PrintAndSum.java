package introduction.exercises;

import java.util.Scanner;
public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int last = Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int i=first; i<=last; i++){
            sum+=i;
            System.out.printf("%d ",i);
        }
        System.out.printf("%nSum: %d",sum);
    }
}
