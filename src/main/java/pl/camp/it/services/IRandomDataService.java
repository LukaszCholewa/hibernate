package pl.camp.it.services;

public interface IRandomDataService {
    String generateCity();
    String generateStreet();
    String generateInvoiceSignature();
    String generateProductName();
    double generateProductPrice();
}
