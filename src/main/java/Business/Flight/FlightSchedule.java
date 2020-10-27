/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

/**
 *
 * @author zhaoxi
 */
public class FlightSchedule {
    private String flightNumber;
    private Airliner airliner;
    private Airplane airplane;
    private String from;
    private String to;
    private String departureDate;
    private String departureHour;
    private String departureMin;
    private String departureTime;
    private String arrivalDate;
    private String arrivalHour;
    private String arrivalMin;
    private String arrivalTime;
    private String status;
    
    private double price;
    
    private SeatList seatList;

    public FlightSchedule() {
        seatList = new SeatList();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(String departureHour) {
        this.departureHour = departureHour;
    }

    public String getDepartureMin() {
        return departureMin;
    }

    public void setDepartureMin(String departureMin) {
        this.departureMin = departureMin;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalHour(String arrivalHour) {
        this.arrivalHour = arrivalHour;
    }

    public String getArrivalMin() {
        return arrivalMin;
    }

    public void setArrivalMin(String arrivalMin) {
        this.arrivalMin = arrivalMin;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SeatList getSeatList() {
        return seatList;
    }

    public void setSeatList(SeatList seatList) {
        this.seatList = seatList;
    }


    @Override
    public String toString(){
        return flightNumber;
    }
            
   
}
