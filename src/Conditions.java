public class Conditions {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 5;

        if (a > b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less");
        }

        if ((a > b) || (a > c)) { //логическое или
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less");
        }

        if ((a > b) && (a > c)) { //логическое и
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less");
        }

        if (!(a > c)) { //логическое не
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less");
        }

        for (int i = 1; i < 10; i++) {
            System.out.println("variable i = " + i);
        }

        int x = 20;

        while (x > 2) {
            System.out.println("variable x = " + x);
            x--;
        }

        //break -

        x = 20;

        while (x > 2) {
            System.out.println("variable x = " + x);
            x--;
            if (x == 13) {
                break;
            }
        }

        //continue;
        //switch;

        //todo iterator
    }
}
