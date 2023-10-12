
public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("A");
            methodB("start");
        } else {
            System.out.println("A");
            System.out.println(methodC(input));

        }
        System.out.println("A");
    }

    public void methodB(String start) {
        System.out.println("V");
    }

    public int methodC(String input) {
        System.out.println("A");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("f");
        if (number > 5) {
            System.out.println("g");
        }
        System.out.println("h");

    }


}