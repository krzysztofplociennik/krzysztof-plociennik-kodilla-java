package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private ShopOrderService shopOrderService;

    public OrderProcessor(final ShopOrderService shopOrderService) {
        this.shopOrderService = shopOrderService;
    }

    public OrderDTO processOrder(final OrderInstance orderInstance) {
        boolean isOrdered = shopOrderService.process(orderInstance.getProductID(), orderInstance.getAmount(),
                orderInstance.getTotalPrice(), orderInstance.getSupplier(), orderInstance.getDateOfOrder());
        if(isOrdered) {
            return new OrderDTO(orderInstance.getSupplier(), true);
        } else {
            return new OrderDTO(orderInstance.getSupplier(), false);
        }
    }

}
