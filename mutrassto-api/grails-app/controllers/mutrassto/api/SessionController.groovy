package mutrassto.api


import grails.rest.*
import grails.converters.*

class SessionController extends RestfulController {
    static responseFormats = ['json', 'xml']

    def p = params+request.JSON;
    def sessionService
    SessionController() {
        super(Session)
    }
    def findAll(){
        /*console('*****')
        console(params)
        console('*****')
        console(request)*/

        render params.callback+'('+ (sessionService.findAll(p.classe) as JSON) +')'
        //render (sessionService.findAll((p).classe) as JSON) 
    }

    def update(){
        //render (sessionService.update((p).classe) as JSON) 

        render params.callback+'('+ (sessionService.update(p) as JSON) +')'
    }

    def create(){
        //render (sessionService.create((p).classe) as JSON) 

        render params.callback+'('+ (sessionService.create(p) as JSON) +')'
    }

    //def index(){}
}
