package com.fleabagsolutions.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleabagsolutions.orderservice.dto.OrderRequest;

@RestController
@RequestMapping("/api/order")
public class OrderController {
  @PostMapping
  // @RequestBody tells Spring to deserialize the incoming HTTP request body onto the OrderRequest object.
  public String placeOrder(@RequestBody OrderRequest orderRequest) {
    return "Order Placed Successfully";
  }
}
