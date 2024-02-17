package ObjectClassesExercises_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles_02 {
    public static class Articles{
        String title;
        String content;
        String author;
        public Articles(String title, String content, String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }
        public String getTitle() {
            return title;
        }
        public String getContent() {
            return content;
        }
        public String getAuthor() {
            return author;
        }
        public void rename(String title) {
            this.title = title;
        }
        public void edit(String content) {
            this.content = content;
        }
        public void changeAuthor(String author) {
            this.author = author;
        }
        @Override
        public String toString(){
            return this.title + " - " + this.content + ": " + this.author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] article = scanner.nextLine().split(", ");
        String title = article[0];
        String content = article[1];
        String author = article[2];

        Articles articles = new Articles(title,content,author);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            String[] command=scanner.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                articles.edit(command[1]);
                        break;
                case "ChangeAuthor":
                articles.changeAuthor(command[1]);
                    break;
                case "Rename":
                    articles.rename(command[1]);
                    break;
            }
        }
        System.out.println(articles.toString());
    }
}
