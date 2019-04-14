package org.cnu.realcoding.callSummoner.callSummoner.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.cnu.realcoding.callSummoner.callSummoner.domain.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class SummonerApiClient {

    @Autowired
    private RestTemplate restTemplate;

    private final String requestID_URL = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={API_KEY}";
    private final String requestLeague_URL = "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{excryptedID}?api_key={API_KEY}";

    public String getSummonerIDByName(String summonerName) {
        ObjectMapper mapper = new ObjectMapper();

        Summoner summoner = null;
        try {
            summoner = mapper.readValue(restTemplate.exchange(requestID_URL, HttpMethod.GET, null, String.class, summonerName, "RGAPI-5d4b2d79-dc92-42a3-9b8c-b740bc49b9da").getBody(), Summoner.class);
        }
        catch(IOException e){
            System.out.println(e);
        }

        return summoner.getID();
    }

    public String getLeagueInfoByID(String encryptedID){
        return restTemplate.exchange(requestLeague_URL, HttpMethod.GET, null, String.class, encryptedID, "RGAPI-5d4b2d79-dc92-42a3-9b8c-b740bc49b9da").getBody();
    }
}
