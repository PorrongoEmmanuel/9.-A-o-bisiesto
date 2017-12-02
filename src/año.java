import java.util.Scanner;

public class año {

    public void bisisesto(){
        Scanner i= new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un año: ");
        numero = i.nextInt();

        if(numero % 4 == 0){
            System.out.println("Es bisiesto");
        }
        else{
            System.out.println("No es bisiesto");
        }
    }
}
