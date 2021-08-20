package com.cts.medicineStock.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TreatingAilmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TreatingAilmentNotFoundException(String message) {
		super(message);
	}

}
