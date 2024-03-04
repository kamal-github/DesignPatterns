public class OrderDeliveredOrderState implements OrderState {
    public void doSomeActionOnCurrentState(Order order) {
        System.out.println("Order is delivered, moving to returned");
        order.setOrderState(new OrderReturnedOrderState());
    }
}
