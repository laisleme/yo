package br.com.yocommunity.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @GetMapping("/cache")
    @Cacheable("cache")
    public String cache() {
        System.out.println("Bem-vindo(a) ao YoCommunity");
        return "Bem-vindo(a) ao YoCommunity";
    }
    @GetMapping("/cancela")
    @CacheEvict("cache")
    public String cancela() {
        System.out.println("Cache cancelado");
        return "Cache cancelado";
    }
}
