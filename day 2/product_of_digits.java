public class product_of_digits {
    public static void main(String[] args){
        int n = 23898223;
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        System.out.println("Product of digits: " + product);
    }
}
