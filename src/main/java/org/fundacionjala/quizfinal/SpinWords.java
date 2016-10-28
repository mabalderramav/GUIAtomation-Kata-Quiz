package org.fundacionjala.quizfinal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class SpinWords {

    private SpinWords() {
    }

    static String spinWords(String text) {
        final String regularExpression = "(\\w{5,})";
        Matcher matcher = Pattern.compile(regularExpression).matcher(text);
        String newText = text;
        while (matcher.find()) {
            String word = matcher.group(0);
            newText = newText.replaceAll(word, new StringBuilder(word).reverse().toString());
        }
        return newText;
    }
}
