package daniel.varga.brewery.events;

import daniel.varga.brewery.domain.BeerOrder;
import daniel.varga.brewery.domain.OrderStatusEnum;
import org.springframework.context.ApplicationEvent;

public class BeerOrderStatusChangeEvent  extends ApplicationEvent {

    private final OrderStatusEnum previousStatus;

    public BeerOrderStatusChangeEvent(BeerOrder source, OrderStatusEnum previousStatus) {
        super(source);
        this.previousStatus = previousStatus;
    }

    public OrderStatusEnum getPreviousStatus() {
        return previousStatus;
    }
}
