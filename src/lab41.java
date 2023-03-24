public class lab41 {
    public static void main(String[] args) {
        //for
        System.out.println("For");
        for (int i = 500; i <= 650; i = i + 10) {
            System.out.println(i);
        }
        //while
        System.out.println("While");
        int i = 500;
        while (i <= 650) {
            System.out.println(i);
            i = i + 10;
        }
        //dowhile
        System.out.println("DoWhile");
        int s=500;
        do {
            System.out.println(s);
            s=s+10;
        } while(s<=650);
    }
}