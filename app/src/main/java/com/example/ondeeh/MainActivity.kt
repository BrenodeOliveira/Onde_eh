package com.example.ondeeh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.ondeeh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpListener()
    }

    private fun setUpListener() {
        binding.btSearch.setOnClickListener {
            val searchIntent = Intent(
                this,
                AddressDetailActivity::class.java
            )
            searchIntent.putExtra(
                AddressDetailActivity.EXTRA_CEP,
                binding.etCep.text.toString()
            )
            searchResult.launch(searchIntent)
        }
    }

    private val searchResult =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK) {
                //result.data?.getStringExtra("CHAVE")?.let { result -> }
                binding.etCep.setText("")
            } else {
                //No momento não teremos nenhuma interação caso resultCode seja diferente de RESULT_OK
            }
        }
}
