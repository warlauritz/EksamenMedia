package service;

import java.util.List;
import java.util.Optional;

import domains.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.OrderRepository;

@Service("orderService")
public class OrderServiceImpl implements OrderService  {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderByDomainId(int domainId) {
        return orderRepository.findById( domainId);
    }

}
