package com.betomorrow.api

import io.ktor.locations.*
import io.ktor.routing.*


@Location("/posts/{id}")
data class Post(val id: String) {
    @Location("/") data class Edit(val parent: Post)
}

fun Route.posts() = route("/posts") {
    get {

    }

    post {

    }
}