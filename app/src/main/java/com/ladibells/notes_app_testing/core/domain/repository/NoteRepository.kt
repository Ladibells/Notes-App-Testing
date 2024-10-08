package com.ladibells.notes_app_testing.core.domain.repository

import com.ladibells.notes_app_testing.core.domain.model.NoteItem

interface NoteRepository {

    suspend fun upsertNote(noteItem: NoteItem)

    suspend fun deleteNote(noteItem: NoteItem)

    suspend fun getAllNotes(): List<NoteItem>

}


















