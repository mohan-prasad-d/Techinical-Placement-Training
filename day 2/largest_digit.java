public class largest_digit {
    public static void main (String[] args){
        int n = 23898223;
        int largest = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n /= 10;
        }
        System.out.println("Largest digit: " + largest);
    }
}
