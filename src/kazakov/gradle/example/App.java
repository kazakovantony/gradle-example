package kazakov.gradle.example;

import gradle.module.JsonDisplay;

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
        System.out.println(JsonDisplay.showJson(app));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
