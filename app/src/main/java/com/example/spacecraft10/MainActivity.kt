package com.example.spacecraft10

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacecraft10.data.RetrofitService
import com.example.spacecraft10.data.SpacecraftRepository
import com.example.spacecraft10.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val retrofitService = RetrofitService.RetrofitServiceFactory.makeRetrofitService()

        val repository = SpacecraftRepository(retrofitService)

        val spacecraftAdapter = SpacecraftAdapter()

        binding.recyclerView.adapter = spacecraftAdapter

        binding.recyclerView.layoutManager = LinearLayoutManager(this)



        lifecycleScope.launch {

            val allSpacecrafts = repository.getAllSpacecrafts()

/*
            val nasaSC = allSpacecrafts.filter { results ->
                results.agency?.name == "SpaceX"
            }
*/

            spacecraftAdapter.submitList(allSpacecrafts)
            Log.d("Cuenta", allSpacecrafts.size.toString())

        }



    }
}