package repository;
import domains.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("orderemployeeRepository")
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
