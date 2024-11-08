package com.example.myassignment.data

import android.content.Context
import com.example.myassignment.R
import com.example.myassignment.model.Game

class DataSet(val context: Context) {
    fun getTitleList(): Array<String>{
        return context.resources.getStringArray(R.array.title_array)
    }
    fun getReleaseDateList(): Array<String>{
        return context.resources.getStringArray(R.array.date_array)
    }
    fun getPlatformList(): Array<String>{
        return context.resources.getStringArray(R.array.platform_array)
    }
    fun getGenreList(): Array<String>{
        return context.resources.getStringArray(R.array.genre_array)
    }
    fun getDeveloperList(): Array<String>{
        return context.resources.getStringArray(R.array.developer_array)
    }
    fun getRatingList(): Array<String>{
        return context.resources.getStringArray(R.array.rating_array)
    }


    fun loadGames(): List<Game>{
        val titleList = getTitleList();
        val dateList = getReleaseDateList();
        val platformList = getPlatformList();
        val genreList = getGenreList();
        val developerList = getDeveloperList();
        val ratingList = getRatingList();

        val games = mutableListOf<Game>()
        for(i in titleList.indices){
            games.add(Game(titleList[i], release_date = dateList[i], platform = platformList[i], genre = genreList[i], developer = developerList[i], rating = ratingList[i] ))
        }
        return games;
    }
}