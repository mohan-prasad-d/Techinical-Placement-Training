//Check Automorphic Number
public class Automorphic {
    public static void main(String[] args) {
        int n = 25;
        int square = n * n;
        String squareStr = String.valueOf(square);
        String nStr = String.valueOf(n);
        
        if (squareStr.endsWith(nStr)) {
            System.out.println(n + " is an Automorphic number.");
        } else {
            System.out.println(n + " is not an Automorphic number.");
        }
    }
}