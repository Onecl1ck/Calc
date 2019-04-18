public class Main {
    public static void main(String[] args) {
        String input= "6+(4-(2+(3+2)*(4+2)))+(2+3)";
        String input1= "(2+(3+2)*(4+2))";
        //System.out.println("Ответ: " + Calcu.calc(Input.inputnorm(input)));
        //System.out.println("Ответ: " + (Input.cutrightbracket(Input.cutleftbracket(input))));
        //System.out.println("Ответ: " + Input.cutrightbracket(Input.cutleftbracket((Input.cutrightbracket(Input.cutleftbracket(input))))));
        //System.out.println("Ответ: " + (Input.cutrightbracket(Input.cutleftbracket(input1))));
        //System.out.println("Ответ: " + (Input.pokanezaebet(input)));
        //System.out.println("Ответ: " + (Calcu.calc(InputConvert.inputnorm(Input.pokanezaebet(input)))));
        System.out.println("Глобал: " + Input.globalstring(input));
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}