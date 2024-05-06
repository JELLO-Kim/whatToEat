package com.whattoeat.api.controller

import com.whattoeat.common.dto.RestResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun home(): RestResponse<List<String>> {
        return RestResponse(listOf("hihi", "hello"))
    }
}