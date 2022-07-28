package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class ProductOrderService {
   private static InformationService informationService;
   private static OrderService orderService;
   private static OrderRepository orderRepository;

   public ProductOrderService(final InformationService informationService,
                              final OrderService orderService,
                              final OrderRepository orderRepository) {
       this.informationService = informationService;
       this.orderService = orderService;
       this.orderRepository = orderRepository;
   }
   public static OrderDto process(final OrderRequest orderRequest) {
       boolean isAvailable = orderService.order(orderRequest.getProvider(), orderRequest.getProduct(),orderRequest.getQuantity());


   if (isAvailable) {
       informationService.inform("ExtraFoodShop");
       orderRepository.createOrder(orderRequest.getProvider(), orderRequest.getProduct(), orderRequest.getQuantity());

       return new OrderDto(orderRequest.getProvider(), true);
   }
       throw new RuntimeException("Is not ordered");
   }


}
