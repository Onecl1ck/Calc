import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Input {
    public static ArrayList<String> inputnorm(String input) {
        ArrayList<String> list = new ArrayList<String>();
        int[] temp = new int[input.length()];
        String[] temp1 = new String[input.length()];
        String res="";
        int count= 0;
        for (int i=0; i<input.length(); i++){
            temp1[i]="";
        }

        for (int i=0; i<input.length(); i++){

            if (input.charAt(i)=='+') {
                count++;
                temp1[count] = "+";
                count++;
            }
            else if (input.charAt(i)=='-'){
                count++;
                temp1[count] = "-";
                count++;
            }
            else if (input.charAt(i)=='*'){
                count++;
                temp1[count] = "*";
                count++;
            }

            else if (input.charAt(i)=='/'){
                count++;
                temp1[count] = "/";
                count++;
            }

            else if (input.charAt(i)=='^'){
                count++;
                temp1[count] = "^";
                count++;
            }

            else temp1[count]= temp1[count] + input.charAt(i);

        }
        System.out.println(" ");

        Collections.addAll(list, temp1);
        return list;
    }
}
