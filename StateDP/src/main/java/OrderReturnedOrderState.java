public class OrderReturnedOrderState implements OrderState {
    public void doSomeActionOnCurrentState(Order order) {
        System.out.println("order is returned, final!!");
    }
}
