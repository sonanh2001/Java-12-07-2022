package model;

import java.util.Arrays;
import java.util.logging.Logger;

import static util.ScannerUtil.SCANNER;

public class Triangle extends Polygon{
    //private static final Scanner SCANNER=new Scanner(System.in);
    private static final int NUM_EDGES_OF_TRIANGLE = 3;
    public Triangle() {
        super(NUM_EDGES_OF_TRIANGLE);
    }
    private final static Logger LOGGER = Logger.getLogger(Triangle.class.getName());
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
        LOGGER.info("Nhập cạnh cho tam giác");
        do {
            for (int i = 0 ; i < NUM_EDGES_OF_TRIANGLE; i++) {
                System.out.println("Nhập cạnh thứ " + (i + 1) + " : ");
                this.edges[i] = Integer.parseInt(SCANNER.nextLine());
            }
            if(!checkTriangle()) {
                LOGGER.warning("Tam giác không hợp lệ, vui lòng nhập lại");
            }
        } while (!checkTriangle());
    }
    private boolean checkTriangle(){
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
}
