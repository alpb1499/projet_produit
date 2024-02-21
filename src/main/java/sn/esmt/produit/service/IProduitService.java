package sn.esmt.produit.service;

import sn.esmt.produit.entity.ProduitEntity;

import java.util.List;
import java.util.Optional;

public interface IProduitService {

    //Enregistrer
    public ProduitEntity save(ProduitEntity produitEntity);

    //Modifier
    public ProduitEntity update(String ref, ProduitEntity produitEntity);

    //Rechercher à partir d'une référence de produit
    public Optional<ProduitEntity> get(String ref);

    //Rechercher tous les produits
    public Optional<List<ProduitEntity>> getAll();

    //Suppression de produits
    public void delete(String ref);

}
