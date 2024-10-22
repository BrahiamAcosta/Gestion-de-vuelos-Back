package com.udea.gestiondevuelos.Domain.DTO;

import com.udea.gestiondevuelos.Domain.Enums.FlightType;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalTime;

public class FlightDTO {

    private Long id;

    @NotNull(message = "El numero de vuelo no puede ser nulo")
    @Pattern(regexp = "SA[0-9]{4}",message = "El numero de vuelo debe tener el formato SA seguido de 4 digitos")
    private String flightNumber;

    @NotNull(message = "El tipo de vuelo no puede ser nulo")
    private FlightType flightType;

    @NotNull(message = "La ciudad de salida no puede ser nula")
    @Pattern(regexp="^[A-Z]{3}", message = "La ciudad de salida debe tener 3 letras mayusculas")
    private String departureCity;

    @NotNull(message = "La ciudad de destino no puede ser nula")
    @Pattern(regexp="^[A-Z]{3}",message = "La ciudad de destino debe tener 3 letras mayusculas")
    private String destinationCity;

    @NotNull(message = "El id de la aeronave no puede ser nulo")
    private Long aircraftId;

    @NotNull(message = "La fecha de salida no puede ser nula")
    private LocalDate departureDate;
    @NotNull(message = "La fecha de llegada no puede ser nula")
    private LocalDate arrivalDate;
    @NotNull(message = "La hora de salida no puede ser nula")
    private LocalTime departureTime;
    @NotNull(message = "La hora de llegada no puede ser nula")
    private LocalTime arrivalTime;
    @NotNull(message = "El precio no puede ser nulo")
    @Min(150000)
    @Max(10000000)
    private Float price;
    @NotNull(message = "El porcentaje de impuestos no puede ser nulo")
    @Min(1)
    private Float taxPercentage;
    @NotNull(message = "El recargo no puede ser nulo")
    @Min(1)
    private Float surcharge;

    public FlightDTO(){}

    public FlightDTO(Long id, String flightNumber, FlightType flightType, String departureCity, String destinationCity, Long aircraftId, LocalDate departureDate, LocalDate arrivalDate, LocalTime departureTime, LocalTime arrivalTime, Float price, Float taxPercentage, Float surcharge) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.flightType = flightType;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.aircraftId = aircraftId;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.taxPercentage = taxPercentage;
        this.surcharge = surcharge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Long getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Long aircraftId) {
        this.aircraftId = aircraftId;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(Float taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public Float getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(Float surcharge) {
        this.surcharge = surcharge;
    }
}

