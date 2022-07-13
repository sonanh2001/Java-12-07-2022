import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TriangleService {
    private static final Scanner SCANNER=new Scanner(System.in);
    private ArrayList<Triangle> triangles;
    private static TriangleService triangleServiceInstance =new TriangleService();
    private TriangleService(){
        this.triangles =new ArrayList<>();
    }
    public static TriangleService getTriangleServiceInstance(){
        return triangleServiceInstance;
    }
    public void enterTriangle(){
        System.out.println("Nhập số tam giác muốn thêm vào:");
        int numOfTriangle=Integer.parseInt(SCANNER.nextLine());
        int i=0;
        while (i<numOfTriangle){
            Triangle triangle =new Triangle();
            triangle.enterEdge();
            if(triangle.checkTriangle()){
                triangles.add(triangle);
            }
            else {
                System.out.println("Tam giác không hợp lệ");
            }
            i++;
        }
    }
    public void findBiggestAreaTriangle(){
        System.out.println(Collections.max(triangles));
    }
    public void searchTriangleByIndex(){
        System.out.println("Nhập vị trí tam giác cần tìm: ");
        int index=Integer.parseInt(SCANNER.nextLine());
        if(index<0 || index>triangles.size()){
            System.out.println("Chỉ mục không hợp lệ");
        }
        else{
            System.out.println(triangles.get(index-1));
        }
    }
    public void deleteTriangleByIndex(){
        System.out.println("Nhập vị trí tam giác cần xoá: ");
        int index=Integer.parseInt(SCANNER.nextLine());
        if(index<0 || index>triangles.size()){
            System.out.println("Chỉ mục không hợp lệ");
        }
        else{
            triangles.remove(index-1);
        }
    }
    public void sort(){
        Collections.sort(triangles);
    }
    public void printList(){
        System.out.println(triangles);
    }
}
