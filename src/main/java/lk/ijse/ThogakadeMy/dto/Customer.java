package lk.ijse.ThogakadeMy.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
    private String id;
    private String name;
    private String address;
    private Double salary;

}
