package com.algaworks.algatransito.api.model.Input;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AutuacaoInput {
	@NotBlank
    private String descricao;

    @NotNull
    @Positive
    private BigDecimal valorMulta;

}