package com.company.YandexTasks;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.LinkedList;


class SimpleThree<T extends Comparable<T>> {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create() ;

    public static void main(String[] args) {
        SimpleThree<Integer> tree = new SimpleThree<>();
        tree.append(5);
        tree.append(1);
        tree.append(4);
        tree.append(2);
        tree.append(3);
        String json = GSON.toJson(tree);
        System.out.println(json);

//        for ( int i: tree.toList() )
//            System.out.println(i);
    }

    private class Node {
        final T value;
        Node left;
        Node right;

        public Node(T val) {
            value = val;
            left = null;
            right = null;
        }
    }

    private Node root;

    private Node appendNode(Node rootNode, T val) {
        if ( rootNode == null )
            return new Node(val);
        else {
            int cmp = rootNode.value.compareTo(val);
            if ( cmp > 0 )
                rootNode.left = appendNode(rootNode.left, val);
            else if ( cmp < 0 )
                rootNode.right = appendNode(rootNode.right, val);
        }
        return rootNode;
    }

    private void nodesToList(List<T> list, Node rootNode) {
        if ( rootNode != null ) {
            nodesToList(list, rootNode.left);
            list.add(rootNode.value);
            nodesToList(list, rootNode.right);
        }
    }

    public SimpleThree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void append(T val) {
        root = appendNode(root, val);
    }

    public List<T> toList() {
        List<T> list = new LinkedList<>();
        nodesToList(list, root);
        return list;
    }


}