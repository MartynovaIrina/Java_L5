//https://acm.timus.ru/problem.aspx?space=1&num=1496

import java.util.HashMap;
import java.util.Scanner;

public class Homework_Task2 {
    public static HashMap<String, Integer> accountsAndRepeats = new HashMap<>();

    public static void main(String[] args) {
        readInput();
        printSpammers();
    }
    public static void readInput(){
        Scanner sc = new Scanner(System.in);
        String account;
        int numberOfSubmits;
        numberOfSubmits = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfSubmits; i++){
            account = sc.next();
            if (!accountsAndRepeats.containsKey(account)){
                accountsAndRepeats.put(account, 1);
            }
            else {
                accountsAndRepeats.put(account, accountsAndRepeats.get(account) + 1);
            }
        }
    }
    public static void printSpammers(){
        int maxAmountOfSubmits = 1;
        for (String accountSpam : accountsAndRepeats.keySet()) {
            if (accountsAndRepeats.get(accountSpam) > maxAmountOfSubmits) {
                System.out.println(accountSpam);
            }
        }
    }
}
