public class Exam6 {
    public static void main(String[] args) {
        System.out.println(calc(7, 2, '@'));
    }

    static int calc(int num1, int num2, char mark){
        if(mark == '+'){
            return num1 + num2;
        }else if(mark == '-'){
            return num1 - num2;
        }else if(mark == '*'){
            return num1 * num2;
        }else if(mark == '/'){
            return num1 / num2;
        }else{
            return -1;
        }
    }
}
