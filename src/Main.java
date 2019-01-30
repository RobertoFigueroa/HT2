import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Main {
    
    public static void main(String[] args){
        Calculator calculator = new MyCalculator();
        Stack myPile = new Pile();
        Scanner scan = new Scanner(System.in);
        try{
            File f = new File("Prueba.txt");
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] readLine = line.split(" ");
                for(int i=0;i<readLine.length;i++){
                    try{
                        myPile.push(Integer.parseInt(readLine[i]));
                    }
                    catch (Exception e){
                        int a = myPile.pop();
                        int b = myPile.pop();
                        calculator.calculate()
                    }
                }
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println("Archivo no encontrado!");
        }




    }



}
