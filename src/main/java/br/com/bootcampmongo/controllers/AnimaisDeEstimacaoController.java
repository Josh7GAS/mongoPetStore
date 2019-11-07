package br.com.bootcampmongo.controllers;

//<editor-fold defaultstate="collapsed" desc="imports...">
import br.com.bootcampmongo.models.AnimalDeEstimacaoModel;
import br.com.bootcampmongo.repositories.AnimaisDeEstimacaoRepository;
import java.util.List;
import java.util.ArrayList;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author tiago, 06/11/2019, 19:50:03
 * Last update: -
 *///</editor-fold>
@RestController
@RequestMapping("/api")
public class AnimaisDeEstimacaoController {
    
    //<editor-fold defaultstate="collapsed" desc="attributes...">
    
    //<editor-fold defaultstate="collapsed" desc="main attributes...">
    @Autowired
    private AnimaisDeEstimacaoRepository repository;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    
    //</editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructors...">
//    @Autowired
//    public AnimaisDeEstimacaoController(AnimaisDeEstimacaoRepository repository){
//        this.repository = repository;
//    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="methods...">
    
    //<editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="override methods...">
    
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="static methods...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="main methods...">
    @RequestMapping(value = "/animais", method = RequestMethod.GET)
    public List<AnimalDeEstimacaoModel> getAll(){
        return repository.findAll();
    }
    
    @RequestMapping(value = "/animais/{id}", method = RequestMethod.GET)
    public AnimalDeEstimacaoModel getById(@PathVariable("id") ObjectId _id){
        return repository.findBy_id(_id);
    }
    
    @RequestMapping(value = "/animais/{id}", method = RequestMethod.PUT)
    public void modifyAnimalById(@PathVariable("id") ObjectId _id, @Valid @RequestBody AnimalDeEstimacaoModel animalDeEstimacao){
        animalDeEstimacao.set_id(_id);
        repository.save(animalDeEstimacao);
    }
    
    @RequestMapping(value = "/animais", method = RequestMethod.POST)
    public AnimalDeEstimacaoModel createAnimal(@Valid @RequestBody AnimalDeEstimacaoModel animalDeEstimacao){
//        animalDeEstimacao.set_id(ObjectId.get()); //O Mongo cria automaticamente
        repository.save(animalDeEstimacao);
        return animalDeEstimacao;
    }
    
    @RequestMapping(value = "/animais/{id}", method = RequestMethod.DELETE)
    public AnimalDeEstimacaoModel deleteById(@PathVariable("id") ObjectId _id){
        AnimalDeEstimacaoModel animalDeEstimacaoModel = repository.findBy_id(_id);
        repository.deleteById(_id);
        return animalDeEstimacaoModel;
    }
    
    //</editor-fold>
    
    //</editor-fold>
        
}//class
