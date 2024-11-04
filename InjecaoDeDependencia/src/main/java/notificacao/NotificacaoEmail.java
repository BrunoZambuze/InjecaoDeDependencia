package notificacao;

import model.Cliente;

public class NotificacaoEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("%s foi enviado uma mensagem para o email %s: %s\n",
                           cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
