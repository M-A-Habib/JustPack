package com.justpack.models.requestBodies;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.NonNull;
import lombok.experimental.FieldNameConstants;

@Builder
@FieldNameConstants
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record OpenAiMessages(
        @NonNull String content,
        Object functionCall,
        String name,
        @NonNull String role
) {
}
