package springboot;

public class ValueExampleObject {
    private String name;
    private String role;

    public ValueExampleObject(String name, String role){
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
