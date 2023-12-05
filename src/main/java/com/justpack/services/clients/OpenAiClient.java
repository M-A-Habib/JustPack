package com.justpack.services.clients;

import com.justpack.models.requestBodies.OpenAiCompletions;
import com.justpack.models.responseBodies.OpenAiCompletionsResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(id = "openai")
public interface OpenAiClient {
    @Post(value = ClientResources.OpenAi.POST_GENERATE_RESPONSE, consumes = MediaType.APPLICATION_JSON)
    OpenAiCompletionsResponse generateResponse(
            @Body OpenAiCompletions requestBody
    );
}
