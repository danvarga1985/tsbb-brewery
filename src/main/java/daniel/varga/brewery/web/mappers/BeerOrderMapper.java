package daniel.varga.brewery.web.mappers;

import daniel.varga.brewery.domain.Beer;
import daniel.varga.brewery.domain.BeerOrder;
import daniel.varga.brewery.domain.BeerOrderLine;
import daniel.varga.brewery.web.model.BeerOrderDto;
import daniel.varga.brewery.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);

    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    default BeerOrderLine dtoToBeerOrder(BeerOrderLineDto dto){
        return BeerOrderLine.builder()
                .orderQuantity(dto.getOrderQuantity())
                .beer(Beer.builder().id(dto.getBeerId()).build())
                .build();
    }
}
