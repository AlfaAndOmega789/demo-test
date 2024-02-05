package homework.homework_33.task_2;

public class OrderSessionFacade {
    private OrderService orderService;

    public OrderSessionFacade(OrderService orderService){
        this.orderService = orderService;
    }
    public void createOrderANdProcessPayment(String item, int quantity){
        orderService.createOrder(item, quantity);
        orderService.processPayment(getLatestOrderid());
    }
    private int getLatestOrderid(){
        return 123;
    }
}
