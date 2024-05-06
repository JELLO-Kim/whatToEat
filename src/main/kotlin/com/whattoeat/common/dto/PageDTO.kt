package com.whattoeat.common.dto

class PageDTO(
    val page: Int = 0,
    var count: Int = 10,
    val totalCount: Int?,
    val pageData: MutableList<Any>?,
) {
    init {
        count = pageData?.size ?: 0
    }
}