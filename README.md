# Repositorio provisional para el módulo de gestión de vuelos - Backend

## AIRLINE-API

[Spring Boot](http://projects.spring.io/spring-boot/) application

## GraphQL API Architecture

| Name                     | GraphQL Query/Mutation                          | Description                                         | Required Fields                                                                 | Implemented |
| ------------------------ | ----------------------------------------------- | -------------------------------------------------- | ------------------------------------------------------------------------------- | ----------- |
| Get Flights              | `query { getFlightsByFilters }`                | Get information of flights by filters             | `departureCity`, `destinationCity`, `departureDate`, `arrivalDate` (optional)   | ✅          |
| Get Flight by ID         | `query { flightById(id) }`                     | Get information of a specific flight by ID        | `id` (ID of the flight)                                                         | ✅          |
| Create Flight            | `mutation { createFlight(input) }`             | Create a flight                                   | `input` (FlightInput with all necessary flight details)                         | ✅          |
| Update Flight by ID      | `mutation { updateFlight(id, input) }`         | Update the flight info by its ID                  | `id` (ID of the flight), `input` (updated flight data)                          | ✅          |
| Delete Flight by ID      | `mutation { deleteFlight(id) }`                | Delete a flight by its ID                         | `id` (ID of the flight)                                                         | ✅          |
| Get Aircrafts            | `query { getAircraftsByFilters }`              | Get information of aircrafts by filters           | `aircraftModel`, `maxSeats`, `seatConfiguration` (optional)                     | ✅          |
| Get Aircraft by ID       | `query { aircraftById(id) }`                   | Get information of a specific aircraft by ID      | `id` (ID of the aircraft)                                                       | ✅          |
| Create Aircraft          | `mutation { createAircraft(input) }`           | Create an aircraft                                | `input` (AircraftInput with necessary aircraft details)                         | ✅          |
| Update Aircraft by ID    | `mutation { updateAircraft(id, input) }`       | Update an aircraft by its ID                      | `id` (ID of the aircraft), `input` (updated aircraft data)                      | ✅          |
| Delete Aircraft by ID    | `mutation { deleteAircraft(id) }`              | Delete an aircraft by its ID                      | `id` (ID of the aircraft)                                                       | ✅          |

### Required Fields

#### FlightInput (for `createFlight` and `updateFlight`)
- **flightNumber**: Unique identifier for the flight (e.g., SA123).
- **flightType**: Type of flight (e.g., `NACIONAL`, `INTERNACIONAL`).
- **departureCity**: City where the flight departs (e.g., MDE).
- **destinationCity**: City where the flight arrives (e.g., BOG).
- **aircraftId**: Identifier of the aircraft assigned to the flight.
- **departureDate**: Date of departure (YYYY-MM-DD format).
- **arrivalDate**: Date of arrival (YYYY-MM-DD format).
- **departureTime**: Time of departure (HH:MM format).
- **arrivalTime**: Time of arrival (HH:MM format).
- **price**: Base price of the flight.
- **taxPercentage**: Tax applied as a percentage.
- **surcharge**: Additional charge for the flight.

#### AircraftInput (for `createAircraft` and `updateAircraft`)
- **aircraftModel**: Model of the aircraft (e.g., `B737`, `A320`).
- **maxSeats**: Maximum seating capacity of the aircraft.
- **seatConfiguration**: Seating arrangement (e.g., `TWO_TWO_TWO`, `THREE_THREE_THREE`).

