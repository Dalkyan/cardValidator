package pl.sda;

public class CheckLuhn {
    public boolean checkLuhn(String number) {
        int sum = 0;
        for (int i = 1; i <= number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(number.length() - i));
            if (i % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit = 1 + digit % 10;
                }
            }
            sum += digit;
        }
        return sum % 10 == 0;
    }
}
