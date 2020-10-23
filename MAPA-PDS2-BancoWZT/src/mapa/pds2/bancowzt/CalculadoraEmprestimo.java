package mapa.pds2.bancowzt;

public class CalculadoraEmprestimo {
    private static double ValorEmprestimo = 0;

    public static double getValorEmprestimo() {
        return ValorEmprestimo;
    }

    public static void setValorEmprestimo(double ValorEmprestimo) {
        CalculadoraEmprestimo.ValorEmprestimo = ValorEmprestimo;
    }
    
    
    
    public static double CalculaEmprestimo (){
        if (Cliente.getIdade() >= 18) {
            if (Cliente.getIdade() > 25) {
                if (Cliente.getScore() < 100) {
                    CalculadoraEmprestimo.setValorEmprestimo(0);
                } else if (Cliente.getScore() >= 100 && Cliente.getScore() <= 500) {
                    CalculadoraEmprestimo.setValorEmprestimo(6 * Cliente.getRenda());
                } else if (Cliente.getScore() > 500) {
                    CalculadoraEmprestimo.setValorEmprestimo(12 * Cliente.getRenda());
                }
            } else {
                if (Cliente.getScore() > 300) {
                    if (Cliente.getScore() < 100) {
                        CalculadoraEmprestimo.setValorEmprestimo(0);
                    } else if (Cliente.getScore() >= 100 && Cliente.getScore() <= 500) {
                        CalculadoraEmprestimo.setValorEmprestimo(6 * Cliente.getRenda());
                    } else if (Cliente.getScore() > 500) {
                        CalculadoraEmprestimo.setValorEmprestimo(12 * Cliente.getRenda());
                    }
                } else {
                    CalculadoraEmprestimo.setValorEmprestimo(0);
                }
            }
        } else {
            CalculadoraEmprestimo.setValorEmprestimo(0);
        } return 0;
    } 
}
