package com.company.YandexTasks.Trees;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BinaryTree {

    Node root;

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create() ;

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(8);
        binaryTree.insert(4);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(10);
        binaryTree.insert(6);
        binaryTree.insert(7);

       System.out.println(binaryTreeToJson(binaryTree));
     }

    public static String binaryTreeToJson(BinaryTree binaryTree) {
        String json = GSON.toJson(binaryTree);
        return json;
    }

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public void insert(int value)
    {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

 }