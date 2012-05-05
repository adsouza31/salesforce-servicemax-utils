class UrlMappings {

	static mappings = {

        "/login/auth" {
            controller = 'openId'
            action = 'auth'
        }

        "/login/openIdCreateAccount" {
            controller = 'openId'
            action = 'createAccount'
        }


		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

        "/" {
            controller = "main"
            action = 'index'
        }
		"500"(view:'/error')
	}
}
