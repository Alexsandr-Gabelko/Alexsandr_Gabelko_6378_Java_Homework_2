import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor); // добавление посетителя в магазин
    void releaseFromMarket(List<Actor> actors); // выход из магазина
    void update(); // обновление магазина
}
