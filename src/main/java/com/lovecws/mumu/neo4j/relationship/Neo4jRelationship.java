package com.lovecws.mumu.neo4j.relationship;

import com.lovecws.mumu.neo4j.Neo4JConfiguration;
import org.apache.log4j.Logger;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.traversal.TraversalDescription;
import org.neo4j.graphdb.traversal.Traverser;
import org.neo4j.kernel.impl.traversal.MonoDirectionalTraversalDescription;

import java.util.Iterator;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: neo4j 节点之间的关系
 * @date 2017-09-20 16:17
 */
public class Neo4jRelationship {

    private static final Logger log = Logger.getLogger(Neo4jRelationship.class);
    private static final GraphDatabaseService graphDatabaseService = new Neo4JConfiguration().graphDatabaseService();

    public void relationship() {
        Transaction transaction = graphDatabaseService.beginTx();
        try {
            Node node1 = graphDatabaseService.createNode();
            node1.setProperty("name", "歌手 1");
            Node node2 = graphDatabaseService.createNode();
            node2.setProperty("name", "专辑 1");
            node1.createRelationshipTo(node2, RelationshipType.withName("PUBLISH"));
            Node node3 = graphDatabaseService.createNode();
            node3.setProperty("name", "歌曲 1");
            node2.createRelationshipTo(node3, RelationshipType.withName("CONTAIN"));
            transaction.success();
            log.info("节点关系建立成功");
            /*TraversalDescription td = Traversal.description()
                    .relationships(RelationshipType.withName("PUBLISH"))
                    .relationships(RelationshipType.withName("CONTAIN"))
                    .depthFirst()
                    .evaluator(Evaluators.pruneWhereLastRelationshipTypeIs(RelationshipType.withName("CONTAIN")));*/
            TraversalDescription td = new MonoDirectionalTraversalDescription();
            Traverser traverser = td.traverse(node1);
            for (Path path : traverser) {
                Node node = path.endNode();
                System.out.print("{nodeId="+node.getId() + ",name=" + node.getProperty("name")+",relationships:[");
                Iterator<Relationship> iterator = node.getRelationships().iterator();
                while (iterator.hasNext()){
                    Relationship relationship = iterator.next();
                    System.out.print(relationship);
                    if(iterator.hasNext()){
                        System.out.print(",");
                    }
                }
                System.out.println("]}");
            }
        } catch (Exception e) {
            transaction.failure();
            log.error(e);
        }
    }
}
