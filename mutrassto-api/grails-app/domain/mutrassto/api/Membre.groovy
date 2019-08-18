package mutrassto.api

class Membre {

    String matricule
    String nom_Membre
    String prenom_Membre
    Date dateNaissance
    String profession

    static constraints = {
        nom_Membre maxSize: 25 , matches: "[a-zA-Z]+", blank:false, nullable: false
        prenom_Membre blank:false, nullable: false, maxSize: 50, matches: "[a-zA-Z]+"
        matricule blank:false, nullable: false, unique: true
        profession blank:false
    }

    static mapping = {
        version false
        dateNaissance type: 'date'
    }

}
