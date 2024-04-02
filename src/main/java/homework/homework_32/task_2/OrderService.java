package homework.homework_32.task_2;

public interface OrderService {
    void createOrder(String item, int quantity);
    void processPayment(int orderId);
}
