package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class HelloAgainControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `GET hello-again returns Hello again, rest of the world`() {
        mockMvc.get("/hello-again")
            .andExpect {
                status { isOk() }
                content { string("Hello again, rest of the world!") }
            }
    }
}
