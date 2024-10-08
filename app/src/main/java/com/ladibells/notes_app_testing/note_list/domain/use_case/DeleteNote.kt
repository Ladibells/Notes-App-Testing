package com.ladibells.notes_app_testing.note_list.domain.use_case

import com.ladibells.notes_app_testing.core.domain.model.NoteItem
import com.ladibells.notes_app_testing.core.domain.repository.NoteRepository

class DeleteNote(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(note: NoteItem) {
        noteRepository.deleteNote(note)
    }

}
















