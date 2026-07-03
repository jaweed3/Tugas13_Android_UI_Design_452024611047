package com.unida.tugas13

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.unida.tugas13.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding
    private var isDarkMode = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        isDarkMode = AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES

        setupWindowInsets()
        setupToolbar()
        setupBottomNavigation()
        setupThemeToggle()
        setupLanguageSelector()
        setupCards()
        setupLogout()
        updateThemeUI()
    }

    private fun setupWindowInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(binding.coordinatorLayout) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, 0, systemBars.right, 0)
            insets
        }
    }

    private fun setupToolbar() {
        binding.toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_language -> {
                    showLanguageDialog()
                    true
                }
                else -> false
            }
        }
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_tasks -> {
                    navigateToHome()
                    true
                }
                R.id.nav_settings -> {
                    true
                }
                else -> false
            }
        }

        binding.bottomNavigation.selectedItemId = R.id.nav_settings
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        finish()
    }

    private fun setupThemeToggle() {
        binding.switchTheme.setOnCheckedChangeListener { _, isChecked ->
            isDarkMode = isChecked
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            updateThemeUI()
        }
    }

    private fun updateThemeUI() {
        binding.tvThemeValue.text = if (isDarkMode) {
            getString(R.string.theme_dark)
        } else {
            getString(R.string.theme_light)
        }
        binding.switchTheme.isChecked = isDarkMode
    }

    private fun setupLanguageSelector() {
        updateLanguageUI()

        binding.cardLanguage.setOnClickListener {
            showLanguageDialog()
        }
    }

    private fun updateLanguageUI() {
        val currentLocale = resources.configuration.locales[0]
        binding.tvLanguageValue.text = if (currentLocale.language == "id") {
            "Bahasa Indonesia"
        } else {
            "English"
        }
    }

    private fun showLanguageDialog() {
        val languages = arrayOf("English", "Bahasa Indonesia")
        val languageCodes = arrayOf("en", "id")

        androidx.appcompat.app.AlertDialog.Builder(this)
            .setTitle(R.string.language_setting)
            .setItems(languages) { _, which ->
                val localeCode = languageCodes[which]
                setLocale(localeCode)
            }
            .show()
    }

    private fun setLocale(languageCode: String) {
        val appLocale = LocaleListCompat.forLanguageTags(languageCode)
        AppCompatDelegate.setApplicationLocales(appLocale)
        recreate()
    }

    private fun setupCards() {
        binding.cardNotifications.setOnClickListener {
            Snackbar.make(binding.coordinatorLayout, R.string.notifications_setting, Snackbar.LENGTH_SHORT).show()
        }

        binding.cardAbout.setOnClickListener {
            Snackbar.make(binding.coordinatorLayout, R.string.about_taskflow, Snackbar.LENGTH_SHORT).show()
        }

        binding.tvVersion.text = getString(R.string.version_info, "2.4.0")
    }

    private fun setupLogout() {
        binding.btnLogout.setOnClickListener {
            Snackbar.make(binding.coordinatorLayout, R.string.btn_logout, Snackbar.LENGTH_LONG).show()
        }
    }
}
