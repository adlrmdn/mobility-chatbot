package com.example.testapp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapp4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AdapterView

    private val listString = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = AdapterView(listString)
        binding.rvChat.adapter = adapter
        binding.rvChat.layoutManager = LinearLayoutManager(this)

        binding.button.setOnClickListener {
            adapter.postChat(binding.textInput.text.toString())
            adapter.notifyDataSetChanged()
        }
    }
}