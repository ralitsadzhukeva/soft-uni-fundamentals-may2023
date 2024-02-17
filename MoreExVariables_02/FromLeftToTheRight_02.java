package MoreExVariables_02;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i=1; i<=n;i++){
            String input = scanner.nextLine();
            int index = input.indexOf(" ");

            long left= Long.parseLong(input.substring(0,index));
            long right = Long.parseLong(input.substring(index+1));
            long sum = 0;
            long bigger = 0;
            bigger = Math.max(left,right);
            while (bigger!=0){
                sum+=bigger%10;
                bigger/=10;
            }
            System.out.println(Math.abs(sum));
        }
    }
}
