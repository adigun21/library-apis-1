package publisher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping( path = "/v1/publisher")
public class PublisherController {

	@GetMapping(path = "/{publisherId}")
	public Publisher getPublisher(@PathVariable String publisherId) {
		return new Publisher(publisherId, "Prentice Hall Publisher", "rentice@email.com", "123-456-789");
}
}
