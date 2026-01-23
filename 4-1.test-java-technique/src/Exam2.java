/**
 * @author IwakawaNao
 */

public class Exam2 {

    /**
     * 指定した文字列が名言の何文字目から始まるか表示する.
     * @param args
     */
    
    public static void main(String[] args) {
        
        String famousSpeech = "Stay hungry, stay foolish.";
        String keyWord = "hungry";

        System.out.println(keyWord + "は" + famousSpeech.indexOf(keyWord) + "番目から始まります");
    }

}
