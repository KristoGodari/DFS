package com.kristogodari.dfs;

public class Application {

    public static void main(String[] args){

        // Create graph vertexes
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexH = new Vertex("H");

        // define each vertex neighbors
        vertexA.addNeighbor(vertexB);
        vertexA.addNeighbor(vertexC);

        vertexB.addNeighbor(vertexC);
        vertexB.addNeighbor(vertexE);

        vertexC.addNeighbor(vertexD);

        vertexD.addNeighbor(vertexH);


        // run depth-first search algorithm
        Dfs bfs = new Dfs();
        bfs.executeDfsStartingWithVertex(vertexA);
    }
}
