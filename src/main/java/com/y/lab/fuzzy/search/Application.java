package com.y.lab.fuzzy.search;

 /*
        Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите основную строку: ");
        var originalLine = scanner.nextLine();
        System.out.print("Введите строку для поиска: ");
        var searchLine = scanner.nextLine();

        System.out.println(FuzzySearchUtil.fuzzySearch(searchLine, originalLine));
    }
}