package stringwork;

import stringwork.stringpack.StringBuilderShape;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();

        StringBuilderShape shape = new StringBuilderShape(length, width);

        System.out.print(shape.generateShape());
    }
}
