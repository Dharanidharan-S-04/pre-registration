package io.mosip.preregistration.application.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.preregistration.core.common.dto.MainResponseDTO;
import lombok.Getter;

/**
 * The PrimaryKeyValidationException class represents an exception that occurs
 * when a primary key validation fails. This class extends
 * {@link BaseUncheckedException} and includes various constructors for
 * different use cases, as well as a {@link MainResponseDTO} object for
 * additional error information.
 * 
 * @author Rajath KR
 * @since 1.0.0
 * 
 */

@Getter
public class PrimaryKeyValidationException extends BaseUncheckedException {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7303748392658525834L;

	/** The main response DTO associated with the exception. */
	private MainResponseDTO<?> response;

	/**
	 * Default constructor
	 */
	public PrimaryKeyValidationException() {
		super();
	}

	/**
	 * Constructs a new {@code PrimaryKeyValidationException} with the specified
	 * error message.
	 * 
	 * @param errorMessage the detailed error message.
	 */
	public PrimaryKeyValidationException(String errorMessage) {
		super(errorMessage);
	}

	/**
	 * Constructs a new {@code PrimaryKeyValidationException} with the specified
	 * error code, error message, and rootCause.
	 * 
	 * @param errorCode    the error code representing the specific error condition.
	 * @param errorMessage the detailed error message.
	 * @param rootCause    the cause of the error.
	 */
	public PrimaryKeyValidationException(String errorCode, String errorMessage, Throwable rootCause) {
		super(errorCode, errorMessage, rootCause);
	}

	/**
	 * Constructs a new {@code PrimaryKeyValidationException} with the specified
	 * error code and error message.
	 * 
	 * @param errorCode    the error code representing the specific error condition.
	 * @param errorMessage the detailed error message.
	 */
	public PrimaryKeyValidationException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

	/**
	 * Constructs a new {@code PrimaryKeyValidationException} with the specified
	 * error code, error message, and response.
	 * 
	 * @param errorCode    the error code representing the specific error condition.
	 * @param errorMessage the detailed error message.
	 * @param response     the {@link MainResponseDTO} object containing additional
	 *                     information about the error.
	 */
	public PrimaryKeyValidationException(String errorCode, String message, MainResponseDTO<?> response) {
		super(errorCode, message);
		this.response = response;
	}
}