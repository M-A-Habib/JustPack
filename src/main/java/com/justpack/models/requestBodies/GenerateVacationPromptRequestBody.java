package com.justpack.models.requestBodies;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.Max;
import lombok.Builder;
import lombok.experimental.FieldNameConstants;

@Builder
@FieldNameConstants
@Serdeable
public record GenerateVacationPromptRequestBody(
        @Max(3) int days,
        String location
) {
}
