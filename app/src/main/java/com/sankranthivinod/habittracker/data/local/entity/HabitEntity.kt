package com.sankranthivinod.habittracker.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val startDate: Long,
    val reminderTime: Long? = null,
    val streak: Int = 0
)
