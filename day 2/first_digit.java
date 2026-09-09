// find first digit of a number
public class first_digit {
    public static void main(String[] args){
        int n = 12345;
        while (n >= 10) {
            n /= 10;
        }
        System.out.println("First digit: " + n);
    }
}
