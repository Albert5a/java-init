package edu.albert.firstweek;
public class Variables {
    public static void main(String[] args) {
        String firstName = "Albert";
        String lastName = "2023";

        String completeName = completeName(firstName, lastName);
        System.out.println(completeName);
    }

    public static String completeName(String firstName, String lastName) {
        return "Resultado do método: " + firstName.concat(" ").concat(lastName);
    }
}
