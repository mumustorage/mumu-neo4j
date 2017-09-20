package com.lovecws.mumu.neo4j;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.factory.HighlyAvailableGraphDatabaseFactory;

import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: Neo4J配置
 * @date 2017-09-20 15:01
 */
public class Neo4JConfiguration {

    private static String NEO4J_DIR = "/tmp/neo4j";
    private static String NEO4J_HA_DIR = "/tmp/haneo4j";

    public static final Lock lock = new ReentrantLock();

    /**
     * 开启内嵌neo4j服务
     *
     * @return
     */
    public GraphDatabaseService graphDatabaseService() {
        File neo4jDir = new File(NEO4J_DIR+System.currentTimeMillis());
        if (!neo4jDir.exists()) {
            neo4jDir.mkdirs();
        }
        GraphDatabaseService graphDatabaseService = new GraphDatabaseFactory().newEmbeddedDatabase(neo4jDir);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                //当jvm退出时 正常退出neo4j图数据库
                graphDatabaseService.shutdown();
            }
        }));
        return graphDatabaseService;
    }

    /**
     * 开启内嵌高可用neo4j服务
     *
     * @return
     */
    public GraphDatabaseService graphHADatabaseService() {
        File haNeo4jDir = new File(NEO4J_HA_DIR);
        if (!haNeo4jDir.exists()) {
            haNeo4jDir.mkdirs();
        }
        GraphDatabaseService graphDatabaseService = new HighlyAvailableGraphDatabaseFactory()
                .newEmbeddedDatabaseBuilder(haNeo4jDir)
                //.loadPropertiesFromFile("clusters.xml")
                .newGraphDatabase();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                //当jvm退出时 正常退出neo4j图数据库
                graphDatabaseService.shutdown();
            }
        }));
        return graphDatabaseService;
    }
}
