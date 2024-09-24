package br.com.santullo;

import java.io.Serial;

/**
 * <h1>ParametrosInvalidosException</h1>
 * <p>
 *     Classe de exceção personalizada para indicar que parâmetros inválidos foram fornecidos.
 * </p>
 *
 * <p>
 *     Esta exceção deve ser lançada sempre que os parâmetros fornecidos a um método ou função não atenderem aos critérios esperados.
 * </p>
 *
 * @since 23/09/2024
 * @author Gabriel Santullo
 * @version 1.0.0
 */
public class ParametrosInvalidosException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException() {

    }

    /**
     * Construtor que aceita uma mensagem de erro.
     *
     * @param msg A mensagem que descreve o erro ocorrido.
     */
    public ParametrosInvalidosException(String msg) {
        super(msg);
    }

    /**
     * Construtor que aceita uma mensagem de erro e uma causa.
     *
     * @param msg A mensagem que descreve o erro ocorrido.
     * @param cause A causa original da exceção.
     */
    public ParametrosInvalidosException(String msg, Throwable cause) {
        super(msg, cause);
    }

    /**
     * Construtor que aceita apenas uma causa.
     *
     * @param cause A causa original da exceção.
     */
    public ParametrosInvalidosException(Throwable cause) {
        super(cause);
    }
}
