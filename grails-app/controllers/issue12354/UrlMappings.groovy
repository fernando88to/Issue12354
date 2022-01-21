package issue12354

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/.well-known/apple-developer-merchantid-domain-association"(view:"/myview")
        "/.xxx"(view:"/myview")
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
