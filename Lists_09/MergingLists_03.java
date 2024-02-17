package Lists_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List <Integer> listOne=
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List <Integer> listTwo=
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List <Integer> result = new ArrayList<>();

        int min= Math.min(listOne.size(), listTwo.size());
        for (int i = 0; i < min; i++) {
            int numListOne= listOne.get(i);
            int numListTwo=listTwo.get(i);

            result.add(numListOne);
            result.add(numListTwo);
        }
        if (listOne.size()> listTwo.size()){
            List <Integer> sublist=listOne.subList(min, listOne.size());

            result.addAll(sublist);
        } else if (listTwo.size()> listOne.size()) {
            List <Integer> sublist=listTwo.subList(min, listTwo.size());

            result.addAll(sublist);
        }
        System.out.println(result.toString().replaceAll("[\\[\\],]",""));
    }
}
