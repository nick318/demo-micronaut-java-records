package com.example;

import io.micronaut.core.annotation.Introspected;


@Introspected
public record RequestDto(String name){
}
