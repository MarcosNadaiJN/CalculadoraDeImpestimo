package mapa.pds2.bancowzt;

public class Cliente {
    private static int score = 0;
    private static double renda = 0;
    private static int idade = 0;

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Cliente.score = score;
    }

    public static double getRenda() {
        return renda;
    }

    public static void setRenda(double renda) {
        Cliente.renda = renda;
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        Cliente.idade = idade;
    }
    
    
}
