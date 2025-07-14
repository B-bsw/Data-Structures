// นาย สรวิชญ์ ทัศดร 673380065-6 Sec.02
import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private int count = -1;
    private List<Character> list; // why use List? , easy to use

    public MyStack(){
        list = new ArrayList<>();
    }

    public void push(char data){
        list.add(data);
        count++;
    }

    public char pop(){
        char tmp = list.getLast();
        list.removeLast();
        count--;
        return tmp;
    }

    public int getTop(){
        return count;
    }

}
