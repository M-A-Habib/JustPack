package com.justpack.models.responseBodies;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Builder
@FieldNameConstants
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record OpenAiCompletionsResponse(
        String id,
        List<OpenAiChoices> choices,
        int created,
        String model,
        String object,
        OpenAiUsage usage
) {
}
