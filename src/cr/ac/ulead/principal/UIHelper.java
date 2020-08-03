package cr.ac.ulead.principal;
import java.io.PrintStream;
import java.util.Scanner;

public class UIHelper {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void showMenu() {
        output.println("Lead University");
        output.println("Profesor: Mario Agüero");
        output.println("Tarea corta Programada #4");
        output.println("Que desea ingresar?");
        output.println("1. Leer personas desde archivo");
        output.println("2. Insertar una persona");
        output.println("3. Imprimir un árbol en IN-ORDER");
        output.println("4. Imprimir un árbol en PRE-ORDER");
        output.println("5. Imprimir un árbol en POST-ORDER");
        output.println("6. Salir");
    }

    public void wrongOption() {
        output.println("Opcion incorrecta!");
    }

}

