package OOP.L04InterfacesAndAbstraction.Exercise.T05Telephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String url : urls) {
            if (checkIfUrlHasOnlyLetters(url)) {
                stringBuilder.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            } else stringBuilder.append("Invalid URL!");
        }
        for (String number : numbers) {
            if (checkIfNumberHasOnlyDigits(number)) {
                stringBuilder.append("Calling... ").append(number).append(System.lineSeparator());
            } else stringBuilder.append("Invalid number!");
        }
        return stringBuilder.toString();
    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String number : numbers) {
            if (checkIfNumberHasOnlyDigits(number)) {
                stringBuilder.append("Calling... ").append(number).append(System.lineSeparator());
            } else stringBuilder.append("Invalid number!");
        }
        return stringBuilder.toString();
    }

    private boolean checkIfNumberHasOnlyDigits(String stringNumber) {
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (stringNumber == null) {
            return false;
        }

        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(stringNumber);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }

    private boolean checkIfUrlHasOnlyLetters(String url) {

        String regex = "[^0-9]+";
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (url == null) {
            return false;
        }

        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(url);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }
}
