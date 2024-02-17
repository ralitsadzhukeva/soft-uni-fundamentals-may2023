package ObjectsClasses_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    public static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song current = new Song(type, name, time);

            songs.add(current);
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song song:songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song:songs) {
            String currentType = song.getTypeList();
            if (currentType.equals(command)){
                System.out.println(song.getName());
            }
            }
        }
    }
}