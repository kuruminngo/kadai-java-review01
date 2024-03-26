
public class Review01 {

	public static void main(String[] args)  {
        int price = 2000; //商品価格

        int result;
        result = tax(price);
        System.out.println(price+"円の商品の税込価格は" + (price + result) + "円（消費税は" + result + "円）です。 ");
    }

    public static int tax(int price) {
    	double rate = 0.1;
        int result = (int)(price * rate); //int型に変換
        return result;
    }
}
