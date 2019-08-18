package mutrassto.api

import grails.converters.JSON
import grails.gorm.transactions.Transactional
import static java.lang.Class.forName

@Transactional
class GenericService {

    def findAll(String clas){
        def classe=forName('mutrassto.api.'+clas)
        def c=classe.findAll()
        return c
    }

    def create(java.util.Map obj) {
        println('PARAMETRES !!!!!!!!!!!!! ')
        println(obj)
        def entity=forName('mutrassto.api.'+obj.classe)
        def entityInstance =  entity.newInstance(obj);
        println('XXXXXXXXXXXXXXXXXXXXXXXXX '+obj.id)
        entityInstance.save(flush: true,failOnError:true);
        println('CREATION !!!!!!!!!!!!!!!!!!!!!! BF  LAST')
        return ['success':true];

    }



    def update(java.util.Map obj) {
        println('MISE A JOUR ENTREE !!!!!!!!!!!!!!!!!!!!!! '+obj.id)
        def entity=forName('mutrassto.api.'+obj.classe)
        def entityInstance =  entity.get(obj.id);
        entityInstance.properties = obj;
        println(entityInstance)
        entityInstance.save(flush: true,failOnError:true);
        println('MISE A JOUR  !!!!!!!!!!!!!!!!!!!!!! ')
        return ['success':true];
    }


    def search(String q, Integer max ) { // <1>
        if (q) {
            //tag::whereQuery[]
            def query = forName('mutrassto.api.'+params.classe).where { // <2>
                login ==~ "%${q}%"
            }
            return query.list(max: Math.min( max ?: 10, 100))// <3>
        }
        else {
            return([]) // <4>
        }
    }
}
