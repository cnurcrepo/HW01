package org.cnu.realcoding.callSummoner.callSummoner.service;

import org.cnu.realcoding.callSummoner.callSummoner.api.SummonerApiClient;
import org.cnu.realcoding.callSummoner.callSummoner.repository.RiotDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiotService {

    @Autowired
    private RiotDataRepository riotDataRepository;
    @Autowired
    private SummonerApiClient summonerApiClient;

    public void insertDataInMongoDB(String nameOfSummoner) {
        String idOfSummoner = summonerApiClient.getLeague(nameOfSummoner).getID();
        String leagueOfGammer = this.summonerApiClient.getLeagueInfoByID(idOfSummoner);
        riotDataRepository.insertRoitData(leagueOfGammer);
    }
}