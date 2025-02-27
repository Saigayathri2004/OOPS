// CPU class with inner and static nested classes
class Cpu {
    private final int price; // Step 1: Declare price as private final variable

    // Constructor to initialize price
    public Cpu(int price) {
        this.price = price;
    }

    // Non-static inner class Processor
    class Processor {
        int core;
        String name;

        // Constructor to initialize core and name
        Processor(int core, String name) {
            this.core = core;
            this.name = name;
        }

        // Method to display details
        void display() {
            System.out.println("CPU Price: " + price);
            System.out.println("Processor Cores: " + core);
            System.out.println("Processor Manufacturer: " + name);
        }
    }

    // Static nested class Ram
    static class Ram {
        int size;
        String name;

        // Constructor to initialize size and name
        Ram(int size, String name) {
            this.size = size;
            this.name = name;
        }

        // Method to display details
        void display() {
            System.out.println("RAM Size: " + size + "GB");
            System.out.println("RAM Manufacturer: " + name);
        }
    }
}

// Main class
public class Innerclass {
    public static void main(String[] args) {
        // Step 4a: Create an instance of Cpu
        Cpu c = new Cpu(70000);

        // Step 4b: Create an instance of Processor using Cpu instance
        Cpu.Processor p = c.new Processor(16, "Intel");

        // Step 4c: Call display method on Processor instance
        p.display();

        // Step 4d: Create an instance of static nested class Ram
        Cpu.Ram r = new Cpu.Ram(16, "Adata");

        // Step 4e: Call display method on Ram instance
        r.display();
    }
}
