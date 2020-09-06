package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class TestControllerTest {
    @Inject
    @Client("/")
    private HttpClient httpClient;

    /**
     * If you change RequestDto as follows:
     * public class RequestDto {
     *     private final String name;
     *
     *     public RequestDto(String name) {
     *         this.name = name;
     *     }
     *
     *     public String getName() {
     *         return this.name;
     *     }
     * }
     * Then this test will pass
     */
    @Test
    void shouldNotThrowExceptionForJavaRecords() {
        var createListBody = """
                {
                  "name": "Test list"
                }
                """;
        httpClient.toBlocking().exchange(HttpRequest.POST("create", createListBody));
    }
}