package exam3;

public class DeLorean implements Car, Airplane, TimeMachine{
    
    //メソッド
    //走る
    @Override
    public void run(){
        System.out.println("デロリアンが走る！");
    }

    //飛ぶ
    @Override
    public void fly(){
        System.out.println("デロリアンが飛ぶ！");
    }

    //時間移動
    @Override
    public void timeTravel(){
        System.out.println("デロリアンがタイムテレポート！");
    }

    //エンジン起動
    public void engineStart(){
        run();
        fly();
        timeTravel();

    }
}
