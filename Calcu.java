import java.util.ArrayList;

public class Calcu {
    public static String calc(ArrayList<String> input){
        int tmp = 0;

        System.out.println(input);

        for (int i=input.size()-1; i>=0; i--) {
            if (input.get(i) == "/") {
                tmp = Integer.parseInt(input.get(i - 1))/Integer.parseInt(input.get(i + 1));
                input.remove(i+1);
                input.remove(i);
                input.set(i-1, Integer.toString(tmp));
                System.out.println(input);
            }
        }

        for (int i=input.size()-1; i>=0; i--) {
            if (input.get(i) == "*") {
                tmp = Integer.parseInt(input.get(i - 1))*Integer.parseInt(input.get(i + 1));
                input.remove(i+1);
                input.remove(i);
                input.set(i-1, Integer.toString(tmp));
                System.out.println(input);
            }
        }

        for (int i=input.size()-1; i>=0; i--) {
            if (input.get(i) == "+") {
                tmp = Integer.parseInt(input.get(i - 1))+Integer.parseInt(input.get(i + 1));
                input.remove(i+1);
                input.remove(i);
                input.set(i-1, Integer.toString(tmp));
                System.out.println(input);
            }
        }
        for (int i=input.size()-1; i>=0; i--) {
            if (input.get(i) == "-") {
                tmp = Integer.parseInt(input.get(i - 1))-Integer.parseInt(input.get(i + 1));
                input.remove(i+1);
                input.remove(i);
                input.set(i-1, Integer.toString(tmp));
                System.out.println(input);
            }
        }
        return String.valueOf(Integer.parseInt(input.get(0)));
    }
}