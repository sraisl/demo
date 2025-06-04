package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloAgainController {
    @GetMapping("/hello-again")
    fun helloAgain(): String = "Hello again, rest of the world!"
}
