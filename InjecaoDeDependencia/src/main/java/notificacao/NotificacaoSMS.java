package notificacao;

import model.Cliente;

public class NotificacaoSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("%s foi enviado uma SMS para o telefone %s: %s\n",
                           cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
