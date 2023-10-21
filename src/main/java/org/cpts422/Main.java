package org.cpts422;

import org.cpts422.currencies.Curr;
import org.cpts422.services.CurrencyConversionService;
import org.cpts422.transaction.Transaction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2) //When there are multiple command line runners, the order says which one to run first
public class Main implements CommandLineRunner {

    private final CurrencyConversionService service;

    public Main(CurrencyConversionService service) {
        this.service = service;
    }


    @Override
    public void run(String... args) throws Exception {

        for (Curr c : service.getAllSupportedCurrency()) {
            System.out.println(c);
        }
        Transaction inr_to_usd = service.convertCurrencyToUSD("INR", 800);

        System.out.println(inr_to_usd);

        Transaction usd_to_inr = service.convertCurrencyFromUSD("INR", 10);

        System.out.println(usd_to_inr);
    }
}