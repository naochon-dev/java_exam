public class Exam3 {
    public static void main(String[] args) {
        int goods1Price = 200;
        int good2Price = 250;
        int good1Count = 3;
        int good2Count = 4;
        double tax_rate = 0.1;

        //小計
        int calcAmount = goods1Price * good1Count + good2Price * good2Count;
        System.out.println("小計");
        System.out.println( calcAmount + "円");

        //消費税
        int tax = (int) (calcAmount * tax_rate);
        System.out.println("消費税");
        System.out.println( tax + "円");

        //合計金額
        int total = calcAmount + tax;
        System.out.println("合計金額");
        System.out.println( total + "円");
    }
}
