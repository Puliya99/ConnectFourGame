package lk.ijse.ThogakadeMy.dto;
import lombok.*;
@Data
@AllArgsConstructor
public class CartDTO {
    String code;
    Integer qty;
    Double unitPrice;
}
