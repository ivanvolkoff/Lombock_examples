package org.example.model;

import lombok.*;

import java.util.Objects;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String make;

    private String model;
    private String engineVolume;
}
