public class AppTest {
    public static void main(String[] args) {
        Admin admin = Admin.getInstance();
        Worker worker = createWorker(workerType.CARPENTER);
        Worker worker = createWorker(workerType.BRICKLAYER);
        Worker worker = createWorker(workerType.TILER);
    }


}
