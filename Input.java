import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Input {
    public static ArrayList<String> inputnorm(String input) {
        ArrayList<String> list = new ArrayList<String>();
        String[] temp = new String[input.length()];
        String res="";
        int count= 0;
        for (int i=0; i<input.length(); i++){
            temp[i]="";
        }

        for (int i=0; i<input.length(); i++){

            if (input.charAt(i)=='+') {
                count++;
                temp[count] = "+";
                count++;
            }
            else if (input.charAt(i)=='-'){
                count++;
                temp[count] = "-";
                count++;
            }
            else if (input.charAt(i)=='*'){
                count++;
                temp[count] = "*";
                count++;
            }

            else if (input.charAt(i)=='/'){
                count++;
                temp[count] = "/";
                count++;
            }

            else if (input.charAt(i)=='^'){
                count++;
                temp[count] = "^";
                count++;
            }

            else temp[count]= temp[count] + input.charAt(i);

        }
        System.out.println(" ");

        Collections.addAll(list, temp);
        return list;
    }
}
