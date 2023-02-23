package com.example.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {

  @GetMapping(value = "/home")
  public Mono<Map<String, String>> home() {
    return Mono.just(Map.of());
  }


}
