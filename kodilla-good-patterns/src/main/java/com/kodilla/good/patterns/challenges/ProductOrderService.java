package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

private InformationService informationService;
private OrderService orderService;
private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.bought(orderRequest.getCustomer(),orderRequest.getProduct(), orderRequest.getSeller());

        if (isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getProduct(),orderRequest.getSeller());
            return new OrderDto(orderRequest.getCustomer(),true);

        }
    }
}
