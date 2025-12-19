package Loops;

public class digitFrequency {
    public static void main(String[] args) {
        int number = 1223334444;
        int digitToCount = 4;
        int frequency = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == digitToCount) {
                frequency++;
            }
            number /= 10;
        }

        System.out.println("The digit " + digitToCount + " appears " + frequency + " times.");
    }
}
