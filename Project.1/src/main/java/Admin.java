public class Admin {

    private static Admin instance;

    private String name;
    private String surname;
    private int age;
    private int number;

    private Admin() {
    }

    public static Admin getInstance(){
        if (instance == null){
            instance = new Admin();
        }
        return instance;
    }

    Worker createWorker (workerType type){

        Worker worker = null;

        switch(type){
            case TILER:
                Tiler tiler = new Tiler();
                worker = tiler;
                break;
            case CARPENTER:
                Carpenter carpenter = new Carpenter();
                worker = carpenter;
                break;
            case BRICKLAYER:
                BrickLayer brickLayer = new BrickLayer();
                worker = brickLayer;
                break;
        }
        return worker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
