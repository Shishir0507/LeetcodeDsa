class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
    
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = modPow(5, even);
        ans = (ans * modPow(4, odd)) % MOD;

        return (int) ans;
    }

    private long modPow(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp /= 2;
        }

        return result;
    }
}