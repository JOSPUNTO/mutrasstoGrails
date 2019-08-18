package mutrassto.api

class Session  {

    String libelleSession
    Date dateSession

    static constraints = {
        dateSession blank : false, nullable : false
        libelleSession maxSize : 255
    }


    static mapping = {
        version false
        dateSession type: 'date'
        //id composite: ['dateSession', 'id']
    }
}
