package com.lovecws.mumu.neo4j.node;

import org.junit.Test;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: neo4j节点测试
 * @date 2017-09-20 16:05
 */
public class Neo4jNodeTest {

    private Neo4jNode neo4jNode = new Neo4jNode();

    @Test
    public void create() {
        neo4jNode.create();
        neo4jNode.getAllNodes();
    }

    @Test
    public void getAllNodes() {
        neo4jNode.getAllNodes();
    }

    @Test
    public void getNodeById() {
        neo4jNode.getNodeById(8l);
    }
}
