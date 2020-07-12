package pl.camp.it.services;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDataService implements IRandomDataService {
    @Override
    public String generateCity(){
        List<String> cities = Arrays.asList("Kraków", "Warszawa", "Poznań", "Katowice",
                "Gliwice", "New York", "Paris", "Berlin", "Tokyo");

        Random random = new Random();
        return cities.get(random.nextInt(cities.size())); // lub return cities.get(new Random().nextInt(cities.size()));
    }

    @Override
    public String generateStreet(){
        List<String> streets = Arrays.asList("Polna", "Ogrodowa", "Topolowa", "Szewska",
                "Floriańska", "Wall Street", "Długa", "Krzywa", "Prosta");

        Random random = new Random();
        return streets.get(random.nextInt(streets.size())); // lub return streets.get(new Random().nextInt(streets.size()));
    }

    @Override
    public String generateInvoiceSignature(){
        Random random = new Random();
        int no = random.nextInt(10) + 1;
        int month = random.nextInt(12) + 1;
        int year = random.nextInt(6) + 2015;

        return new StringBuilder()
                        .append("FV/")
                        .append(no)
                        .append("/")
                        .append(month)
                        .append("/")
                        .append(year)
                        .toString();
    }

    @Override
    public String generateProductName(){
            List<String> name = Arrays.asList("Woda", "Wino", "Kiełbasa", "Piwo",
                    "Bułki", "Salceson", "Papryka", "Chipsy", "Cola");

            Random random = new Random();
            return name.get(random.nextInt(name.size())); // lub return name.get(new Random().nextInt(name.size()));
    }

    @Override
    public double generateProductPrice(){
        int generatedNumber = new Random().nextInt(1901) +100;
        return ((double)generatedNumber) / 100.0;
    }
}

