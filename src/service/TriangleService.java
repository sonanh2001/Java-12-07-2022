package service;

import model.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Logger;

import static util.ScannerUtil.SCANNER;

public class TriangleService {
    //private static final Scanner SCANNER=new Scanner(System.in);
    private ArrayList<Triangle> triangles;
    private static TriangleService triangleServiceInstance =new TriangleService();
    private TriangleService(){
        this.triangles =new ArrayList<>();
    }
    public static TriangleService getTriangleServiceInstance(){
        return triangleServiceInstance;
    }
    private static final Logger LOGGER = Logger.getLogger(TriangleService.class.getName());
    private Comparator<Triangle> areaComparator = new Comparator<Triangle>() {
        @Override
        public int compare(Triangle o1, Triangle o2) {
            return Double.compare(o1.getArea(), o2.getArea());
        }
    };
    public void enterTriangle(){
        System.out.println("Nhập số tam giác muốn thêm vào:");
        int numOfTriangle=Integer.parseInt(SCANNER.nextLine());
        int i=0;
        while (i<numOfTriangle){
            Triangle triangle =new Triangle();
            triangle.enterEdge();
            triangles.add(triangle);
            i++;
        }
    }
    public void findBiggestAreaTriangle(){
        System.out.println(Collections.max(triangles,areaComparator));
    }
    public void searchTriangleByIndex(){
        System.out.println("Nhập vị trí tam giác cần tìm: ");
        int index;
        do {
            index = Integer.parseInt(SCANNER.nextLine());
            if(!checkIndex(index)){
                LOGGER.warning("Chỉ mục sai, vui lòng nhập lại");
            }
        } while (!checkIndex(index));
        System.out.println(triangles.get(index - 1));
    }
    private boolean checkIndex(int index) {
        return (index > 0 && index <= triangles.size());
    }
    public void deleteTriangleByIndex(){
        System.out.println("Nhập vị trí tam giác cần xoá: ");
        int index;
        do {
            index = Integer.parseInt(SCANNER.nextLine());
            if(!checkIndex(index)){
                LOGGER.warning("Chỉ mục sai, vui lòng nhập lại");
            }
        } while (!checkIndex(index));
        triangles.remove(index - 1);
    }
    public void sort(){
        Collections.sort(triangles, areaComparator);
    }
    public void printList(){
        System.out.println(triangles);
    }
}
