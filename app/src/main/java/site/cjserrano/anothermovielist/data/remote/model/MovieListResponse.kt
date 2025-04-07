package site.cjserrano.anothermovielist.data.remote.model

import com.google.gson.annotations.SerializedName

data class MovieListResponse(

	@field:SerializedName("errorMessage")
	val errorMessage: String? = null,

	@field:SerializedName("items")
	val movieItems: List<Movie?>? = null
)