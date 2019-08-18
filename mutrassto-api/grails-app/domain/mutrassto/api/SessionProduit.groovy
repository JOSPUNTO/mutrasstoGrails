package mutrassto.api

class SessionProduit {

    double prix

    static belongsTo = [produit:Produit,session:Session]

    static constraints = {
        prix min : 0, scale : 2
    }

    static mapping = {
        version false
    }
}
