package guru.springframework.spring_6_rest_mvc.service;

import guru.springframework.spring_6_rest_mvc.model.Beer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


public interface BeerService {
    Beer getBeerById(UUID id);

    List<Beer> listBeers();

    Beer saveNewBeer(Beer beer);

    Beer updateBeerById(UUID beerId, Beer beer);
}
