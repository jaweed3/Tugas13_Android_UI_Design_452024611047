package com.unida.tugas13

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.snackbar.Snackbar
import com.unida.tugas13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        setupToolbar()
        setupBottomNavigation()
        setupFab()
        setupSubmitButton()
    }

    private fun setupToolbar() {
        binding.toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_info -> {
                    Snackbar.make(binding.coordinatorLayout, R.string.app_info, Snackbar.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    showSnackbar(R.string.nav_home_selected)
                    true
                }
                R.id.nav_profile -> {
                    showSnackbar(R.string.nav_profile_selected)
                    true
                }
                R.id.nav_settings -> {
                    showSnackbar(R.string.nav_settings_selected)
                    true
                }
                else -> false
            }
        }
    }

    private fun setupFab() {
        binding.fab.setOnClickListener {
            Snackbar.make(binding.coordinatorLayout, R.string.fab_help_message, Snackbar.LENGTH_LONG)
                .setAction(R.string.fab_action_dismiss) {}
                .show()
        }
    }

    private fun setupSubmitButton() {
        binding.btnSubmit.setOnClickListener {
            val name = binding.tilName.editText?.text.toString().trim()
            val email = binding.tilEmail.editText?.text.toString().trim()
            val message = binding.tilMessage.editText?.text.toString().trim()

            if (name.isEmpty()) {
                binding.tilName.error = getString(R.string.error_field_required)
                showSnackbar(R.string.error_fill_all_fields)
                return@setOnClickListener
            } else {
                binding.tilName.error = null
            }

            if (email.isEmpty()) {
                binding.tilEmail.error = getString(R.string.error_field_required)
                showSnackbar(R.string.error_fill_all_fields)
                return@setOnClickListener
            } else {
                binding.tilEmail.error = null
            }

            if (message.isEmpty()) {
                binding.tilMessage.error = getString(R.string.error_field_required)
                showSnackbar(R.string.error_fill_all_fields)
                return@setOnClickListener
            } else {
                binding.tilMessage.error = null
            }

            binding.tilName.editText?.text?.clear()
            binding.tilEmail.editText?.text?.clear()
            binding.tilMessage.editText?.text?.clear()

            Snackbar.make(binding.coordinatorLayout, R.string.form_submitted_success, Snackbar.LENGTH_LONG).show()
        }
    }

    private fun showSnackbar(messageResId: Int) {
        Snackbar.make(binding.coordinatorLayout, messageResId, Snackbar.LENGTH_SHORT).show()
    }
}
