package lk.ijse.ThogakadeMy.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Item {
    private String code;
    private String description;
    //    double unitPrice;   //premitive data type
    private Double unitPrice;
    //    int qtyOnHand;
    private Integer qtyOnHand;
}

