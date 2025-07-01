package com.example.test.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

}
