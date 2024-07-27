package one.digitalinnovation.gof.dto;

import java.util.List;
import java.util.stream.Collectors;


import one.digitalinnovation.gof.model.Cliente;

public class ClienteDTO {
    private Long id;
    private String nome;
    private EnderecoDTO endereco;

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String nome, EnderecoDTO endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.endereco.setBairro(cliente.getEndereco().getBairro());
        this.endereco.setCep(cliente.getEndereco().getCep());
        this.endereco.setComplemento(cliente.getEndereco().getComplemento());
        this.endereco.setDdd(cliente.getEndereco().getDdd());
        this.endereco.setGia(cliente.getEndereco().getGia());
        this.endereco.setIbge(cliente.getEndereco().getIbge());
        this.endereco.setLocalidade(cliente.getEndereco().getLocalidade());
        this.endereco.setLogradouro(cliente.getEndereco().getLogradouro());
        this.endereco.setSiafi(cliente.getEndereco().getSiafi());
        this.endereco.setUf(cliente.getEndereco().getUf()); 

    }
    public EnderecoDTO getEndereco() {
        return endereco;
    }
    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public static List<ClienteDTO> convert(List<Cliente> clientes) {
        return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());

    }
    
    // outros campos e seus getters e setters

    // Construtores, getters e setters
}

