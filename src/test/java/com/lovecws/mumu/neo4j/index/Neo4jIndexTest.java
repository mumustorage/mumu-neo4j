package com.lovecws.mumu.neo4j.index;

import org.junit.Test;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: neo4j索引测试
 * @date 2017-09-20 15:52
 */
public class Neo4jIndexTest {

    private static final Neo4jIndex neo4jIndex = new Neo4jIndex();

    @Test
    public void index() {
        neo4jIndex.index();
    }
}
