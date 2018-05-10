package userService

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url value(consumer(regex("/users/" + number())), producer("/users/1"))
    }
    response {
        status 200
        headers {
            contentType(applicationJsonUtf8())
        }
        body(
                id: fromRequest().path(1),
                name: "Joe"
        )
    }
}