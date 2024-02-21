package sn.esmt.produit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Produit")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {
    @Id
    @Column(name = "Reference",length = 10)
    private String ref;
    @Column(name = "Nom",length = 200, nullable = false)
    private String nomProduit;
    @Column(name = "QtStock")
    private double qtstock;

}
