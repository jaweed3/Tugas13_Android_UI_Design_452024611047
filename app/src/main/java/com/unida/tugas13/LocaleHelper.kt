package com.unida.tugas13

import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.os.LocaleList
import java.util.Locale

object LocaleHelper {

    private const val PREF_NAME = "locale_prefs"
    private const val KEY_LOCALE = "selected_locale"

    fun onAttach(context: Context): Context {
        val localeCode = getSavedLocale(context)
        return updateResources(context, localeCode)
    }

    fun setLocale(context: Context, languageCode: String) {
        val prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        prefs.edit().putString(KEY_LOCALE, languageCode).apply()
    }

    fun getSavedLocale(context: Context): String {
        val prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        return prefs.getString(KEY_LOCALE, "en") ?: "en"
    }

    private fun updateResources(context: Context, localeCode: String): Context {
        val locale = Locale(localeCode)
        Locale.setDefault(locale)

        val config = context.resources.configuration

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            config.setLocales(LocaleList(locale))
        } else {
            @Suppress("DEPRECATION")
            config.locale = locale
        }

        return context.createConfigurationContext(config)
    }
}
