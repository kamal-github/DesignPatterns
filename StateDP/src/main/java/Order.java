public class Order {
    private final int orderId;
    private OrderState currentOrderState;

    Order(int orderId) {
        this.orderId = orderId;
        currentOrderState = new OrderCreatedOrderState();
    }

    public void setOrderState(OrderState orderState) {
        this.currentOrderState = orderState;
    }

    public void doSomeAction() {
        currentOrderState.doSomeActionOnCurrentState(this);
    }

    public int getOrderId() {
        return orderId;
    }
}
