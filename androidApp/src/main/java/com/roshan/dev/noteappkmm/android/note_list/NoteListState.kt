package com.roshan.dev.noteappkmm.android.note_list

import com.roshan.dev.noteappkmm.domain.note.Note


data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
