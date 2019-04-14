package chungNam.Univ.project_real_coding.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenRiotApiClient {

    @Autowired
    private RestTemplate restTemplate;
    private String requestURL = "https://api";
}
