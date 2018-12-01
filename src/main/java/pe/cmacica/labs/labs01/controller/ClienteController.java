package pe.cmacica.labs.labs01.controller;

import pe.cmacica.labs.labs01.services.ClienteService;

public class ClienteController {

    private ClienteService clienteService = new ClienteService();

    public void grabar(){
        clienteService.guardar();
    }
}
