package com.example.utsmdp

import android.content.Context
import com.example.utsmdp.R
import com.example.utsmdp.model.Anime

object AnimeData {

    fun getAnimeList(context: Context): List<Anime> {
        return listOf(
            Anime(
                id = 1,
                title = "Attack on Titan",
                description = "In a world where humanity lives inside cities surrounded by enormous walls due to the Titans, gigantic humanoid creatures that devour humans seemingly without reason, a young boy named Eren Yeager vows to cleanse the earth of the giant humanoid Titans that have brought humanity to the brink of extinction.",
                imageResourceId = R.drawable.anime_attack_on_titan
            ),
            Anime(
                id = 2,
                title = "Fullmetal Alchemist: Brotherhood",
                description = "Two brothers search for a Philosopher's Stone after an attempt to revive their deceased mother goes horribly wrong, leading to the loss of their bodies.",
                imageResourceId = R.drawable.anime_fmab
            ),
            Anime(
                id = 3,
                title = "Demon Slayer",
                description = "A family is attacked by demons and only two members survive - Tanjiro and his sister Nezuko, who is turning into a demon slowly. Tanjiro sets out to become a demon slayer to avenge his family and cure his sister.",
                imageResourceId = R.drawable.anime_demon_slayer
            ),
            Anime(
                id = 4,
                title = "My Hero Academia",
                description = "In a world where people with superpowers known as 'Quirks' are the norm, Izuku Midoriya has dreams of one day becoming a Hero, despite being bullied by his classmates for not having a Quirk. After being the only one to try and save his childhood bully from a villain, Izuku is noticed by the world's greatest hero All Might and given a chance to become the hero he always wanted to be.",
                imageResourceId = R.drawable.anime_my_hero_academia
            ),
            Anime(
                id = 5,
                title = "One Piece",
                description = "Follows the adventures of Monkey D. Luffy and his pirate crew in order to find the greatest treasure ever left by the legendary Pirate, Gold Roger. The famous mystery treasure named One Piece.",
                imageResourceId = R.drawable.anime_one_piece
            ),
            Anime(
                id = 6,
                title = "Death Note",
                description = "An intelligent high school student goes on a secret crusade to eliminate criminals from the world after discovering a notebook capable of killing anyone whose name is written into it.",
                imageResourceId = R.drawable.anime_death_note
            ),
            Anime(
                id = 7,
                title = "Jujutsu Kaisen",
                description = "A boy swallows a cursed talisman - the finger of a demon - and becomes cursed himself. He enters a shaman school to be able to locate the demon's other body parts and thus exorcise himself.",
                imageResourceId = R.drawable.anime_jujutsu_kaisen
            )
        )
    }

    fun getAnimeById(context: Context, id: Int): Anime? {
        return getAnimeList(context).find { it.id == id }
    }
}