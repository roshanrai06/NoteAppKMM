package com.roshan.dev.noteappkmm.android.di

import android.app.Application
import com.roshan.dev.noteappkmm.data.local.DatabaseDriverFactory
import com.roshan.dev.noteappkmm.data.note.SqlDelightNoteDataSource
import com.roshan.dev.noteappkmm.database.NoteDatabase
import com.roshan.dev.noteappkmm.domain.note.NoteDataSource

import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}