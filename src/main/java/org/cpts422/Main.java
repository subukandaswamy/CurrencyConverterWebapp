package org.cpts422;

import org.cpts422.bootstrap.DataLoader;
import org.cpts422.currencies.Curr;
import org.cpts422.services.CurrencyConversionService;
import org.cpts422.services.CurrencyConversionServiceImpl;
import org.cpts422.transaction.Transaction;


public class Main {

    private static final CurrencyConversionService service = new CurrencyConversionServiceImpl();

    public static void main(String[] args) {
        DataLoader.loadData();
        for (Curr c : service.getAllSupportedCurrency()) {
            System.out.println(c);
        }
        Transaction inr_to_usd = service.convertCurrencyToUSD("INR", 800);

        System.out.println(inr_to_usd);

        Transaction usd_to_inr = service.convertCurrencyFromUSD("INR", 10);

        System.out.println(usd_to_inr);
    }
}