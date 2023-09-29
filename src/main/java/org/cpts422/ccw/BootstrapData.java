package org.cpts422.ccw;

import org.cpts422.bootstrap.DataLoader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Data...");
        DataLoader.loadData();
        System.out.println("Loaded Data Successfully!!...");
    }
}
