import java.util.Scanner;
public class Square {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int number;
            int square;
            System.out.print("Please enter a number: ");
            number = sc.nextInt();
            sc.nextLine();
                System.out.println("Number\t\t\tSquare\n....\t\t....");
                for (int i =1; i <= number; i++) {
                    square = i * i;
                    System.out.printf("%d\t\t\t%d\n", i, square);

            }

        }
}
