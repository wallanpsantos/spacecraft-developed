package com.br.spacecraftdeveloped.core.usecase;

import com.br.spacecraftdeveloped.dataprovider.gateway.DragonFeign;
import com.br.spacecraftdeveloped.dataprovider.model.response.DragonResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DragonUseCase {

    private final DragonFeign dragonFeign;

    public DragonUseCase(DragonFeign dragonFeign) {
        this.dragonFeign = dragonFeign;
    }

    public List<DragonResponse> getDragons() {
        return dragonFeign.getDragons();
    }

}
