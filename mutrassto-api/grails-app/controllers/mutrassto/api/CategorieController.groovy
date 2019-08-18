package mutrassto.api


import grails.rest.*
import grails.converters.*

class CategorieController extends RestfulController {
    static responseFormats = ['json', 'xml']
    def p =params+request.JSON
    def categorieService

    CategorieController() {
        super(Categorie)
    }
     def findAll(){
        println('Toto')
        render params.callback+'('+ (categorieService.findAll(p.classe) as JSON) +')'
        //render (CategorieProduitService.findAll((p).classe) as JSON) 
    }

    def update(){


        render params.callback+'('+ (categorieService.update(p) as JSON) +')'

        //render (CategorieProduitService.update((p).classe) as JSON) 
    }

    def create(){
        
        render params.callback+'('+ (categorieService.update(p) as JSON) +')'
        //render (CategorieProduitService.create((p).classe) as JSON) 
    }

    // def index(){}
}
