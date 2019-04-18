import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Input {
    String input= "6+(4-(2+(3+2)*(4+2)))+(2+3)";

    public static String pokanezaebet(String input) {

        String tmp=input;
        int nezaebet=0;
        while (nezaebet <9){
            tmp = cutleftbracket(tmp);
            tmp = cutrightbracket(tmp);
            nezaebet++;
        }
        return tmp;
    }
    public static String calcbracket(String input){
        String tmp= Calcu.calc(InputConvert.inputnorm(Input.pokanezaebet(input)));
        GlobalVars.remaininput=GlobalVars.leftpart.substring(0,GlobalVars.leftpart.length()-1)+tmp+GlobalVars.rightpart.substring(1,GlobalVars.rightpart.length());
        System.out.println("remaininput:");
        System.out.println(GlobalVars.remaininput);
        GlobalVars.leftpart="";
        GlobalVars.rightpart="";
        return GlobalVars.remaininput;
    }

    public static String pokanezaebet2(String input) {

        String tmp=input;
        int nezaebet=0;
        while (nezaebet <9){
            tmp = calcbracket(tmp);
            nezaebet++;
        }
        return tmp;
    }


    public static String cutleftbracket(String input) {
        String tmp=input;

       //String leftpart="";

        for (int i=0; i<input.length();i++) {
            if (input.charAt(i)=='(') {
                GlobalVars.leftpart+= input.substring(0,i+1);
                tmp = input.substring(i+1, input.length());
                System.out.println("leftpart:");
                System.out.println(GlobalVars.leftpart);
                System.out.println("tmpleft:");
                System.out.println(tmp);
                break;
            }
        }
        return tmp;
    }

    public static String cutrightbracket(String input) {
        String tmp=input;
        //String rightpart="";
        int count=1;

        for (int i=0; i<input.length();i++) {
            if (input.charAt(i)=='(') {
                count++;
            }
            if (input.charAt(i)==')') {
                count--;
                if (count==0){
                    GlobalVars.rightpart= input.substring(i,input.length())+GlobalVars.rightpart;
                    tmp = input.substring(0, i);
                    System.out.println("rightpart:");
                    System.out.println(GlobalVars.rightpart);
                    System.out.println("tmpright:");
                    System.out.println(tmp);
                    break;
                }
            }
        }
        return tmp;
    }

    public static String minexpression(String input) {
        String tmp1=input;

        int flag=0;
        while (flag!=1) {
            tmp1 = findminexpression(tmp1);
            System.out.println("tmp1:");
            System.out.println(tmp1);
            if (tmp1.length()<4)
                flag=1;
        }

        return tmp1;
    }
    public static String cutminexpression(String input) {
        ArrayList<String> expressions = new ArrayList<String>();
        //int i=0;
        //String tmp1=input;
        String tmp2="";
        //String tmp3="";
        //String tmp="";
        //while (input.charAt(i)!=')'){

        for (int i=0; i<input.length();i++) {

            if (input.charAt(i)=='(') {
                String[] temp = input.split("\\(",2);
                tmp2 = temp[1];
                System.out.println("tmp2:");
                System.out.println(tmp2);
                //expressions.add(tmp2);
                //pokanetzakrskobki(tmp2);
            }
            if (input.charAt(i)==')') {
                String[] temp1 = input.split("\\)",2);
                tmp2 = temp1[0];
                expressions.add(tmp2);
                break;
            }
        }
        return tmp2;
    }

    public static String findminexpression(String input) {
        ArrayList<String> expressions = new ArrayList<String>();
        //int i=0;
        //String tmp1=input;
        String tmp2="";
        //String tmp3="";
        //String tmp="";
        //while (input.charAt(i)!=')'){

        for (int i=0; i<input.length();i++) {

            if (input.charAt(i)=='(') {
                String[] temp = input.split("\\(",2);
                tmp2 = temp[1];
                System.out.println("tmp2:");
                System.out.println(tmp2);
                //expressions.add(tmp2);
                //pokanetzakrskobki(tmp2);
            }
            if (input.charAt(i)==')') {
                String[] temp1 = input.split("\\)",2);
                System.out.println("temp1[]:");
                System.out.println(temp1[0]);
                tmp2 = temp1[0];
                expressions.add(tmp2);
                break;
            }
        }
        return tmp2;
    }


}
