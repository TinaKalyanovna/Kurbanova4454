public class hw_2 {
    public static void main(String[] args) {

        Market market = new Market();
        Human human1 = new Human("Толик");
        Human human2 = new Human("Вова");

        market.acceptToMarket(human2);
        market.acceptToMarket(human1);
        market.update();

    }
}
