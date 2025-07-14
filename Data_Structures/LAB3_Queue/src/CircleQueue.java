// นาย สรวิชญ์ ทัศดร 673380065-6 Sec.02
public class CircleQueue {
    private int front = -1;
    private int back = -1;
    private int[] queue;

    public CircleQueue(int arr){this.queue = new int[arr];}
    public CircleQueue(){queue = new int[5];}

    public void enqueue(int data){
        int newBack;
        if (back == queue.length - 1){
            newBack = 0;
        }else{
            newBack = back + 1;
        }

        if (newBack != front){
            back = newBack;
            queue[back] = data;
            if (front == -1){front = 0;}
            System.out.println("\n...Success...");
        }else {
            System.out.println("\n...Fail...");
        }
//        System.out.println("en > " + front + " : " + back);
    }

    public int dequeue(){
        int item = -1;

        if (back == -1){
            return item;
        }else{
            item = queue[front];
            if (front != back){
                if (front == queue.length -1){
                    front = 0;
                }else{
                    front += 1;
                }
            }else{
                front = -1;
                back = -1;
            }
        }

//        System.out.println("de > " + front + " : " + back);
        return item;

    }

    public void printQueue(){
        if (front != -1){
            int f = front;
            int b = back;
            int item;
            
            System.out.print("\nData in Queue : ");
            while (f != b){
                item = queue[f];
                if (f == queue.length -1){
                    f = 0;
                }else{
                    f += 1;
                }
                System.out.print(item + " ");
            }
            if (f == b){
                System.out.print(queue[b]);
            }
            System.out.println();
        }else {
            System.out.println("\nNo data");
        }
    }
}
