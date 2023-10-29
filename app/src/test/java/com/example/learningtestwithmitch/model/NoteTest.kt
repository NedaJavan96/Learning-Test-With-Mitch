package com.example.learningtestwithmitch.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class NoteTest {

    // compare two equal notes
    @Test
    fun isNotesEqual_identicalProperties_returnTrue() {
        //Arrange
        val note1 = Note(1, "Note #1", "This is not #1", "05-2019")
        val note2 = Note(1, "Note #1", "This is not #1", "05-2019")

        //Act

        //Assert
        assertEquals(note1, note2)
        println("1:the notes are equal")
    }

    // compare two notes with two different ids
    @Test
    fun isNotesEqual_differentIds_returnFalse() {
        //Arrange
        val note1 = Note(1, "Note #1", "This is not #1", "05-2019")
        val note2 = Note(2, "Note #1", "This is not #1", "05-2019")

        //Act

        //Assert
        assertNotEquals(note1, note2)
        println("2:the notes are note equal")
    }

    // compare two notes with different timestamps
    @Test
    fun isNotesEqual_differentTimestamp_returnTrue() {
        //Arrange
        val note1 = Note(1, "Note #1", "This is not #1", "05-2019")
        val note2 = Note(1, "Note #1", "This is not #1", "04-2019")

        //Act

        //Assert
        assertEquals(note1, note2)
        println("3:the notes are note equal")
    }

    //compare two notes with different titles

    @Test
    fun isNotesEqual_differentTitle_returnFalse() {
        //Arrange
        val note1 = Note(1, "Note #1", "This is not #1", "05-2019")
        val note2 = Note(1, "Note #2", "This is not #1", "05-2019")

        //Act

        //Assert
        assertNotEquals(note1, note2)
        println("4:the notes are note equal")
    }

    //compare two notes with different contents
    @Test
    fun isNotesEqual_differentContent_returnFalse() {
        //Arrange
        val note1 = Note(1, "Note #1", "This is not #1", "05-2019")
        val note2 = Note(1, "Note #1", "This is not #2", "05-2019")

        //Act

        //Assert
        assertNotEquals(note1, note2)
        println("5:the notes are note equal")
    }

}
