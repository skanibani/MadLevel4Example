package com.example.madlevel2example

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminderTable")
data class Reminder(
    @ColumnInfo(name = "reminder")
    var reminderText: String,

    // Empty id column auto-increment as primary key
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)