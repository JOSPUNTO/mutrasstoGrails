package mutrassto.api

class BootStrap {

    def init = { servletContext ->


    def produitCategorie1 = new Categorie(libelleCategorie:'Riz non parfumé').save()
    def produitCategorie2 = new Categorie(libelleCategorie:'Savon').save()
    def produitCategorie3 = new Categorie(libelleCategorie:'Riz Parfumé').save()
    def produitCategorie4 = new Categorie(libelleCategorie:'Pâtes alimentaires').save()
    def produitCategorie5 = new Categorie(libelleCategorie:'Chaises en plastique').save()

    /* ENREGISTREMENT DANS LA CLASSE PRODUIT

    def produit1 = new Produit(nomProduit:'Fortune 25Kg',dateEnreg:new Date(),prix:25000,codeProduit:'fortune25',categorie:produitCategorie1,session:session).save()
    def produit2 = new Produit(nomProduit:'Farida 25Kg',dateEnreg:new Date(),prix:18000,codeProduit:'farida25',categorie:produitCategorie1,session:session).save()
    def produit3 = new Produit(nomProduit:'Majesté jaune 50Kg',dateEnreg:new Date(),prix:14000,codeProduit:'majesteJaune50',categorie:produitCategorie1,session:session).save()
    def produit4 = new Produit(nomProduit:'Tilemsi bleu 50Kg',dateEnreg:new Date(),prix:17000,codeProduit:'tilemsiBleu50',categorie:produitCategorie1,session:session).save()
    def produit5 = new Produit(nomProduit:'Tilemsi jaune 50Kg',dateEnreg:new Date(),prix:15000,codeProduit:'tilemsiJaune50',categorie:produitCategorie1,session:session).save()*/

    }
    def destroy = {
    }
}
