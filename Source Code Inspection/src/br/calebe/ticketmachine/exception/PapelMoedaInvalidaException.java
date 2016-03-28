package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    
    public PapelMoedaInvalidaException() {
        super("Papel moeda inserido de forma incorreta, favor tentar novamente");
    }
    
}
