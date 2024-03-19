package com.justpack.services.impls;

import com.justpack.models.requestBodies.OpenAiCompletions;
import com.justpack.models.requestBodies.OpenAiMessages;
import com.justpack.models.responseBodies.OpenAiCompletionsResponse;
import com.justpack.services.clients.OpenAiClient;
import com.justpack.services.clients.OpenAiService;
import jakarta.inject.Named;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Named
public class OpenAiServiceImpl implements OpenAiService {
    private final OpenAiClient openAIClient;
    @Override
    public String generateResponse(String prompt){
        OpenAiCompletions requestBody =
                OpenAiCompletions.builder()
                        .model("gpt-3.5-turbo")
                        .messages(
                                List.of(
                                        OpenAiMessages.builder()
                                                .content(prompt)
                                                .role("system")
                                                .build()
                                )
                        )
                        .stream(false)
                        .build();
        OpenAiCompletionsResponse response = openAIClient.generateResponse(
                requestBody
        );

        List<String> something = Arrays.stream(response.choices().get(0).message().content().split("\n")).filter(item -> !item.isEmpty()).toList();

        return response.choices().get(0).message().content();
    }
}
