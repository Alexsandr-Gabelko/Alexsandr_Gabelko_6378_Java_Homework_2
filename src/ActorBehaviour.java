public interface ActorBehaviour {

    void setMakeOrder(boolean makeOrder); // Создать заказ
    void setTakeOrder(boolean takeOrder); // Забрать заказ

    //методы для проверки
    boolean isMakeOrder ();
    boolean isTakeOrder();

}
