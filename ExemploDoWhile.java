import java.util.Random;

public class ExemploDoWhile

public static void main(String[] args) {
System.out.println("Discando...");
do {
    //executando repetidamente até alguém atender

}while (tocando());

System.out.println("Telefone tocando");

}while (tocando());

System.out.println("Alo !!! " );

private static boolean tocando() {
boolean atendeu = new Randow().newtInt(3)==1;
System.out.println("Atendeu? " + atendeu);
//negando o ato de continuar tocando 
return ! atendeu;
} 



}