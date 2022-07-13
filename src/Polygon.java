import java.util.ArrayList;
import java.util.Scanner;

public class Polygon {
    protected int numOfEdges;
    protected int[] edges;

    public Polygon() {
        numOfEdges=0;
        edges=new int[numOfEdges];
    }
    public Polygon(int numOfEdges) {
        this.numOfEdges=numOfEdges;
        edges=new int[numOfEdges];
    }
    public int getPerimeter(){
        int perimeter=0;
        int i=0;
        while(i<numOfEdges){
            perimeter+=edges[i];
            i++;
        }
        return perimeter;
    }
    public void printEdges(){
        System.out.println(edges);
    }
}
