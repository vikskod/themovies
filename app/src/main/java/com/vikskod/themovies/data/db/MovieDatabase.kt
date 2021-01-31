package com.vikskod.themovies.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vikskod.themovies.data.model.Movie


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class MovieDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
}