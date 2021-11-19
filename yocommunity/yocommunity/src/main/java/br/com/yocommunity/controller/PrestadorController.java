package br.com.yocommunity.controller;

import br.com.yocommunity.model.PrestadorModel;
import br.com.yocommunity.view.PrestadorView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PrestadorController {

    // Ações
    @Autowired
    private PrestadorView acoes;

    //Listar fornecedores
    @CrossOrigin
    @RequestMapping(value = "/prestador", method = RequestMethod.GET)
    public @ResponseBody
    List<PrestadorModel> listar() {
        return acoes.findAll();
    }
    // Cadastrar prestadores de serviço
    @CrossOrigin
    @RequestMapping(value = "/prestador", method = RequestMethod.POST)
    public @ResponseBody
    PrestadorModel cadastrar(@RequestBody PrestadorModel prestador) {
        return acoes.save(prestador);
    }

    // Filtrar prestadores de serviço
    @CrossOrigin
    @RequestMapping(value = "/prestador/{codigo}", method = RequestMethod.GET)
    public @ResponseBody
    PrestadorModel filtrar(@PathVariable Integer codigo) {
        return acoes.findByCodigo(codigo);
    }

    // Deletar prestadores de serviço
    @CrossOrigin
    @RequestMapping(value = "/prestador/7", method = RequestMethod.DELETE)
    public @ResponseBody
    void deletar(@PathVariable Integer codigo) {
        PrestadorModel prestador = filtrar(codigo);
        this.acoes.delete(prestador);
    }

    // Alterar prestadores de serviço
    @CrossOrigin
    @RequestMapping(value = "/prestador", method = RequestMethod.PUT)
    public @ResponseBody
    PrestadorModel alterar(@RequestBody PrestadorModel prestador) {
        return acoes.save(prestador);
    }
}
