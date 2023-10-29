package com.example.learningtestwithmitch.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Note")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,

    @ColumnInfo(name = "title")
    private val title: String? = null,

    @ColumnInfo(name = "content")
    private val content: String? = null,

    @ColumnInfo(name = "timestamp")
    private val timestamp: String? = null,
) {

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Note) return false
        if (title == other.title && content == other.content && id == other.id) return true
        return false
    }

}