package dev.mustaq.urbandictionaryapp

import android.app.Application
import dev.mustaq.urbandictionaryapp.framework.koin.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

/**
 * Created by Mustaq Sameer on 08/06/20
 */
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        configKoin()
    }

    private fun configKoin() {
        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(
                commonModules,
                viewModelModules,
                dataSourceModules,
                repositoryModules
            ))
        }
    }

}