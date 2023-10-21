package org.cpts422.bootstrap;

import org.cpts422.brokers.Broker;
import org.cpts422.brokers.BrokerRepository;
import org.cpts422.currencies.Curr;
import org.cpts422.currencies.CurrencyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1) //When there are multiple command line runners, the order says which one to run first
public class DataLoader implements CommandLineRunner {

    private final BrokerRepository brokerRepository;

    private final CurrencyRepository currencyRepository;

    public DataLoader(BrokerRepository brokerRepository, CurrencyRepository currencyRepository) {
        this.brokerRepository = brokerRepository;
        this.currencyRepository = currencyRepository;
    }

    private void bootstrapData() {
        Broker broker = new Broker("Forex", 0.1);
        brokerRepository.save(broker);
        Curr inr = new Curr("INR", "Indian Rupee", 80, broker);
        inr = currencyRepository.save(inr);
        Curr cny = new Curr("CNY", "Chinese Yuan", 8, broker);
        cny = currencyRepository.save(cny);
    }


    @Override
    public void run(String... args) throws Exception {
        bootstrapData();
    }
}
