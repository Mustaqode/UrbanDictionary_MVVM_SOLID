package dev.mustaq.urbandictionaryapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import dev.mustaq.urbandictionaryapp.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUi()
        setListeners()
    }

    private fun setupUi() {
        mainViewModel.meaning.observe(this, Observer { meaning ->
            uiTvMeaning.text = meaning
        })

        mainViewModel.error.observe(this, Observer { error ->
            Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
        })
    }

    private fun setListeners() {
        uiBtnGetMeaning.setOnClickListener {
            mainViewModel.getMeaning(uiEtTypeWordForMeaning.text.toString())
        }
    }

}
