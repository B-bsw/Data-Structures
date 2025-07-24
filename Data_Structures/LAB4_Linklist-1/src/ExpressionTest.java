// สรวิชญ์ ทัศดร 673380065-6 sec2
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

            if (pass.equals("n")){
                System.out.println("Thank you ....");
                break;
            }
        }
    }

    private static boolean check(String c){
        SLinkStack stack = new SLinkStack();

        for (String i : c.split(" ")){

            if (i.equals("(") || i.equals("{") || i.equals("[")){
                stack.pushSLink(i);
            } else if (i.equals(")") || i.equals("}") || i.equals("]")) {
                if (stack.getTop() == -1 || !matching(stack.popSLink(), i)) {
                    return false;
                }
            }
        }
        return stack.getTop() == -1;
    }

    private static boolean matching(String start, String end) {
        return (start.equals("(") && end.equals(")")) || (start.equals("{") && end.equals("}")) || (start.equals("[") && end.equals("]"));
    }
}
