package mutrassto.api

class Produit {

    String codeProduit
    String nomProduit
    Date dateEnreg

    //ProduitCategorie categorie
    static belongsTo = [categorie:Categorie,session:Session]

    static constraints = {
        nomProduit blank:false
        codeProduit blank: false, unique: true
        // dateEnreg()
    }
    static mapping = {
        version false
    }
}
