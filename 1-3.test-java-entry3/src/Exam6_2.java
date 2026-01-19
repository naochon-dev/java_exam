public class Exam6_2 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        char mark = '+';
        System.out.println("第1引数:" + num1 + "、第2引数:" + num2 + "、第3引数:" + mark + "   ⇒   結果は" + calc(num1, num2, mark));
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
