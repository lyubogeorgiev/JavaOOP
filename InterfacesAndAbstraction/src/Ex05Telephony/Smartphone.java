package Ex05Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    private void validateNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {

                throw new IllegalArgumentException("Invalid number!");
            }
        }
    }

    private void validateUrl(String url) {
        for (int i = 0; i < url.length(); i++) {
            if (Character.isDigit(url.charAt(i))) {
                throw new IllegalArgumentException("Invalid URL!");
            }
        }
    }

    @Override
    public String browse() {

        StringBuilder browsingData = new StringBuilder();

        for (String url : this.urls) {
            try {
                this.validateUrl(url);

                browsingData.append("Browsing... ").append(url).append(System.lineSeparator());
            } catch (IllegalArgumentException e) {
                browsingData.append(e.getMessage()).append(System.lineSeparator());
            }
        }

        return browsingData.toString();
    }

    @Override
    public String call() {
        StringBuilder callingData = new StringBuilder();

        for (String number : this.numbers) {
            try {
                this.validateNumber(number);

                callingData.append("Calling... ").append(number).append(System.lineSeparator());
            } catch(IllegalArgumentException e) {
                callingData.append(e.getMessage()).append(System.lineSeparator());
            }
        }

        return callingData.toString();
    }
}
