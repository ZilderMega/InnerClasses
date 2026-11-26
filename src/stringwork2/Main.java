package stringwork2;

import stringwork.stringpack.StringBuilderShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ СТРОКУ: ");

        String text = scanner.nextLine();
        System.out.print(StringUnique.foundUnique(text));
    }
}
