package exam1;

public class Car {

    //フィールド
    protected String name;
    
    //メソッド
    //給油する
    public void putOnGas(){
        System.out.println(name + "に給油します");
    }

    //走る
    public void run(){
        System.out.println("ブーン!車が走ります");
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
