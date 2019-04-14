package org.cnu.realcoding.callSummoner.callSummoner.controller;

import org.cnu.realcoding.callSummoner.callSummoner.api.SummonerApiClient;
import org.cnu.realcoding.callSummoner.callSummoner.domain.League;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private SummonerApiClient summonerService;

    @GetMapping("/Name/{name}")
    public String getLeagueInfoByName(@PathVariable String name) {
//        return summonerService.getLeagueInfoByID(summonerService.getSummonerIDByName(name));
        return summonerService.getSummonerIDByName(name);
    }

    // postman에서 테스트 완료.

}
