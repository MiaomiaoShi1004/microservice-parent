package com.fleabagsolutions.orderservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * DTO - Data Transfer Object: Simple objects that should not contain any business logic 
 * but may contain serialization and deserialization mechanisms for transferring data over the network or the message bus
 * 
 * OrderRequest - transfer data from the client to server
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
  private List<OrderLineItemsDto> orderLineItemsDto;
}
