package com.tian;

import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;

/**
 * Hello world!
 *
 */
public class TuscanyServer
{
    public static void main( String[] args )
    {
        System.setProperty("java.rmi.server.hostname", "172.31.52.166");
        Node node = NodeFactory.getInstance().createNode("Calculator.composite");
        node.start();
        System.out.println("服务端启动");
    }
}
