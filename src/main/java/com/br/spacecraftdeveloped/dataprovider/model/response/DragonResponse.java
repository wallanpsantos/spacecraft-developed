package com.br.spacecraftdeveloped.dataprovider.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public record DragonResponse(
        String id,
        String name) {
}
