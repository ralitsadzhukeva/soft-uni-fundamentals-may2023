package ArraysMore_05;

import java.util.Scanner;

public class LongestIncreasingSubsequence_04 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] array = scanner.nextLine().split(" ");
            int[] number = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                number[i] = Integer.parseInt(array[i]);
            }
            int maxLength = 0;
            int lastIndex = -1;
            int[] length = new int[number.length];
            int[] previous = new int[number.length];
            for (int i = 0; i < number.length; i++) {
                length[i] = 1;
                previous[i] = -1;
                for (int j = 0; j < i; j++) {
                    if (number[j] < number[i] && length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1;
                        previous[i] = j;
                    }
                }
                if (length[i] > maxLength) {
                    maxLength = length[i];
                    lastIndex = i;
                }
            }
            int[] lis = new int[maxLength];
            int currentIndex = maxLength - 1;
            while (lastIndex != -1) {
                lis[currentIndex] = number[lastIndex];
                currentIndex--;
                lastIndex = previous[lastIndex];
            }
            for (int i = 0; i < lis.length; i++) {
                System.out.print(lis[i]);
                if (i < lis.length - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
