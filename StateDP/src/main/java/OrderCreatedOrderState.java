public class OrderCreatedOrderState implements OrderState {

    @Override
    public void doSomeActionOnCurrentState(Order order) {
        // do some action when moving next state.
        System.out.println("currently in created state, moving to paid");
        order.setOrderState(new OrderPaidOrderState());
    }
}
