package com.y.lab.fuzzy.search;

public class FuzzySearchUtil {

    public static boolean fuzzySearch(String searchLine, String originalLine) {
        var searchChars = searchLine.split("");
        return recursiveSearch(originalLine, searchChars, 0);
    }

    private static boolean recursiveSearch(String originalLine, String[] searchChars, int currentIndex) {
        var index = originalLine.indexOf(searchChars[currentIndex]);
        if (index != -1) {
            originalLine = originalLine.substring(index+1);
            if(currentIndex < searchChars.length - 1) {
                if(originalLine.length() > 0) {
                    currentIndex++;
                    return recursiveSearch(originalLine, searchChars, currentIndex);
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
