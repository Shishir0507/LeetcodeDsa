class Solution {
    static final long MOD = 1_000_000_007;
    public int numberOfSets(int n, int k) {
        long ans = 1;
        int r = 2 * k;
        for (int i = 1; i <= r; i++) {
            ans = ans * (n + k - i) % MOD;
            ans = ans * modInverse(i) % MOD;
        }
        return (int) ans;
    }
    public long modInverse(long x) {
        return power(x, MOD - 2);
    }
    public long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a % MOD;
            }

            a = a * a % MOD;
            b >>= 1;
        }

        return result;
    }
}