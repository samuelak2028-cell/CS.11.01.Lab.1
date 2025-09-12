import java.util.Scanner;
public class Pages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String age;
        System.out.println("Enter your age:");
        age = sc.nextLine();
        int pages = 100-Integer.parseInt(age);
        System.out.print(age + "-year olds should read at least " + pages + " pages before giving up on a book.");
    }
}
