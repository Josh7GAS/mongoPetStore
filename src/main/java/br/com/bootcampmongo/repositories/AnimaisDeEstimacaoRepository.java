package br.com.bootcampmongo.repositories;

//<editor-fold defaultstate="collapsed" desc="imports...">

import br.com.bootcampmongo.models.AnimalDeEstimacaoModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//import ...
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author tiago, 06/11/2019, 19:46:38
 * Last update: -
 *///</editor-fold>
public interface AnimaisDeEstimacaoRepository extends MongoRepository<AnimalDeEstimacaoModel, ObjectId>{
    
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="abstract methods...">
    AnimalDeEstimacaoModel findBy_id(ObjectId _id);
    
    
    //</editor-fold>
    
}//interface
