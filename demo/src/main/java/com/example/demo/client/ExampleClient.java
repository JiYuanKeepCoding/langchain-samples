import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ExampleClient {

    public String getContent() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://10.112.01.10", String.class);
        return responseEntity.getBody();
    }

}
