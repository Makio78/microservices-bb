package br.com.gerenciar.colaborador.service;

import br.com.gerenciar.colaborador.dto.GerenciarColaboradorDto;
import br.com.gerenciar.colaborador.model.GerenciarColaborador;
import br.com.gerenciar.colaborador.repository.GerenciarColaboradorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class GerenciarControladorService {

    @Autowired
    private GerenciarColaboradorRepository repository;

    @Autowired
    private ModelMapper modelMapper;


    /**
     * Retornar todos as colaboradores cadastradas no Banco de dados com paginação
     * @param paginacao
     * @return
     */
    public Page<GerenciarColaboradorDto> obterTodos(Pageable paginacao) {
        return repository
                .findAll(paginacao)
                .map(p -> modelMapper.map(p, GerenciarColaboradorDto.class));
    }


    /**
     * Retornar as trilhas cadastradas no Banco de dados por id
     * @param id
     * @return
     */
    public GerenciarColaboradorDto obterPorId(Long id) {
        GerenciarColaborador gerenciar = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());

        return modelMapper.map(gerenciar, GerenciarColaboradorDto.class);
    }

    /**
     * Atualizar a trilha no Banco de dados
     * @param id
     * @param dto
     * @return
     */
    public GerenciarColaboradorDto atualizarTrilha(Long id, GerenciarColaboradorDto dto) {
        GerenciarColaborador gerenciar = modelMapper.map(dto, GerenciarColaborador.class);
        gerenciar.setId(id);
        gerenciar = repository.save(gerenciar);
        return modelMapper.map(gerenciar, GerenciarColaboradorDto.class);
    }


}
