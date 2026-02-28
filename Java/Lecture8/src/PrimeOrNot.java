import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int counter = 0;
        for(int i = 1;i < number;i++){
            if(number % i == 0){
                counter = counter + 1;
            }
        }
        if(counter >= 2){
            System.out.println("Number is not Prime");
        }
        else {
            System.out.println("Number is prime");
        }
    }
}
