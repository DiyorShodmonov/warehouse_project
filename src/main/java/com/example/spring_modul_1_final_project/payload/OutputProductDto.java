package com.example.spring_modul_1_final_project.payload;

import lombok.Data;

@Data
public class OutputProductDto {
    private Long   productId;
    private Double amount;
    private Double price;
    private Long outputId;
}
