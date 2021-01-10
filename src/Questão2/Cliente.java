package Questão2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente extends Pessoa{

    //atributos 
    private long codigo;

    //construtor
    public Cliente(String nome, LocalDate dataNascimento, long codigo){
        super(nome, dataNascimento);
        this.codigo = codigo;
    }
    
    //metodos
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        String cliente;
            cliente = this.getNome() +", ";
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            cliente += formatador.format(super.getDataNascimento()) + ", ";
            cliente += this.codigo;
        return cliente;
    }

    @Override
    public boolean equals(Object obj) {
        boolean clienteIgual = false;
        if (obj instanceof Cliente){
        Cliente cliente2 = (Cliente) obj;
        if (cliente2.getNome() == this.getNome() 
                && cliente2.getDataNascimento().equals(this.getDataNascimento())
                    && cliente2.getCodigo() == this.codigo){
                        clienteIgual = true;
                    }
                }
        return clienteIgual;
    }
    
    
}
