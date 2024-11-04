package notificacao;

import model.Cliente;

public interface Notificador {

    void notificar(Cliente cLiente, String mensagem);

}
