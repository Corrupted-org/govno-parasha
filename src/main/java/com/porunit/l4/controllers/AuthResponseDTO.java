package com.porunit.l4.controllers;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@Builder
@RequiredArgsConstructor
public class AuthResponseDTO {
    private final String accessToken;
    private final String tokenType = "Bearer ";
}
