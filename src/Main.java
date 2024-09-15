//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Market market = new Market();
        Human human1 = new Human("Виктор");
        Human human2 = new Human("Иван");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();



    }
}