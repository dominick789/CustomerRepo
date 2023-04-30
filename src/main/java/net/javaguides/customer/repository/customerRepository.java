package net.javaguides.customer.repository;

import net.javaguides.customer.entity.customer_det;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<customer_det, Long> {
}
