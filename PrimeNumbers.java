public class PrimeNumbers {

    public static void main(String[] args) {
        int count = 0;  // Number of primes found
        int num = 2;    // Current number to check for primality
        int limit = 10; // Number of prime numbers to find
        
        System.out.println("The first " + limit + " prime numbers are:");
        
        while (count < limit) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Eliminate even numbers greater than 2
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false; // Number is divisible by i
            }
        }
        return true;
    }
}