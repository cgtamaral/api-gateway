package br.pucminas.apigateway.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GatewayController 
{
	
	Logger logger = LoggerFactory.getLogger(GatewayController.class);
	
	
	@Value("${identity.microservice.host}")
	private String identityMicroServiceHost;
	
	@Value("${marketing.microservice.host}")
	private String marketingMicroServiceHost;
	
	@Value("${ordering.microservice.host}")
	private String orderingMicroServiceHost;
	
	@Value("${catalog.microservice.host}")
	private String catalogMicroServiceHost;
	
	@Value("${locations.microservice.host}")
	private String locationsMicroServiceHost;
	
	@Value("${basket.microservice.host}")
	private String basketMicroService;
	
	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
	    return builder.routes()
	        .route(p -> p.path("/v1/public/users").uri(identityMicroServiceHost))
	        .route(p -> p.path("/v1/public/users/{userId}").uri(identityMicroServiceHost))
	        .route(p -> p.path("/v1/public/marketings").uri(marketingMicroServiceHost))
	        .route(p -> p.path("/v1/public/marketings/{marketingId}").uri(marketingMicroServiceHost))
	        .route(p -> p.path("/v1/public/orders").uri(orderingMicroServiceHost))
	        .route(p -> p.path("/v1/public/orders/{orderId}").uri(orderingMicroServiceHost))	        
	        .route(p -> p.path("/v1/public/books").uri(catalogMicroServiceHost))
	        .route(p -> p.path("/v1/public/books/{bookId}").uri(catalogMicroServiceHost))
	        .route(p -> p.path("/v1/public/books/{bookId}/comments").uri(catalogMicroServiceHost))
	        .route(p -> p.path("/v1/public/books/{bookId}/scores").uri(catalogMicroServiceHost))
	        .route(p -> p.path("/v1/public/books/{bookId}/comments/{commentId}").uri(catalogMicroServiceHost))
	        .route(p -> p.path("/v1/public/books/{bookId}/scores/{scoreId}").uri(catalogMicroServiceHost))
	        .route(p -> p.path("/v1/public/locations").uri(locationsMicroServiceHost))
	        .route(p -> p.path("/v1/public/locations/{locationId}").uri(locationsMicroServiceHost))
	        .route(p -> p.path("/v1/public/baskets").uri(basketMicroService))
	        .route(p -> p.path("/v1/public/baskets/{basketId}").uri(basketMicroService))        
	        .build();
	}
}
