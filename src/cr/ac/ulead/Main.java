package cr.ac.ulead;
import cr.ac.ulead.principal.UIHelper;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException {

            ejecutar();

        }

        private static void ejecutar() throws ParserConfigurationException, TransformerConfigurationException {
            UIHelper ui = new UIHelper();
            Scanner input = new Scanner(System.in);

            int option = 0;
            do {
                ui.showMenu();
                option = input.nextInt();

            } while (option != 3);
    }
}
