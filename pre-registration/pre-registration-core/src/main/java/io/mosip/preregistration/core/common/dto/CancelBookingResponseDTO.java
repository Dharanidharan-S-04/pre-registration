package io.mosip.preregistration.core.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancelBookingResponseDTO {
	private String transactionId;

	private String message;
}