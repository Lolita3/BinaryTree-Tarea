package cr.ac.ulead.principal;
import cr.ac.ulead.Tree;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;


public class Logic {
    Tree theTree = new Tree();

    private Scanner ingresar =new Scanner(System.in);




    public void cargarDatos() throws IOException {
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("C:\\Users\\lolit\\TareaProgramada4.csv"));
            while (fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                String[] data = currentLine.split(",");
                Persona newPersona = new Persona();
                newPersona.setNombre(data[0]);
                newPersona.setApellido(data[1]);
                newPersona.setFechaNac(LocalDate.parse(data[2]));
                newPersona.setCedula(data[3]);
                theTree.insert(newPersona);

            }
            fileReader.close();
        } catch (FileNotFoundException e) {
        }
    }
   public void LeerPersona(){
       ingresar.nextLine();
       Persona newPersona = new Persona();
       newPersona.setNombre(ingresar.nextLine());
       newPersona.setApellido(ingresar.nextLine());
       newPersona.setFechaNac(LocalDate.parse(ingresar.nextLine()));
       newPersona.setCedula(ingresar.nextLine());
       theTree.insert(newPersona);
   }
}
