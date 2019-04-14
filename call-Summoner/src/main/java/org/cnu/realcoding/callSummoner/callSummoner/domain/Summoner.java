package org.cnu.realcoding.callSummoner.callSummoner.domain;

import lombok.Data;

@Data
public class Summoner {

    private int profileIconID;
    private String name;
    private String puuid;
    private int SummonerLevel;
    private String accountID;
    private String ID;
    private String revisionDate;

    public String getID(){
        return ID;
    }


}
