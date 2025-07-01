package br.com.alura.java_orientacao_a_objeto.exception;

public class ErroConvertException extends RuntimeException {
    private String mensagem;

    public ErroConvertException(String msg) {
        this.mensagem = msg;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
