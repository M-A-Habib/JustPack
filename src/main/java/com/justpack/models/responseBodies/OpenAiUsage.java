package com.justpack.models.responseBodies;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.experimental.FieldNameConstants;

@Builder
@FieldNameConstants
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record OpenAiUsage(
        int completionTokens,
        int promptTokens,
        int totalTokens
) {
}
