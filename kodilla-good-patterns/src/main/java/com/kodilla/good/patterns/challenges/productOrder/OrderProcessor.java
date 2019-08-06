package com.kodilla.good.patterns.challenges.productOrder;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private Repository repository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService productOrderService,
                          final Repository repository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.repository = repository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getProductID(), orderRequest.getOrderDate(),
                orderRequest.getPrice(), orderRequest.getUser());
        if(isOrdered) {
            informationService.sendMail(orderRequest.getUser());
            repository.createRepository(orderRequest.getProductID(), orderRequest.getOrderDate(),
                    orderRequest.getPrice(), orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }


}
