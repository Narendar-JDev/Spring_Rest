package in.ineuron.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ineuron.request.PassengerInfo;
import in.ineuron.response.Ticket;

@Service("service")
public class ERailClientApp {

	private static final String REST_END_URL = "http://localhost:9999/SpringRest-TicketBooking-ProviderApp/api/ticket/register";
	
	public void invokeRestApi() {

		WebClient client = WebClient.create();

		PassengerInfo body = new PassengerInfo();
		body.setFirstName("Vivek");
		body.setLastName("Lone");
		body.setJourneyDate("22/10/2026");
		body.setFrom("Mumbai");
		body.setTo("Haridwar");
		body.setTrainNumber("MUM-PUN-1234");

		Ticket response = client.post().uri(REST_END_URL).accept(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(body)).retrieve().bodyToMono(Ticket.class).block();

		
		System.out.println(response);

	}
}
