import java.util.Arrays;
import java.util.Scanner;

public class Triangle extends Polygon implements Comparable<Triangle>{
    private static final Scanner SCANNER=new Scanner(System.in);
    public Triangle() {
        super(3);
    }

    @Override
    public int getPerimeter() {
        return super.getPerimeter();
    }
    public double getArea(){
        int halfOfPerimeter=this.getPerimeter()/2;
        double squareOfArea=halfOfPerimeter;
        int i=0;
        while (i<this.numOfEdges){
            squareOfArea*=(halfOfPerimeter-edges[i]);
            i++;
        }
        return Math.sqrt(squareOfArea);
    }
    public void enterEdge(){
        int i=0;
        while(i<numOfEdges){
            System.out.println("Nhập cạnh thứ "+ (i+1) + " :");
            edges[i]=Integer.parseInt(SCANNER.nextLine());
            i++;
        }
    }
    public boolean checkTriangle(){
        if(((this.edges[0] + this.edges[1]) <= this.edges[2]) ||
                (this.edges[0] + this.edges[2]) <= this.edges[1] ||
                (this.edges[2] + this.edges[1]) <= this.edges[0]){
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "numOfEdges=" + numOfEdges +
                ", edges=" + Arrays.toString(edges) +
                '}';
    }

    @Override
    public int compareTo(Triangle o) {
        return Double.compare(this.getArea(),o.getArea());
    }
}
