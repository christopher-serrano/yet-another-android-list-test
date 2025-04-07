package site.cjserrano.anothermovielist.data.remote.model

import com.google.gson.annotations.SerializedName

data class Genre(

	@field:SerializedName("value")
	val value: String? = null,

	@field:SerializedName("key")
	val key: String? = null
)