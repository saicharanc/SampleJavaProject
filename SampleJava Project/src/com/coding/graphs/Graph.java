package com.coding.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

	private HashMap<Integer, Node> nodelookup = new HashMap<Integer, Node>();
	
	public static class Node{
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		private Node(int id) {
			this.id = id;
		}
	}
	
	private Node getNode(int id){
		return null;
	}
	
	
	public void addEdge(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);
	}
	
	public boolean hasPathDFS(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s, d, visited);
	}

	/**
	 * Depth First Search Algorithm - DFS
	 * @param source
	 * @param destination
	 * @param visited
	 * @return
	 */
	private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
		if(visited.contains(source.id)){
			return false;
		}
		visited.add(source.id);
		
		if(source == destination){
			return true;
		}
		
		for (Node child : source.adjacent) {
			if(hasPathDFS(child, destination, visited));
			return true;
		}
		return false;
	}
	
	
	public boolean hasPathBFS(int source, int destination){
		return hasPathBFS(getNode(source), getNode(destination));
	}
	
	/**
	 * Breadth-First Search Algorithm - BFS
	 * @param source
	 * @param destination
	 * @return
	 */
	
	private boolean hasPathBFS(Node source, Node destination){
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		nextToVisit.add(source);
		while(!nextToVisit.isEmpty()){
			Node node = nextToVisit.remove();
			if(node == destination){
				return true;
			}
			if (visited.contains(node.id)){
				continue;
			}
			visited.add(node.id);
			
			for (Node child : node.adjacent) {
				nextToVisit.add(child);
			}
		}
		return false;
	}
}
