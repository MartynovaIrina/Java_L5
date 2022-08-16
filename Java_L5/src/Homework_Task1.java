//https://informatics.msk.ru/mod/statements/view.php?chapterid=3453#1

import java.util.HashSet;
import java.util.Scanner;

public class Homework_Task1 {
    public static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        readInputInfo();
    }
    public static void readInputInfo(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Please enter a number of requests.");
        int numberOfRequests = sc.nextInt();
        sc.nextLine();
        String line;
        String elementToManipulate;

        for(int i = 0; i < numberOfRequests; i++){
            System.out.println("Please enter a request.");
            line = sc.next().toLowerCase();
            switch (line) {
                case "add" -> {
                    elementToManipulate = sc.next();
                    add(elementToManipulate);
                }
                case "present" -> {
                    elementToManipulate = sc.next();
                    present(elementToManipulate);
                }
                case "count" -> count();
            }
        }
        sc.close();
    }
    public static void add(String elementToAdd){
        set.add(elementToAdd);
    }
    public static void present(String elementToCheck){
        if (set.contains(elementToCheck)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    public static void count(){
        System.out.println(set.size());
    }
}
