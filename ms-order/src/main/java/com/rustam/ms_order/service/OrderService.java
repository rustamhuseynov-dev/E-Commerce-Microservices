package com.rustam.ms_order.service;

import com.rustam.ms_order.dto.OrderDto;
import com.rustam.ms_order.mapper.OrderMapper;
import com.rustam.ms_order.model.Order;
import com.rustam.ms_order.repository.OrderRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class OrderService {

    OrderRepository orderRepository;
    RabbitTemplate rabbitTemplate;

    public OrderDto save(OrderDto orderDto) {
        Order order = Order.builder()
                .orderName(orderDto.getOrderName())
                .orderNumber(orderDto.getOrderNumber())
                .build();
        orderRepository.save(order);
        return OrderMapper.ORDER_MAPPER.convert(order);
    }

//    public OrderDto read() {
//        rabbitTemplate.se
//    }
}
