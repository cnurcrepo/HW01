package org.cnu.realcoding.callSummoner.callSummoner.controller;

import org.cnu.realcoding.callSummoner.callSummoner.api.SummonerApiClient;
import org.cnu.realcoding.callSummoner.callSummoner.service.RiotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private SummonerApiClient summonerService;
    @Autowired
    private RiotService riotService;

    @GetMapping("/Name/{name}")
    public String getLeagueInfoByName(@PathVariable String name) {
        this.insertDataToDB(name);
        return summonerService.getLeagueInfoByID(summonerService.getLeague(name).getID());
    }

    private void insertDataToDB(String name) {
        this.riotService.insertDataInMongoDB(name);
    }

}
