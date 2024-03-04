public class OrderPaidOrderState implements OrderState {
    @Override
    public void doSomeActionOnCurrentState(Order order) {
        // send the order to warehouse
        System.out.println("Order is paid, moving to delivered");
        order.setOrderState(new OrderDeliveredOrderState());
    }
}
