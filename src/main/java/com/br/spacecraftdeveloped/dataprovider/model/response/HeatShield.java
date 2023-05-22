package com.br.spacecraftdeveloped.dataprovider.model.response;

import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.math.BigDecimal;

import static com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;

@JsonNaming(SnakeCaseStrategy.class)
public record HeatShield(
        String material,
        BigDecimal sizeMeters,
        BigDecimal tempDegrees,
        String devPartner
) {
}
