package com.example.madlevel4example

import androidx.room.*
import com.example.madlevel4example.Reminder

@Dao
interface ReminderDao {
    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)
}