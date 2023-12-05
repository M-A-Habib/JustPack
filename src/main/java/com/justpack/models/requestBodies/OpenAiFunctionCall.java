package com.justpack.models.requestBodies;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.experimental.FieldNameConstants;

@Builder
@FieldNameConstants
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record OpenAiFunctionCall(
        String arguments,
        String name
) {
}
