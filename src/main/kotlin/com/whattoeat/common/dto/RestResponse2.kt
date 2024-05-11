package com.whattoeat.common.dto

import org.springframework.http.HttpStatus

class RestResponse2 (
    var data: Any?,
    val status: HttpStatus = HttpStatus.OK,
    var pageInfo: PageDTO? = null,
    var userMessages: String = "success",
    var systemMessages: String = "hello develoer",
    ) {
        init {
            if (status != HttpStatus.OK) {
                // 에러 처리
            }
            // PageDTO 클래스면 페이지네이션 추가
            if (data is PageDTO) {
                val pageData = data as PageDTO // PageDTO로 캐스팅
                data = pageData.pageData
                pageInfo = pageData
            }
//            // data set 처리
//            var resData = HashMap<String, Any?>()
//            resData.put("data", data)
//            resData.put("userMessage", userMessages)
//            resData.put("systemMessage", systemMessages)
//            data = resData

        }
}