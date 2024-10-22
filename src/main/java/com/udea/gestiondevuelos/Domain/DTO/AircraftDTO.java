package com.udea.gestiondevuelos.Domain.DTO;

import com.udea.gestiondevuelos.Domain.Enums.AircraftModel;
import com.udea.gestiondevuelos.Domain.Enums.SeatConfiguration;
import com.udea.gestiondevuelos.Domain.DTO.FlightDTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class AircraftDTO {
    private Long id;
    @NotNull(message = "El modelo de la aeronave no puede ser nulo")
    private AircraftModel aircraftModel;
    @NotNull(message = "El numero maximo de asientos no puede ser nulo")
    @Min(0)
    private Integer maxSeats;
    @NotNull(message = "La configuracion de asientos no puede ser nula")
    private SeatConfiguration seatConfiguration;
    private List<FlightDTO> flights = new ArrayList<>();

    public AircraftDTO() {
    }

    public AircraftDTO(Long id, AircraftModel aircraftModel, Integer maxSeats, SeatConfiguration seatConfiguration) {
        this.id = id;
        this.aircraftModel = aircraftModel;
        this.maxSeats = maxSeats;
        this.seatConfiguration = seatConfiguration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AircraftModel getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(AircraftModel aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    public SeatConfiguration getSeatConfiguration() {
        return seatConfiguration;
    }

    public void setSeatConfiguration(SeatConfiguration seatConfiguration) {
        this.seatConfiguration = seatConfiguration;
    }
    public List<FlightDTO> getFlights() {
        return flights;
    }
    public void setFlights(List<FlightDTO> flights) {
        this.flights = flights;
    }
}
