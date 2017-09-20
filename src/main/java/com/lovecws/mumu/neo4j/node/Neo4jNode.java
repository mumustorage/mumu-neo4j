package com.lovecws.mumu.neo4j.node;

import com.lovecws.mumu.neo4j.Neo4JConfiguration;
import org.apache.log4j.Logger;
import org.neo4j.graphdb.*;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: neo4j 节点创建
 * @date 2017-09-20 15:58
 */
public class Neo4jNode {

    private static final Logger log = Logger.getLogger(Neo4jNode.class);
    private static final GraphDatabaseService graphDatabaseService = new Neo4JConfiguration().graphDatabaseService();

    /**
     * 创建节点
     */
    public void create() {
        Transaction transaction = graphDatabaseService.beginTx();
        try {
            Node node = graphDatabaseService.createNode(Label.label("babmm"));
            node.setProperty("name", "ganliang");
            node.setProperty("sex", "男");
            node.setProperty("age", "26");
            node.setProperty("lover", "cws");
            transaction.success();
            log.info("节点添加成功:"+node);
        } catch (Exception e) {
            transaction.failure();
            log.error(e);
        }
    }

    /**
     * 获取图数据库的所有的节点
     */
    public void getAllNodes() {
        Transaction transaction = graphDatabaseService.beginTx();
        try {
            ResourceIterable<Node> allNodes = graphDatabaseService.getAllNodes();
            ResourceIterator<Node> iterator = allNodes.iterator();
            while (iterator.hasNext()) {
                Node node = iterator.next();
                log.info("节点信息:"+node);
            }
            transaction.success();
        } catch (Exception e) {
            transaction.failure();
            log.error(e);
        }
    }

    /**
     * 获取到节点详情
     *
     * @param nodeId 节点id
     */
    public Node getNodeById(long nodeId) {
        Transaction transaction = graphDatabaseService.beginTx();
        try {
            Node node = graphDatabaseService.getNodeById(nodeId);
            transaction.success();
            log.info("节点信息:" + node);
            return node;
        } catch (Exception e) {
            transaction.failure();
            log.error(e);
        }
        return null;
    }
}
