package kazakov.gradle.example;

public class App {
    private String id;

    @Override
    public String toString() {
        return "App{" +
                "id='" + id + '\'' +
                '}';
    }

    public static void main(String[] args) {
        App app = new App();
        app.setId("100");
        System.out.println(app);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
