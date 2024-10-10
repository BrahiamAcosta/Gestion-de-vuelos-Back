package com.udea.gestiondevuelos.Service;

import com.udea.gestiondevuelos.Domain.DTO.FlightDTO;

import java.util.List;

public interface IFlightService {
    FlightDTO createFlight(FlightDTO input);
    List<FlightDTO> getAllFlights();
    FlightDTO getFlightById(Long id);
    FlightDTO updateFlight(Long id, FlightDTO input);
    void deleteFlight(Long id);
}