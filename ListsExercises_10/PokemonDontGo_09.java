package ListsExercises_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
    public class PokemonDontGo_09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Integer> numbers = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int sum = 0;

            while (numbers.size() > 0) {
                int index = Integer.parseInt(scanner.nextLine());
                if (index < 0) {
                    int first = numbers.get(0);
                    numbers.remove(0);
                    sum += first;
                    int last = numbers.get(numbers.size() - 1);
                    numbers.add(0, last);
                    listModify(numbers, last);
                } else if (index > numbers.size() - 1) {
                    int last = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    sum += last;

                    int first = numbers.get(0);
                    numbers.add(first);
                    listModify(numbers, last);
                } else if (index >= 0 && index <= numbers.size() - 1) {
                    int removed = numbers.get(index);
                    sum += removed;
                    numbers.remove(index);
                    listModify(numbers, removed);
                }
            }
            System.out.println(sum);
        }

        private static void listModify(List<Integer> numbers, int removed) {
            for (int i = 0; i < numbers.size(); i++) {
                int current = numbers.get(i);
                if (current <= removed) {
                    current += removed;
                } else {
                    current -= removed;
                }
                numbers.set(i, current);
            }
        }
    }
