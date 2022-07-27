package ru.badian.findproperty.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;
import ru.badian.findproperty.dto.citiyxpert.Request.CityExpertRq;
import ru.badian.findproperty.dto.citiyxpert.Response.CityExpertRs;

import java.time.OffsetDateTime;

@Configuration
public class WebFluxConfig {
    @Value("${sources.cityExpert.url}")
    private String cityExpertUrl;

    @Bean
    public WebClient cityExpertClient() {
        return WebClient.builder().baseUrl(cityExpertUrl).build();
    }

    @Bean
    public RouterFunction<ServerResponse> echoService() {
        return RouterFunctions
                .route()
                .path(
                        "/echo",
                        builder -> builder.GET("", request -> ServerResponse.ok().body(String.format("Server time is: %s", OffsetDateTime.now())))
                ).build();
    }

    @Bean
    public RouterFunction<ServerResponse> cityExpertRouter() {
        return RouterFunctions
                .route()
                .path(
                        "/city-expert",
                        builder -> builder.POST("", request -> {
                            var rq = request.body(CityExpertRq.class);
                            var rs = cityExpertClient()
                                    .post()
                                    .uri("/Search")
                                    .bodyValue(rq)
                                    .accept(MediaType.APPLICATION_JSON)
                                    .retrieve()
                                    .bodyToMono(CityExpertRs.class);

                            return ServerResponse.ok().body(rs.toFuture());
                        })
                ).build();
    }
}
