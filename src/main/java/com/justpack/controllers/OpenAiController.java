package com.justpack.controllers;

import com.justpack.models.requestBodies.GenerateVacationPromptRequestBody;
import com.justpack.services.clients.OpenAiService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@ExecuteOn(TaskExecutors.BLOCKING)
public class OpenAiController {
    private final OpenAiService openAiService;
    @Post("/v1/generate-response")
    public String test(@Body(value = "prompt") String prompt) {
        return openAiService.generateResponse(prompt);
    }

    @Post("/v1/generate-vacation")
    public String generateVacation(@Body GenerateVacationPromptRequestBody requestBody) {
        return openAiService.generateResponse(requestBody.location());
    }
}
