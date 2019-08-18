package mutrassto.api

class CommandeLigne {

    Commande commande
    int quantite
    String  siteLivraison


    static belongsTo = [produit:Produit]

    static constraints = {
        quantite (min : 0)
    }
    static mapping = {
        version false
    }
}
