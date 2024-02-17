package ListsExercises_10;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> text = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());
        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("3:1")){
            String command = input[0];
            switch (command){
                case "merge":
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);

                    if (startIndex<0){
                        startIndex=0;
                    }
                    if (endIndex> text.size()-1){
                        endIndex = text.size()-1;
                    }
                    if (startIndex>=0 && startIndex<= text.size()-1 &&endIndex>=0 &&endIndex<=text.size()-1){
                        String result = "";
                        for (int i = startIndex; i <=endIndex ; i++) {
                            String current =text.get(i);
                            result+=current;
                        }
                        for (int i = startIndex; i <=endIndex ; i++) {
                            text.remove(startIndex);
                        }
                        text.add(startIndex,result);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(input[1]);
                    int partitions = Integer.parseInt(input[2]);
                    if (index>=0 && index<= text.size()-1){
                        String toDivide = text.get(index);
                        text.remove(index);

                        int symbolsCount = toDivide.length()/partitions;

                        int begin=0;

                        for (int i = 1; i < partitions; i++) {
                            String textPartition = toDivide.substring(begin,begin+symbolsCount);
                            text.add(index,textPartition);
                            index++;
                            begin+=symbolsCount;
                        }
                        String lastPartitions = toDivide.substring(begin,toDivide.length());
                        text.add(index,lastPartitions);
                    }
            }
            input=scanner.nextLine().split(" ");
        }
        System.out.println(String.join("",text));
    }
}
