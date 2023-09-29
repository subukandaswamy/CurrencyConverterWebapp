package org.cpts422.ccw;

import org.cpts422.services.CurrencyConversionService;
import org.cpts422.services.CurrencyConversionServiceImpl;
import org.cpts422.transaction.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {

    public static final CurrencyConversionService currService = new CurrencyConversionServiceImpl();

    @GetMapping("/convert/tousd")
    public Transaction convertCurrencyToUSD(@RequestParam(value = "currency") String currency,@RequestParam(value="amount")double amount){
        return currService.convertCurrencyToUSD(currency, amount);
    }

    @GetMapping("/convert/fromusd")
    public Transaction convertCurrencyFromUSD(@RequestParam(value = "currency") String currency,@RequestParam(value="amount")double amount){
        return currService.convertCurrencyFromUSD(currency, amount);
    }
}
