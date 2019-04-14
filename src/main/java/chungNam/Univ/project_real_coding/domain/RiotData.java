package chungNam.Univ.project_real_coding.domain;

import lombok.Data;

@Data
public class RiotData {
    private String id;
    private LeagueData leagueData;

    @Data
    public static class LeagueData {
        private String date;
        private double dps;
    }
}
