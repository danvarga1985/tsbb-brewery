package daniel.varga.brewery.web.mappers;

import daniel.varga.brewery.domain.Beer;
import daniel.varga.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
