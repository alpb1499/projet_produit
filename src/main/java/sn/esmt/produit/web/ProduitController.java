package sn.esmt.produit.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.produit.entity.ProduitEntity;
import sn.esmt.produit.service.ProduitService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@AllArgsConstructor
public class ProduitController {

    private ProduitService produitService;

    @PostMapping
    public ProduitEntity save(ProduitEntity produitEntity){
        return produitService.save(produitEntity);
    }

    @GetMapping
    public List<ProduitEntity> all(){
        return produitService.getAll().get();
    }

    @PutMapping
    public ProduitEntity update(String ref,ProduitEntity produitEntity){
        return produitService.update(ref,produitEntity);
    }

    @DeleteMapping
    public void delete(String ref){
        produitService.delete(ref);
        produitService.getAll();
    }

    @GetMapping("/recherche")
    public Optional<List<ProduitEntity>> search(@RequestParam(value = "Référence", required = false) String ref,
                                                @RequestParam(value = "Nom du produit", required = false) String nom) {
        if (nom != null && ref != null) {
            return produitService.findByNomAndRef(ref, nom);
        }
        return produitService.getAll();
    }

}