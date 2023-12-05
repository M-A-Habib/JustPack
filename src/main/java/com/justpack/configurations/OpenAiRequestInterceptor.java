package com.justpack.configurations;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.ClientFilterChain;
import io.micronaut.http.filter.HttpClientFilter;
import org.reactivestreams.Publisher;

@Filter("/v1/chat/completions")
public class OpenAiRequestInterceptor implements HttpClientFilter {
    @Value("${micronaut.http.services.openai.token}")
    private String openAiToken;

    @Override
    public Publisher<? extends HttpResponse<?>> doFilter(MutableHttpRequest<?> request, ClientFilterChain chain) {
//        return chain.proceed(
//                request.mutate().header("Authorization", "Bearer %s".formatted(openAiToken))
        return chain.proceed(request.header("Authorization", openAiToken));
    }
}
