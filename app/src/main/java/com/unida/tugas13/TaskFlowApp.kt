package com.unida.tugas13

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class TaskFlowApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}
