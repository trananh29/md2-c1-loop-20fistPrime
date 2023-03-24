import java.util.Scanner;

public class printIsPrime {
    public static void main(String[] args) {

        System.out.println("Hai muoi so nguyen to dau tien la");
        int i=2,snt=0;
        while (snt<=20) {
            if (check(i)) {
                System.out.println(i);
                snt++;
            } i++;
        }
    }
    public static boolean check(int n) {
        for (int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0){
                return false;
            }
        } return true;
    }
}

