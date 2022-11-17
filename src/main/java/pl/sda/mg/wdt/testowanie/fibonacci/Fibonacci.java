package pl.sda.mg.wdt.testowanie.fibonacci;

public class Fibonacci {
    public static int getValue(int elementNumber) {
        if (elementNumber == 0 || elementNumber == 1) {
            return elementNumber;
        }

        return getValue(elementNumber - 2) + getValue(elementNumber - 1);
    }
}
