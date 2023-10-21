package org.cpts422.Controllers;

import org.cpts422.currencies.Curr;
import org.cpts422.services.CurrencyConversionService;
import org.cpts422.transaction.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {

    private final CurrencyConversionService currService;

    public CurrencyConverterController(CurrencyConversionService currService) {
        this.currService = currService;
    }

    @GetMapping("/convert/tousd")
    public Transaction convertCurrencyToUSD(@RequestParam(value = "currency") String currency, @RequestParam(value = "amount") double amount) {
        return currService.convertCurrencyToUSD(currency, amount);
    }

    @GetMapping("/convert/fromusd")
    public Transaction convertCurrencyFromUSD(@RequestParam(value = "currency") String currency, @RequestParam(value = "amount") double amount) {
        return currService.convertCurrencyFromUSD(currency, amount);
    }

    @GetMapping("/supported")
    public Iterable<Curr> getAllSupportedCurrencies(){
        return currService.getAllSupportedCurrency();
    }
}
