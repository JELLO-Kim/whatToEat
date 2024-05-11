package com.whattoeat.api.controller

import com.whattoeat.common.dto.RestResponse
import com.whattoeat.common.dto.RestResponse2
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/one")
    fun home(): RestResponse<List<String>> {
        return RestResponse(listOf("hihi", "hello"))
    }

    @GetMapping("/two")
    fun one(): ResponseEntity<RestResponse2> {
        return ResponseEntity.ok(RestResponse2(listOf("hihi2", "hello2")))
    }
}