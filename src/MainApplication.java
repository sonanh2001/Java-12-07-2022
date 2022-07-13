public class MainApplication {
    public static void main(String[] args) {
        TriangleService triangleService=TriangleService.getTriangleServiceInstance();
        triangleService.enterTriangle();
        triangleService.printList();
        triangleService.findBiggestAreaTriangle();
        triangleService.searchTriangleByIndex();
        triangleService.deleteTriangleByIndex();
        triangleService.printList();
        triangleService.sort();
        triangleService.printList();
    }
}
