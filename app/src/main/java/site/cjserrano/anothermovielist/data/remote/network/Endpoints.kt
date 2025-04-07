package site.cjserrano.anothermovielist.data.remote.network

import retrofit2.Response
import retrofit2.http.GET
import site.cjserrano.anothermovielist.data.remote.model.MovieListResponse

interface Endpoints {

    @GET("movies.json")
    suspend fun getMovieList(): Response<MovieListResponse?>
}
