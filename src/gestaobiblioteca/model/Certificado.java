package gestaobiblioteca.model;

import java.time.LocalDateTime;

public class Certificado {
    private long id;
    private Trabalho trabalho;
    private LocalDateTime dataEmissao;
    private String codigoVerificacao;

    public void gerarCodigoVerificacao(){
        
    }
}
