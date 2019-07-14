package com.tasks.advanced.algorithms.suffixtree;

public class ActivePoint {

    SuffixNode activeNode;
    int activeEdge;
    int activeLength;

    ActivePoint(SuffixNode node) {
        this.activeNode = node;
        this.activeEdge = -1;
        this.activeLength = 0;
    }

    ActivePoint(SuffixNode activeNode, int activeEdge, int activeLength) {
        this.activeNode = activeNode;
        this.activeEdge = activeEdge;
        this.activeLength = activeLength;
    }

    @Override
    public String toString() {
        return "ActivePoint[node=]" + activeNode + ", edge=" + activeEdge + ", length" + activeLength + "]";
    }
}
