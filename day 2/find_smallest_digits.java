public class find_smallest_digits {
    public static void main(String[] args){
        int n = 1333737;
        int smallest = 9;
        while (n > 0) {
            int digit = n % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            n /= 10;
        }
        System.out.println("Smallest digit: " + smallest);
    }
}
