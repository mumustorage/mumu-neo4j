package com.lovecws.mumu.neo4j.index;

import com.lovecws.mumu.neo4j.Neo4JConfiguration;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.index.Index;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: neo4j 索引使用
 * @date 2017-09-20 15:48
 */
public class Neo4jIndex {

    private static final GraphDatabaseService graphDatabaseService = new Neo4JConfiguration().graphDatabaseService();

    public void index() {
        GraphDatabaseService graphDatabaseService = new Neo4JConfiguration().graphDatabaseService();
        Transaction transaction = graphDatabaseService.beginTx();
        Index<Node> nodeIndex = graphDatabaseService.index().forNodes("nodes");
        try {
            Node node1 = graphDatabaseService.createNode();
            String name = "歌手 1";
            node1.setProperty("name", name);
            node1.setProperty("gender", "男");
            nodeIndex.add(node1, "name", name);

            Node node2 = graphDatabaseService.createNode();
            String name2 = "歌手 2";
            node2.setProperty("name", name2);
            node2.setProperty("gender", "男女");
            nodeIndex.add(node2, "name", name2);
        } catch (Exception e) {
            e.printStackTrace();
            transaction.failure();
        }
        Object result = nodeIndex
                .get("name", "歌手 2")
                .getSingle()
                .getProperty("gender");
        System.out.println(result);
        transaction.success();
    }
}
