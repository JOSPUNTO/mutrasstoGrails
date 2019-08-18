package mutrassto.api

class Commande {

    Date dateCommande
    //Membre Membre
    //List commandeLignes
    static hasMany = [commandeLignes:CommandeLigne]
    static mappedBy = [commandeLignes: "commande"]
    static belongsTo = [membre:Membre]
    
    static constraints = {
    }

    static mapping = {
        version false
        dateCommande type: 'date'
        membre type: "bigint", length: 6
    }

}
