package site.cjserrano.anothermovielist.data.remote.model

import com.google.gson.annotations.SerializedName

data class Movie(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("fullTitle")
	val fullTitle: String? = null,

	@field:SerializedName("runtimeMins")
	val runtimeMins: String? = null,

	@field:SerializedName("year")
	val year: String? = null,

	@field:SerializedName("directors")
	val directors: String? = null,

	@field:SerializedName("genreList")
	val genreList: List<Genre?>? = null,

	@field:SerializedName("metacriticRating")
	val metacriticRating: String? = null,

	@field:SerializedName("directorList")
	val directorList: List<Director?>? = null,

	@field:SerializedName("stars")
	val stars: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("imDbRating")
	val imDbRating: String? = null,

	@field:SerializedName("runtimeStr")
	val runtimeStr: String? = null,

	@field:SerializedName("imDbRatingCount")
	val imDbRatingCount: String? = null,

	@field:SerializedName("plot")
	val plot: String? = null,

	@field:SerializedName("genres")
	val genres: String? = null,

	@field:SerializedName("contentRating")
	val contentRating: String? = null,

	@field:SerializedName("starList")
	val starList: List<Star?>? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("releaseState")
	val releaseState: String? = null
)