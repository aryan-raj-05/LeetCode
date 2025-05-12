public class Problem0202_HappyNumber {
    public boolean isHappy(int n) {
        int slow = next(n);
        int fast = next(next(n));

        do {
            slow = next(slow);
            fast = next(next(fast));
            if (fast == 1)      return true;
        } while(slow != fast);

        return false;
    }

    private int next(int x) {
        if (x < 10)     return x * x;

        int num = 0;
        while (x != 0) {
            int temp = x % 10;
            num += temp * temp;
            x /= 10;
        }
        return num;
    }
}
