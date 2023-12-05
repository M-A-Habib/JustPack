package com.justpack.models.requestBodies;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.NonNull;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Builder
@FieldNameConstants
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record OpenAiCompletions(
        @Nonnull String model,
        @NonNull List<OpenAiMessages> messages,
        Integer frequencyPenalty,
        Object functionCall,
        boolean stream
) {
}
