public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 10 are:");

        // Loop through numbers from 1 to 10
        for (int num = 2; num <= 10; num++) {
            boolean isPrime = true;

            // Check if the current number is prime
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}