public record Person(String name, int age) {
    // Record classes can have additional methods and fields
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}