package T2.Stream;

public class Demo11Person {
    private String name;

    @Override
    public String toString() {
        return "Demo11Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Demo11Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo11Person(String name) {
        this.name = name;
    }
}
