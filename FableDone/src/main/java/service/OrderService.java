package service;

import java.util.List;
import java.util.Optional;

import domains.Order;

public interface OrderService {

    public List<Order> getAllOrders();
    public Optional<Order> getOrderByDomainId(int domainId);
}
