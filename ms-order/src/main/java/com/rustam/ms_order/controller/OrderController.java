package com.rustam.ms_order.controller;

import com.rustam.ms_order.dto.OrderDto;
import com.rustam.ms_order.service.OrderService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/order")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class OrderController {

    OrderService orderService;

    @PostMapping(path = "/save")
    public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDto orderDto){
        return new ResponseEntity<>(orderService.save(orderDto), HttpStatus.OK);
    }

    @GetMapping(path = "/read")
    public ResponseEntity<OrderDto> readOrder(){
        return new ResponseEntity<>(orderService.read(),HttpStatus.OK);
    }
}
