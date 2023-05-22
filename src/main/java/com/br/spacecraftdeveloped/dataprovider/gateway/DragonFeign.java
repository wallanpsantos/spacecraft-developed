package com.br.spacecraftdeveloped.dataprovider.gateway;

import com.br.spacecraftdeveloped.dataprovider.model.response.DragonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "DragonClient", url = "https://api.spacexdata.com/v4/dragons")
public interface DragonFeign {

    @GetMapping
    List<DragonResponse> getDragons();

}
