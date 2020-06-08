package dev.mustaq.urbandictionaryapp.framework.koin

import dev.mustaq.data.datasource.DictionaryDataSource
import dev.mustaq.data.repository.DictionaryRepositoryImpl
import dev.mustaq.data.service.ServiceDataSource
import dev.mustaq.urbandictionaryapp.framework.rest.DictionaryService
import dev.mustaq.urbandictionaryapp.framework.rest.Rest
import dev.mustaq.urbandictionaryapp.presentation.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Mustaq Sameer on 08/06/20
 */

val commonModules = module {
    single { Rest.service }
}

val viewModelModules = module {
    viewModel { MainViewModel( get()) }
}

val dataSourceModules = module {
    single { DictionaryDataSource(get()) }
    single<ServiceDataSource> { DictionaryService(get()) }
}

val repositoryModules = module {
    single { DictionaryRepositoryImpl(get())  }
}

