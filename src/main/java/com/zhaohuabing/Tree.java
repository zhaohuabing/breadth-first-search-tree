package com.zhaohuabing;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  Node root;

  public Tree(Node root) {
    this.root = root;
  }

  public List<Node> breadthFirstSearch() {
    List<Node> result = new ArrayList<Node>();
    List<Node> temp = new ArrayList<Node>();
    temp.add(root);
    while (temp.size() > 0) {
      Node currentNode = temp.get(0);
      temp.addAll(currentNode.getChildren());
      temp.remove(0);
      result.add(currentNode);
    }

    return result;
  }
}

class Node {
  String name;
  List<Node> children = new ArrayList<Node>();

  public Node(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void addChild(Node child) {
    children.add(child);
  }

  public List<Node> getChildren() {
    return children;
  }

  public String toString(){
	  return this.name;
  }
}
