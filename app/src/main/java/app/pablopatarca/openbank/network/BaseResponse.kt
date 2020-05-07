package app.pablopatarca.openbank.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BaseResponse<T>(
    @field:Json(name = STATUS_KEY) val status: Boolean,
    @field:Json(name = DATA_KEY) val data: T?,
    @field:Json(name = MESSAGE_KEY) val message: String?
) {
    companion object {
        const val STATUS_KEY = "status"
        const val DATA_KEY = "data"
        const val MESSAGE_KEY = "message"
    }
}