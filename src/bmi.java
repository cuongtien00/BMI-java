import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        double weight;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap chieu cao");
        height = scanner.nextDouble();
        System.out.println("Moi nhap can nang");
        weight = scanner.nextDouble();
        double bmi = weight/(height * height);

         if (bmi < 18.5) {
            System.out.println("Underweight");
         }
         else if (bmi < 25) {
                System.out.println("Normal");
            }
         else if (bmi <30 ){
                System.out.println("Overweight");
         }
         else{
            System.out.println("Obese");

        }
    }
}
