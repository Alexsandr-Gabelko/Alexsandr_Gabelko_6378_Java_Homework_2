public interface QueueBehaviour {
    void takeInQueue(Actor actor); // встать в очередь
    void takeOrders(); // забрать заказ
    void giveOrders(); //отдать заказ
    void releaseFromQueue(); // выйти из очереди

}
