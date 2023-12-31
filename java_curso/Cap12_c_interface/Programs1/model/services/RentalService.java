package java_curso.Cap12_c_interface.Programs1.model.services;

import java.time.Duration;

import java_curso.Cap12_c_interface.Programs1.model.entities.CarRental;
import java_curso.Cap12_c_interface.Programs1.model.entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {//usando a classe CarRental e seus métodos

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();//calculo da duração em minutos
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);//arredondar o numero
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax)); //processo do calculo final
    }
}
