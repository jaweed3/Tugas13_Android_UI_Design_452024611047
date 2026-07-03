package com.unida.tugas13

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.unida.tugas13.databinding.ActivityHomeBinding
import java.util.Locale

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupWindowInsets()
        setupToolbar()
        setupBottomNavigation()
        setupWelcomeCard()
        setupTaskCheckboxes()
        setupFab()
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
                    Snackbar.make(binding.coordinatorLayout, R.string.nav_tasks, Snackbar.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_calendar -> {
                    Snackbar.make(binding.coordinatorLayout, R.string.nav_calendar, Snackbar.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_settings -> {
                    startActivity(Intent(this, SettingsActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }

    private fun setupWelcomeCard() {
        val taskCount = 4
        binding.tvWelcomeMessage.text = getString(R.string.welcome_message, taskCount)

        binding.btnViewReport.setOnClickListener {
            Snackbar.make(binding.coordinatorLayout, R.string.btn_view_report, Snackbar.LENGTH_LONG).show()
        }
    }

    private fun setupTaskCheckboxes() {
        binding.cbTask1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Snackbar.make(binding.coordinatorLayout, R.string.task_review_design, Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.cbTask2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Snackbar.make(binding.coordinatorLayout, R.string.task_cicd_roadmap, Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.cbTask3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Snackbar.make(binding.coordinatorLayout, R.string.task_newsletter, Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.cbTask4.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Snackbar.make(binding.coordinatorLayout, R.string.task_team_sync, Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupFab() {
        binding.fab.setOnClickListener {
            Snackbar.make(binding.coordinatorLayout, R.string.add_task, Snackbar.LENGTH_LONG)
                .setAction(R.string.btn_save) {}
                .show()
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
    }
}
