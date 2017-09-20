package com.lovecws.mumu.neo4j;

import org.junit.Ignore;
import org.junit.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: neo4j测试
 * @date 2017-09-20 15:43
 */
public class Neo4JConfigurationTest {

    private static Neo4JConfiguration neo4JConfiguration = new Neo4JConfiguration();

    @Test
    public void graphDatabaseService() {
        GraphDatabaseService graphDatabaseService = neo4JConfiguration.graphDatabaseService();
        System.out.println(graphDatabaseService);

        Transaction transaction = graphDatabaseService.beginTx();
        System.out.println(graphDatabaseService.getAllNodes());
        transaction.success();
    }

    @Test
    @Ignore
    public void graphHADatabaseService() {
        GraphDatabaseService graphDatabaseService = neo4JConfiguration.graphHADatabaseService();
        System.out.println(graphDatabaseService);

        Transaction transaction = graphDatabaseService.beginTx();
        System.out.println(graphDatabaseService.getAllNodes());
        transaction.success();
    }
}
