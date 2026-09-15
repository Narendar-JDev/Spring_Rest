package in.nkn.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerDocConfig {

	@Bean
	public OpenAPI createOpenAPI() {
		Contact contact = new Contact()
				.name("narendar")
				.url("http://www.abcd/company")
				.email("narendarkumar-v@adityabirlacapital.com");

		return new OpenAPI()
				.info(new Info()
						.title("TouristInfo")
						.description("Gives information about tourist activities")
						.version("3.4.RELEASE")
						.contact(contact)
						.license(new License()
								.name("GNU PUBLIC")
								.url("http://apache.org/license/guru")));
	}

}