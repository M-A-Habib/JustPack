package com.justpack.models.responseBodies;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.justpack.models.requestBodies.OpenAiMessages;
import lombok.Builder;
import lombok.experimental.FieldNameConstants;

@Builder
@FieldNameConstants
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record OpenAiChoices(
        String finishReason,
        int index,
        OpenAiMessages message
) {
}
