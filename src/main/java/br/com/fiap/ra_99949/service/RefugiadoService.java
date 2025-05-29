package br.com.fiap.ra_99949.service;

import br.com.fiap.ra_99949.dto.RefugiadoDTO;
import br.com.fiap.ra_99949.entity.Abrigo;
import br.com.fiap.ra_99949.entity.Refugiado;
import br.com.fiap.ra_99949.repository.AbrigoRepository;
import br.com.fiap.ra_99949.repository.RefugiadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class RefugiadoService {

    @Autowired
    private RefugiadoRepository refugiadoRepository;

    @Autowired
    private AbrigoRepository abrigoRepository;

    public Refugiado salvar(RefugiadoDTO dto) {
        Refugiado r = new Refugiado();
        r.setNome(dto.getNome());
        r.setIdade(dto.getIdade());
        r.setNacionalidade(dto.getNacionalidade());
        r.setSituacao(dto.getSituacao());
        Abrigo abrigo = abrigoRepository.findById(dto.getAbrigoId()).orElse(null);
        r.setAbrigo(abrigo);
        r.setDataRegistro(LocalDate.now().toString());
        return refugiadoRepository.save(r);
    }

    public List<Refugiado> listarTodos() {
        return refugiadoRepository.findAll();
    }

    public Optional<Refugiado> listarPorId(Long id) {
        return refugiadoRepository.findById(id);
    }

    public void deletar(Long id) {
        refugiadoRepository.deleteById(id);
    }

    public Refugiado atualizar(Long id, RefugiadoDTO dto) {
        Refugiado r = refugiadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Refugiado não encontrado"));
        r.setNome(dto.getNome());
        r.setIdade(dto.getIdade());
        r.setNacionalidade(dto.getNacionalidade());
        r.setSituacao(dto.getSituacao());
        Abrigo abrigo = abrigoRepository.findById(dto.getAbrigoId()).orElse(null);
        r.setAbrigo(abrigo);
        return refugiadoRepository.save(r);
    }
}
