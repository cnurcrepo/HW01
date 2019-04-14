package org.cnu.realcoding.callSummoner.callSummoner.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RiotDataRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertRoitData(String league) {
        this.mongoTemplate.insert(league);
    }
}
