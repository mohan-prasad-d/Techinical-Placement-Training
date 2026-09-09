// Check Neon Number
public class neon {
    public static void main(String[] args){
        int n = 7;
        int square = n * n;
        int sumOfDigits = 0;
        
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        if (sumOfDigits == n) {
            System.out.println(n + " is a Neon number.");
        } else {
            System.out.println(n + " is not a Neon number.");
        }
    }
}
