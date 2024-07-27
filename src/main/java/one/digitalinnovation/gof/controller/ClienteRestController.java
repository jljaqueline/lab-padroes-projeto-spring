package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import one.digitalinnovation.gof.dto.ClienteDTO;
import one.digitalinnovation.gof.factory.ClienteFactory;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.model.Cliente;

/**
 * Esse {@link RestController} representa nossa <b>Facade</b>, pois abstrai toda
 * a complexidade de integrações (Banco de Dados H2 e API do ViaCEP) em uma
 * interface simples e coesa (API REST).
 * 
 * @author falvojr
 */
@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<ClienteDTO>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> inserir(@RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = ClienteFactory.createFromDTO(clienteDTO);
        clienteService.inserir(cliente);
        return ResponseEntity.ok(clienteDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> atualizar(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = ClienteFactory.createFromDTO(clienteDTO);
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(clienteDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
