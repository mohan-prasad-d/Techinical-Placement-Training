public class factorial_n{
    public static void main(String[] args){
        int n = 10;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }   
        System.out.println("Factorial of " + n + ": " + factorial);
    }
}
