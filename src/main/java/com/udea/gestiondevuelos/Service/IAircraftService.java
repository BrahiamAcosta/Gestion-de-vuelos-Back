package com.udea.gestiondevuelos.Service;

import com.udea.gestiondevuelos.Domain.DTO.AircraftDTO;

import java.util.List;

public interface IAircraftService {
    AircraftDTO createAircraft(AircraftDTO aircraftDTO);
    List<AircraftDTO> getAllAircrafts();
    AircraftDTO getAircraftById(Long Id);
    AircraftDTO updateAircraft(Long id, AircraftDTO aircraftDTO);
    void deleteAircraft(Long Id);
}