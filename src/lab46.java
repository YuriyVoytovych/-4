public class lab46 {
    public static void main(String[] args) {
        int kilkist = 0;
        int n = 1;
        while (n >= 1 && n <= 999999) {
           int a = n / 100000;
           int b = n % 100000 / 10000;
           int c = n % 10000 / 1000;
           int d = n % 1000 / 100;
           int e = n % 100 / 10;
           int f = n % 10;
            if (a + b + c == d + e + f) {
                kilkist++;
            }
            n++;
        }
        System.out.println(kilkist);
    }
}
