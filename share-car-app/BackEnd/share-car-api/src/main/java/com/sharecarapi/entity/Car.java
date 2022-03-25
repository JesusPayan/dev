package com.sharecarapi.entity;

import lombok.Data;
import javax.persistence.*;


@Entity
@Table(name = "car")
@Data
public class Car {

    @Id
    @Column(name = "car_license_id")
    String carId;

    @Column(name = "car_brand")
    String carBrand;

    @Column(name = "car_model")
    Integer carModel;

    @Column(name = "car_color")
    String carColor;

    @Column(name = "driver_name")
    String driverName;
    @Column(name = "is_assign")
    Boolean isAssign;
    @Column(name = "car_status")
    Boolean carStatus;



    public Car() {
    }

    public Car(String carId, String carBrand, Integer carModel, String carColor, Boolean isAssign, Boolean carStatus) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carColor = carColor;
        this.isAssign = isAssign;
        this.carStatus = carStatus;
    }
}
