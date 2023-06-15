package javaoracleatividades;

import javax.swing.JOptionPane;

public class JavaOracleAtividade3 {
    public static void main(String[] args) {
     
        String nome = JOptionPane.showInputDialog("Era uma vez um garoto que se chamava...");
        String idade = JOptionPane.showInputDialog("Esse garoto possuia a idade de ...");
        String idade2 = JOptionPane.showInputDialog("Quando deu de cara com um garoto que era ... anos mais velho que ele");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("O garoto perguntou ao garoto mais velho qual era a soma de ..."));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Mais..."));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Mais..."));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Mais..."));
        int num5 = Integer.parseInt(JOptionPane.showInputDialog("Mais..."));
        double num11 = Double.parseDouble(JOptionPane.showInputDialog("O garoto também perguntou quanto seria a soma de..."));
        double num12 = Double.parseDouble(JOptionPane.showInputDialog("Mais"));
        JOptionPane.showMessageDialog(null, "Agradecido pelos resultados, o garoto se despede de seu amigo e vai embora");

        int num6 = num1 + num2 + num3 + num4 + num5;
        double num13= num11 + num12;

        JOptionPane.showMessageDialog(null,"Era uma vez um garoto que se chamava " + nome + " ,Esse garoto possuia a idade de " + idade);
        JOptionPane.showMessageDialog(null, "Quando deu de cara com um garoto que era " + idade2 + " anos mais velho que ele");
        JOptionPane.showMessageDialog(null, "O garoto perguntou ao garoto mais velho qual era a soma de " + num1 + " Mais " + num2 + " Mais " + num3  + " Mais " + num4 + " Mais " + num5 + " O qual resultava em " + num6 );
        JOptionPane.showMessageDialog(null,"O garoto também perguntou quanto seria a soma de " + num11 + " Mais " + num12 + " O qual resultaria em " + num13);
        JOptionPane.showMessageDialog(null, "Agradecido pelos resultados, o garoto se despede de seu amigo e vai embora");
    }
}
