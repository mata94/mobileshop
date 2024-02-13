package com.example.onlineshop.repository;

import com.example.onlineshop.models.OrderItem;
import com.example.onlineshop.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

    @Query("SELECT oi FROM OrderItem oi INNER JOIN oi.orders o WHERE o = :order")
    public List<OrderItem> findAllItemsForOrder(Orders order);
}
