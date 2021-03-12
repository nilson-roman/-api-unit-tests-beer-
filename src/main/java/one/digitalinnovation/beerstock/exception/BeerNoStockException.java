package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerNoStockException extends Exception {

    public BeerNoStockException(Long id, int quantityToIncrement) {
        super(String.format("Beers with %s ID to decrement informed has no stock quantity to decrease %s", id, quantityToIncrement));
    }
}
