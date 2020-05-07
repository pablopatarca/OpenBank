package app.pablopatarca.openbank.network

import org.json.JSONObject
import retrofit2.Call

@Throws(Throwable::class)
fun <T> Call<BaseResponse<T>>.executeCall(): T {
    val serviceExecution = execute()
    serviceExecution.errorBody()?.let {
        val errorBodyJson = JSONObject(it.string())
        if (errorBodyJson.has(BaseResponse.MESSAGE_KEY)) {
            throw ServiceException(errorBodyJson.get(BaseResponse.MESSAGE_KEY).toString())
        } else {
            throw ServiceException("Unexpected error")
        }
    } ?: serviceExecution.body()?.let {
        return it.data ?: throw ServiceException(it.message)
    } ?: throw ServiceException("Unexpected error")
}