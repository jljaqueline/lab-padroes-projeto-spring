package one.digitalinnovation.gof.factory;

import one.digitalinnovation.gof.dto.ClienteDTO;
import one.digitalinnovation.gof.dto.EnderecoDTO;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

public class ClienteFactory {

    public static Cliente createFromDTO(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getId());
        cliente.setNome(clienteDTO.getNome());
        Endereco endereco = new Endereco();
        endereco.setCep(clienteDTO.getEndereco().getCep());
        endereco.setBairro(clienteDTO.getEndereco().getBairro());
        endereco.setComplemento(clienteDTO.getEndereco().getComplemento());
        endereco.setDdd(clienteDTO.getEndereco().getDdd());
        endereco.setGia(clienteDTO.getEndereco().getGia());
        endereco.setIbge(clienteDTO.getEndereco().getIbge());
        endereco.setLocalidade(clienteDTO.getEndereco().getLocalidade());
        endereco.setLogradouro(clienteDTO.getEndereco().getLogradouro());
        endereco.setSiafi(clienteDTO.getEndereco().getSiafi());
        endereco.setUf(clienteDTO.getEndereco().getUf());
        

        cliente.setEndereco(endereco);
        // configurar outros campos conforme necessário
        return cliente;
    }

    public static ClienteDTO createDTO(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNome(cliente.getNome());
        EnderecoDTO endereco = new EnderecoDTO();
        endereco.setCep(cliente.getEndereco().getCep());
        endereco.setBairro(cliente.getEndereco().getBairro());
        endereco.setComplemento(cliente.getEndereco().getComplemento());
        endereco.setDdd(cliente.getEndereco().getDdd());
        endereco.setGia(cliente.getEndereco().getGia());
        endereco.setIbge(cliente.getEndereco().getIbge());
        endereco.setLocalidade(cliente.getEndereco().getLocalidade());
        endereco.setLogradouro(cliente.getEndereco().getLogradouro());
        endereco.setSiafi(cliente.getEndereco().getSiafi());
        endereco.setUf(cliente.getEndereco().getUf());
        
        clienteDTO.setEndereco(endereco);
        // configurar outros campos conforme necessário
        return clienteDTO;
    }
}
