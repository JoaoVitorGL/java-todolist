package org.gouveia.to_do_list.exception.exception_details;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@SuperBuilder
public class ValidationExceptionDetails extends ExceptionDetails {
    private final Map<String, String> errors;
}
