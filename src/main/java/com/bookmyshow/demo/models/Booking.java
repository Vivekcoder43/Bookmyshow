package com.bookmyshow.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;

    // to handle cancellation of booking, then it'll be m:m
    @OneToMany
    private List<ShowSeat> showSeatList;
    private int amount;

    @OneToMany
    private List<Payment> payments;

}
