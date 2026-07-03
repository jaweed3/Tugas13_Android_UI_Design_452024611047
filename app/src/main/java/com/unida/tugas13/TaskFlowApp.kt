package com.unida.tugas13

import android.app.Application
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate

class TaskFlowApp : Application() {
    override fun onCreate() {
        super.onCreate()
        val prefs = getSharedPreferences("prefs", MODE_PRIVATE)

        // Set default light mode on first launch
        if (!prefs.contains("theme_set")) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            prefs.edit().putBoolean("theme_set", true).apply()
        }
    }
}
