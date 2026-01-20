public class Student {

    //フィールド
    int energy;

    //コンストラクタ
    Student(){
        energy = 50;
    }

    //メソッド
    //寝る
    void sleep(){
        energy += 50;
        if(energy > 100){
            energy = 100;
        }
        System.out.println("寝ました。エネルギーが" + energy + "になりました。");
        if(energy == 100){
            System.out.println("フルパワー!");
        }         
    }

    //勉強をする
    void study(){
        energy -= 30;
        if(energy < 0){
            energy = 0;
        }
        System.out.println("勉強しました。エネルギーが" + energy + "になりました。");
        if(energy == 0){
            System.out.println("寝てください。");
        }
    }
}
