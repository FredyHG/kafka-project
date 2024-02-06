package dev.fredyhg.kakfaproducer.controllers;

import dev.fredyhg.kakfaproducer.services.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public void sendPackage(){
        testService.send();
    }

}
