// นาย สรวิชญ์ ทัศดร 673380065-6 Sec.02
import java.util.Objects;
import java.util.Scanner;

public class testQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please input size Array A : ");
        CircleQueue q = new CircleQueue(scan.nextInt());

        while(true){
            System.out.println("\nMenu\n1. enqueue\n2. dequeue\n3. show data\n4. exit");
            System.out.print("Please choose your choice : ");
            int select = scan.nextInt();

            switch (select){
                case 1:
                    System.out.print("Input data : ");
                    q.enqueue(scan.nextInt());
                    break;
                case 2:
                    int tmp = q.dequeue();
                    if (tmp == -1){
                        System.out.println("\nNo data");
                    }else{
                        System.out.println("\nResult : " + tmp );
                    }
                    break;
                case 3:
                    q.printQueue();
                    break;
                case 4:
                    System.out.println("\nThank you ...");
                    break;
            }
            if (Objects.equals(select,4)) break;
        }
    }
}
