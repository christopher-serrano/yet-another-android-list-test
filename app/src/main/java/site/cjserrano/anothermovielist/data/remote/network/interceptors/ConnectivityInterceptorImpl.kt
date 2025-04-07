package site.cjserrano.anothermovielist.data.remote.network.interceptors

import android.content.Context
import com.serranocjm.movielisttestapp.utils.NoConnectivityException
import okhttp3.Interceptor
import okhttp3.Response
import org.koin.core.component.KoinComponent
import site.cjserrano.anothermovielist.utils.NetworkUtil

class ConnectivityInterceptorImpl(context: Context) : ConnectivityInterceptor, KoinComponent {
    private val appContext = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!NetworkUtil.isOnline(appContext)) {
            throw NoConnectivityException("No Network Connection")
        }
        return chain.proceed(chain.request())
    }
}
