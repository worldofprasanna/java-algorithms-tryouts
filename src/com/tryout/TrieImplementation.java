package com.tryout;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrieImplementation {

    public static void main(String[] args) {
        TrieNode head = new TrieNode();
        head.addString("ANS");
        head.addString("ANOTHER");
        head.addString("BASIC");
        head.addString("ANOTT");
        head.print();
    }

}

class TrieNode {
    List<TrieNode> children = new ArrayList<>();
    boolean isEndNode;
    Character value;

    public boolean search(String str) {
//         YET TO BE IMPLEMENTED
        return false;
    }

    public TrieNode(Character ch) {
        this.value = ch;
    }

    public void addString(String str) {
        if (str.length() > 0){
            Character val = str.charAt(0);
            List<TrieNode> matchNode = this.children.stream().filter(n -> n.value == val).collect(Collectors.toList());
            if (matchNode.size() == 0) {
                TrieNode node = new TrieNode(str.charAt(0));
                this.children.add(node);
                node.addString(str.substring(1));
            } else {
                matchNode.get(0).addString(str.substring(1));
            }
        }else {
           markAsEnd();
        }
    }

    public void markAsEnd() {
        this.isEndNode = true;
    }

    public TrieNode() {
    }

    public void print() {
        System.out.println(this.value);
        if (this.isEndNode)
            System.out.println("String Ends here --------->>>>");
        this.children.forEach(TrieNode::print);
    }
}
