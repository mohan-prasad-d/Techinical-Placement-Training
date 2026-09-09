public class count_occurance_of_digit {
    public static void main(String[] args){
        int n = 23898223;
        int digit = 2;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == digit) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Occurrence = " + count);
    }
}
