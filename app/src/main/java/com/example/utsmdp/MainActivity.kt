package com.example.utsmdp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utsmdp.R
import com.example.utsmdp.adapter.AnimeAdapter
import com.example.utsmdp.databinding.ActivityMainBinding
import com.example.utsmdp.model.Anime
import com.example.utsmdp.util.AnimeData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var animeAdapter: AnimeAdapter

    companion object {
        const val EXTRA_EMAIL = "extra_email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        // Get email from intent
        val email = intent.getStringExtra(EXTRA_EMAIL) ?: ""
        binding.textViewWelcome.text = getString(R.string.welcome_user, email)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        animeAdapter = AnimeAdapter(AnimeData.getAnimeList(this)) { anime ->
            // Navigate to detail when item clicked
            val intent = DetailActivity.createIntent(this, anime.id)
            startActivity(intent)
        }

        binding.recyclerViewAnime.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = animeAdapter
        }
    }
}