package com.algaworks.algatransito.api.model.Input;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProprietarioIdInput {

	@NotNull
	private Long id;

}
