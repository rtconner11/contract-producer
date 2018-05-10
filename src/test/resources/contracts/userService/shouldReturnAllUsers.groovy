package userService

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/users'
    }
    response {
        status 200
        headers {
            contentType(applicationJsonUtf8())
        }
        body([
                [
                        id: "1",
                        name: "Joe"
                ]
        ])
    }
}