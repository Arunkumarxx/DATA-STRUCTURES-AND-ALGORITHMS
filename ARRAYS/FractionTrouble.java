package ARRAYS;

public class FractionTrouble {
    private static int gcd(int a, int b)
    {
        // base case: if b is 0, return a
        if (b == 0)
            return a;

        // recursively call gcd function with remainder of a divided by b
        return gcd(b, a % b);
    }

    // method to find the largest fraction less than or equal to a given fraction n/d
    static int[] LargestFraction(int n, int d) {
        // initialize variables to store numerator and denominator of the largest fraction found
        int r = 0, s = 1;

        // set the limit for the denominator
        int limit = 10000;

        // loop through possible denominators from the limit to 2
        for (int q = limit; q >= 2; q--) {
            // calculate the numerator using the given fraction n/d and current denominator q
            int p = (n * q - 1) / d;

            // check if the current fraction is larger than the previous largest fraction
            if (p * s >= r * q) {
                // update the numerator and denominator of the largest fraction
                s = q;
                r = p;
            }
        }

        // calculate the greatest common divisor of the numerator and denominator
        int D = gcd(r, s);

        // create an array to store the resulting fraction
        int[] res = new int[2];

        // divide the numerator and denominator by their greatest common divisor
        // and store the result in the array
        res[0] = (r / D);
        res[1] = (s / D);

        // return the resulting fraction
        return res;
    }
    public static void main(String[] args) {
        int n=5;
        int d=2;
        for (int x:LargestFraction(n,d))
            System.out.print(x+" ");
    }
}
