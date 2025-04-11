package constructors;

class javacons {
    String name;
    int age;

    // Constructor
    javacons(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        javacons p1 = new javacons("Alice", 25);
        p1.display();
    }
}
