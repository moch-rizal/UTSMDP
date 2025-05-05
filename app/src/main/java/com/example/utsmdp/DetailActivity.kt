package com.example.utsmdp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.utsmdp.databinding.ActivityDetailBinding
import com.example.utsmdp.AnimeData

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        private const val EXTRA_ANIME_ID = "extra_anime_id"

        fun createIntent(context: Context, animeId: Int): Intent {
            return Intent(context, DetailActivity::class.java).apply {
                putExtra(EXTRA_ANIME_ID, animeId)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        loadAnimeDetail()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        binding.toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    private fun loadAnimeDetail() {
        val animeId = intent.getIntExtra(EXTRA_ANIME_ID, -1)
        if (animeId != -1) {
            val anime = AnimeData.getAnimeById(this, animeId)
            anime?.let {
                binding.collapsingToolbar.title = it.title
                binding.imageViewAnimeDetail.setImageResource(it.imageResourceId)
                binding.textViewTitleDetail.text = it.title
                binding.textViewDescription.text = it.description
            }
        }
    }
}