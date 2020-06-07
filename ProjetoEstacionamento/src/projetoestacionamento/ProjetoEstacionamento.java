package projetoestacionamento;

import javax.swing.JOptionPane;

public class ProjetoEstacionamento {

    public static void main(String[] args) {
        
        Estacionamento dados = new Estacionamento();
        
        dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do veículo: "));
        dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do veículo: "));
        
        dados.setHora_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada: ")));
        dados.setMin_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de entrada: ")));
        
        dados.setHora_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de saida: ")));
        dados.setMin_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de saída: ")));
        
        double tempo_total = dados.calcula_tempo(dados.getHora_entrada(), dados.getMin_entrada(), dados.getHora_saida(), dados.getMin_saida());
        
      dados.gera_nota(tempo_total, tempo_total);
    }
    
}
