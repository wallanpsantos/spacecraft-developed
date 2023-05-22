package com.br.spacecraftdeveloped.entrypoint.controller;

import com.br.spacecraftdeveloped.core.usecase.DragonUseCase;
import com.br.spacecraftdeveloped.dataprovider.model.response.DragonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/dragons")
public class DragonController {

    private final DragonUseCase dragonUseCase;

    public DragonController(DragonUseCase dragonUseCase) {
        this.dragonUseCase = dragonUseCase;
    }

    @GetMapping
    public ResponseEntity<List<DragonResponse>> getDragons() {
        return ResponseEntity.ok().body(dragonUseCase.getDragons());
    }
}
