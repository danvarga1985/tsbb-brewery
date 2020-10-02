package daniel.varga.brewery.services;

import daniel.varga.brewery.web.model.BeerDto;
import daniel.varga.brewery.web.model.BeerPagedList;
import daniel.varga.brewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto findBeerById(UUID beerId);
}
