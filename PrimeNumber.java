
public class PrimeNumber {
    //menggunakan algoritma sieve of Eratosthenes
    public static void main(String[] args) {
        int n = 1000000;
        int[] primes = new int[n + 1];
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            primes[i] = 1;
        }
        primes[0] = 0;
        primes[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    primes[i * j] = 0;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 1) {
                counter++;
                if (counter == 20210) {
                    System.out.println("Bilangan Prima ke 20210 adalah: " + i);
                }
            }
        }

    }
}
