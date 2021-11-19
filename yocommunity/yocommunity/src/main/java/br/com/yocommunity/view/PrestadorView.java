package br.com.yocommunity.view;


import br.com.yocommunity.model.PrestadorModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrestadorView extends CrudRepository<PrestadorModel, Integer> {

    List<PrestadorModel> findAll();

    PrestadorModel findByCodigo(int codigo);

    void delete(PrestadorModel prestador);

    <PrestadorMod extends PrestadorModel> PrestadorMod save(PrestadorMod prestador);
}
