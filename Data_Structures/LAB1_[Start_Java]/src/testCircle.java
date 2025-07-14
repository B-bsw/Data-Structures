import java.util.Scanner;

public class testCircle {
    private static Circle myC;
    private static Scanner  scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            System.out.println("Main Menu\n" +
                    "1. Create New Circle\n" +
                    "2. Find Area\n" +
                    "3. Find circumference\n" +
                    "4. Find volume\n" +
                    "5. My Radius\n" +
                    "6. Exit");
            System.out.print("Please choose menu (1 - 6) : ");
            int select = scan.nextInt();
            System.out.println();
            switch (select){
                case 1:
                    System.out.print("Radius : ");
                    myC = new Circle(scan.nextDouble());
                    System.out.println();
                    break;
                case 2:
                    if(myC == null) {
                        System.out.println("Please Create Circle.\n");
                        break;
                    }
//                    System.out.println("Area is : " + myC.area());
                    System.out.printf("Area is %.2f\n\n",myC.area());
                    break;
                case 3:
                    if(myC == null) {
                        System.out.println("Please Create Circle.\n");
                        break;
                    }
//                    System.out.println("Circumference is : " + myC.circumference());
                    System.out.printf("Circumference is %.2f\n\n",myC.circumference());
                    break;
                case 4:
                    if(myC == null) {
                        System.out.println("Please Create Circle.\n");
                        break;
                    }
//                    System.out.println("Volume is : " + myC.volume());
                    System.out.printf("Volume is %.2f\n\n",myC.volume());
                    break;
                case 5:
                    if(myC == null) {
                        System.out.println("Please Create Circle.\n");
                        break;
                    }
                    System.out.println("Your Radius is : " + myC.getR());
                    System.out.println();
                    break;
                case 6:
                    System.out.println("- - Stop Program - -");
                    break;
                default:
                System.out.println("Please choose something. ( 1 - 6 )\n");
            }
            if (select == 6){
                break;
            }
        }

    }
}
