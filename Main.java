import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows11", 70000, "Acer"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 75000, "Asus"));
        set.add(new Notebook("Notebook 3", 16, "Windows11", 80000, "HP"));
        set.add(new Notebook("Notebook 4", 32, "linux", 85000, "Lenovo"));
        set.add(new Notebook("Notebook 5", 32, "linux", 901000, "Lenovo"));
        set.add(new Notebook("Notebook 6", 64, "Windows10", 90000, "HP"));


        NotebookFilter operation = new NotebookFilter(set);
        operation.start();

    }
}