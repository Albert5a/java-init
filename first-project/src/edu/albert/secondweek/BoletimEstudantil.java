package edu.albert.secondweek;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("MEDIA");
        else
            System.out.println("APROVADO");

    }
}
