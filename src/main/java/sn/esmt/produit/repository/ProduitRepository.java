package sn.esmt.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.produit.entity.ProduitEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {
    @Query("select p from ProduitEntity p where p.ref = ?1")
    public Optional<ProduitEntity> findByRef(String ref);

    @Query("select p from ProduitEntity p where p.ref = ?1 and p.nomProduit = ?2")
    public  Optional<List<ProduitEntity>> findByNomAndRef(String ref, String nomProduit);

    @Query("select p from ProduitEntity p where p.nomProduit = ?1")
    public  Optional<List<ProduitEntity>> findByNom(String nomProduit);

    @Query("select p from ProduitEntity p where p.ref = :r")
    public Optional<List<ProduitEntity>> findByRefv2(@Param("r") String ref);

}
