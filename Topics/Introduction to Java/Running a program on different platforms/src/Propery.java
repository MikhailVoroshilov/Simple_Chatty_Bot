import java.util.Scanner;

class Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 1;

        for (int i = a ; i < b; i++) {
            res = res * i;

        }
        System.out.println(res);
    }
}