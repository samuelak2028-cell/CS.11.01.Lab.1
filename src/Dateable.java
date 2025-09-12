import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String age;
        System.out.println("Enter your age: ");
        age = sc.nextLine();
        int dateAge = 7+(Integer.parseInt(age))/2;
        System.out.println(age + "-year olds should date somebody who is at least " + dateAge + " years old.");
    }
}
d