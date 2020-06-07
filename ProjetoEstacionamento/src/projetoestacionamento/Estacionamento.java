package projetoestacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {
    
    public String placa;
    public String modelo;
    public double hora_entrada;
    public double min_entrada;
    public double hora_saida;
    public double min_saida;
    protected double preco = 4.00;
    
    public double calcula_tempo(double hora_entrada, double min_entrada, double hora_saida, double min_saida) {
        
        double conv_ent = hora_entrada + min_entrada/60;
        double conv_saida = hora_saida + min_saida/60;
        
        double tempo = Math.ceil(conv_saida - conv_ent);
        
        return tempo;
    }
    
    public void gera_nota(double tempo, double preco) {
        
        double converte = tempo * 4;
        
        JOptionPane.showMessageDialog(null, "ESTACIONAMENTO GRR PQ CAIU A LUZ ENQUANTO EU TAVA FAZENDO\n"
                + "Dados do veículo:\n"
                + "Placa: " + this.placa
                + "\nModelo: " + this.modelo
                + "\nHora de Entrada: " + this.hora_entrada + " e " + this.min_entrada 
                + "\nHora de Saída: " + this.hora_saida + " e " + this.min_saida
                + "\nQuantidade de Horas Cheias: " + tempo
                + "\nValor Total: " + converte + " R$");
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(double hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public double getMin_entrada() {
        return min_entrada;
    }

    public void setMin_entrada(double min_entrada) {
        this.min_entrada = min_entrada;
    }

    public double getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(double hora_saida) {
        this.hora_saida = hora_saida;
    }

    public double getMin_saida() {
        return min_saida;
    }

    public void setMin_saida(double min_saida) {
        this.min_saida = min_saida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
}
