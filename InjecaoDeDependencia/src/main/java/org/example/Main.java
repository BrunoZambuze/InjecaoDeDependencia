package org.example;

import model.Cliente;
import model.Produto;
import notificacao.NotificacaoEmail;
import notificacao.NotificacaoSMS;
import notificacao.Notificador;
import service.AtivacaoClienteService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Notificador notificador = new NotificacaoEmail();
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);

        Produto produto = new Produto("Guaraná", BigDecimal.TEN);
        Cliente cliente = new Cliente("Bruno", "bruno@hotmail.com", "998372828");

        ativacaoClienteService.ativar(cliente);

    }
}