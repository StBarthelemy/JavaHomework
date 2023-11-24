import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Computer {
    public static void main(String[] args) {

        Set<Computer2> set = new HashSet<>();
        set.add(new Computer2("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new Computer2("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new Computer2("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new Computer2("Notebook 4", 64, "MACOS", 140000, "Macbook"));

        Computer1 operation = new Computer1(set);
        operation.start();

    }
}