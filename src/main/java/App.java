import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    String s1 = "";
    String s2 = "";

    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập n: ");
    int n = sc.nextInt();

    int s2a = sum2a(n);
    System.out.format("Sum (2a) = %d\n", s2a);

    if (NumberUtils.isPrimeNumber(n)) {
      System.out.format("%d là số nguyên tố.\n", n);
    } else {
      System.out.format("%d KHÔNG PHẢI số nguyên tố.\n", n);
    }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Nhập n: ");
    // int n = sc.nextInt();
    // for (int i = 0; i < n; i+=2) {
    //   if (i == 5) {
    //     continue;
    //   }
    //   System.out.print(i + " ");
    // }

    // Scanner sc = new Scanner(System.in);
    //
    // int n;
    // do {
    //   System.out.print("Nhập n (0 < n <= 9): ");
    //   n = sc.nextInt();
    // } while (n < 0 || n > 9);
    //
    // System.out.format("n = %d\n", n);
    // // System.out.println("n = " + n);


    // int i = 0;
    // do {
    //   System.out.println("Do...While in Java.");
    //   i++;
    // } while (i < 0);

    // int i = 0;
    // while (true) {
    //   System.out.println("Loop in Java.");
    //   i++;
    //   if (i == 3)
    //     break;
    // }

    // for (int i = 0; true; i++) {
    //   System.out.println("Loop in Java.");
    //   if (i == 3)
    //     break;
    // }

    // int i = 0;
    // while (i < 5) {
    //   System.out.println("Loop in Java.");
    //   i++;
    // }

    // for (int i = 0; i < 5; i++) {
    //   System.out.println("Loop in Java.");
    // }

    // printNumber();

    // int a = 10;
    // a = a + 10;
    // a += 10;
    // a++;

    // int a = 6;
    // int b = 9;
    // swap(a,  b);
    // a = 9;
    // b = 6;
  }

  public static int sum2a(int n) {
    int s = 0;
    for (int i = 1; i <= n; i++) {
      s += i;
    }

    return s;
  }

  public static int sum(int a, int b) {
    int s;
    s = a + b;
    return s;
  }

  public static void printNumber() {
    Scanner sc = new Scanner(System.in);

    System.out.print("n = ");
    int n = sc.nextInt();

    switch (n) {
      case 1:
        System.out.println("Một");
        break;
      case 2:
        System.out.println("Hai");
        break;
      default:
        System.out.println("Không xử lý được.");
        break;
    }
  }

  public static void swap(int a, int b) {
    int tmp = a;
    a = b;
    b = tmp;
  }
}
