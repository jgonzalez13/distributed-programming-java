package mx.ucol.threads;

import sun.awt.windows.WPrinterJob;

public class App {
    private final static int MAX = 5_000_000;

    private static class execThread implements Runnable {
        @Override
        public void run() {
            double initTime = System.currentTimeMillis();
            double seconds = (System.currentTimeMillis() - initTime) / 1000;
            int results = countPrimes(0, MAX);

            System.out.println(Thread.currentThread().getName() + " counted " + results + " primes in " + seconds);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        int numberOfThreads = 0;

        if (args.length > 0) {
            try {
                numberOfThreads = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

        if (numberOfThreads == 0) {
            System.out.println("Argument must be more than zero.");
            System.exit(1);
        }

        Thread allThreads[] = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            allThreads[i] = new Thread(new execThread());
            allThreads[i].start();
        }
   }

    private static int countPrimes(int min, int max) {
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}