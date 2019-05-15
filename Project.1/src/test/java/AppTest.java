public class AppTest {
    public static void main(String[] args) {
        Admin admin = Admin.getInstance();
        Worker worker = Admin.createWorker(workerType.CARPENTER);
        Worker worker2 = Admin.createWorker(workerType.BRICKLAYER);
        Worker worker3 = Admin.createWorker(workerType.TILER);

    }


}
