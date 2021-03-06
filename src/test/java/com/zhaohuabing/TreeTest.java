package com.zhaohuabing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Test;

public class TreeTest {
  /** Rigorous Test :-) */
  @Test
  public void testBFS() {
    Tree tree = this.constructTree();
    List<Node> result = tree.breadthFirstSearch();
    System.out.println(result);
    assertEquals(result.get(0).getName(), "A");
    assertEquals(result.get(1).getName(), "B");
    assertEquals(result.get(2).getName(), "C");
    assertEquals(result.get(3).getName(), "D");
    assertEquals(result.get(4).getName(), "E");
    assertEquals(result.get(5).getName(), "F");
    assertEquals(result.get(6).getName(), "G");
    assertEquals(result.get(7).getName(), "H");
    assertEquals(result.get(8).getName(), "I");
  }

  @Test
  public void testNode() {
    Node root = new Node("Root");
    root.addChild(new Node("Child1"));
    root.addChild(new Node("Child2"));
    root.addChild(new Node("Child3"));

    List<Node> children = root.getChildren();
    assertEquals(children.size(), 3);

    assertEquals(children.get(0).getName(), "Child1");
    assertEquals(children.get(1).getName(), "Child2");
    assertEquals(children.get(2).getName(), "Child3");
  }

  /**
   * Create a tree for testing
   *           A
   *          /|\
   *         / | \
   *        B  C  D
   *          /\   \
   *         /  \   \
   *        E    F   G
   *                 /\
   *                /  \
   *               H    I
   *
   */
  private Tree constructTree() {
    // root
    Node a = new Node("A");
    // level 1
    Node b = new Node("B");
    Node c = new Node("C");
    Node d = new Node("D");
    a.addChild(b);
    a.addChild(c);
    a.addChild(d);

    // level 2
    Node e = new Node("E");
    Node f = new Node("F");
    Node g = new Node("G");
    c.addChild(e);
    c.addChild(f);
    d.addChild(g);

    // level 3
    Node h = new Node("H");
    Node i = new Node("I");
    g.addChild(h);
    g.addChild(i);

    return new Tree(a);
  }
}
