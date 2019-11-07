package br.com.bootcampmongo.models;

//<editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
import org.bson.types.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author tiago, 06/11/2019, 19:31:20
 * Last update: -
 *///</editor-fold>
@Document(collection = "AnimaisDeEstimacao")
public class AnimalDeEstimacaoModel {
    
    //<editor-fold defaultstate="collapsed" desc="attributes...">
    
    //<editor-fold defaultstate="collapsed" desc="main attributes...">
    @Id
    private ObjectId _id;
    
//    @Indexed(name = "nome")
    private String nome;
    
//    @Indexed(name = "especie")
    private String especie;
    
//    @Indexed(name = "raca")
    private String raca;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    
    //</editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructors...">
    public AnimalDeEstimacaoModel() {}
    
    public AnimalDeEstimacaoModel(ObjectId _id, String nome, String especie, String raca) {
        this._id = _id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="methods...">
    //<editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    public String get_id() {
        return _id.toHexString();
    }

    public AnimalDeEstimacaoModel set_id(ObjectId _id) {
        this._id = _id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AnimalDeEstimacaoModel setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEspecie() {
        return especie;
    }

    public AnimalDeEstimacaoModel setEspecie(String especie) {
        this.especie = especie;
        return this;
    }

    public String getRaca() {
        return raca;
    }

    public AnimalDeEstimacaoModel setRaca(String raca) {
        this.raca = raca;
        return this;
    }    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="override methods...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="static methods...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="main methods...">
    //</editor-fold>
    //</editor-fold>

    
        
}//class
