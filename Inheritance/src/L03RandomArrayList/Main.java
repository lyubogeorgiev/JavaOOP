package L03RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<String> randomArrayList = new RandomArrayList<>();

        randomArrayList.add("One");
        randomArrayList.add("Two");
        randomArrayList.add("Three");
        randomArrayList.add("Four");
        randomArrayList.add("Five");
        randomArrayList.add("Six");
        randomArrayList.add("Seven");

        System.out.println(randomArrayList.size());

        System.out.println(randomArrayList.getRandomElement());
    }
}
