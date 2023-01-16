package kr.co.auction.lmoextradcconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("kr.co.auction.lmoextradcconsumer.controller"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(
                        new ApiInfoBuilder()
                                .title("LMO extra-dc consumer Swagger")
                                .description("apis")
                                .version("1.0")
                                .build()
                );
    }
}
