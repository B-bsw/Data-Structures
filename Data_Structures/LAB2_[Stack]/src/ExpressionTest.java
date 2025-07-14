// นาย สรวิชญ์ ทัศดร 673380065-6 Sec.02
import java.util.Objects;
import java.util.Scanner;

public class ExpressionTest {
    public static void main(String[] args) {
        String txt;

        Scanner sagan = new Scanner(System.in);
        String pass;

        System.out.println(">>> Expression Test Program <<<");
        while (true){
            System.out.print("Input expression : ");
            txt = sagan.nextLine();

            System.out.println("The result : " + check(txt));

            System.out.print("Continue (y|n) : ");
            pass = sagan.nextLine();

            if (Objects.equals(pass, "n")){
                System.out.println("Thank you ....");
                break;
            }
        }
    }

    // check : เมื่อถึงวงเล็บปิด จะเช็ควงเล็บเปิดล่าสุดที่pushเข้ามา ว่ามันmatchingกันไหม
    private static boolean check(String data){
        MyStack stack = new MyStack();

        for (char c : data.toCharArray()){ // it don't care A-Z y a-z
            if (c == '(' || c == '{' || c == '['){

                stack.push(c);                               // push elements

            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.getTop() == -1) return false;           //check top

                char top = stack.pop();              // pop last elements

                if (!matching(top,c)){              //check () , {} , [] ; if true swap to !true(false) : false swap to !false(true)
                    return false;                    // if () , {} , [] -> don't match : return false;
                }
            }
        }
        return stack.getTop() == -1; // if in stack don't empty it will return 'false'
    }

    private static boolean matching(char start, char end) { // check matching () {} []
        return (start == '(' && end == ')') || (start == '{' && end == '}') || (start == '[' && end == ']');
    }

    // OMG PASA java
}
