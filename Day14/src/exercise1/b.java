package exercise1;

public class b {

    public int mcCarthy91(int n) {

        if (n > 100) {
            return n - 10;   // 50, 73, 95.
        } else {
            return mcCarthy91(mcCarthy91(n + 11));
        }
    }
}