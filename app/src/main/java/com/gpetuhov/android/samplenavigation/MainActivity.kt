package com.gpetuhov.android.samplenavigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController

// The project has only one activity.
// The activity just holds NavHostFragment,
// which in turn navigates between different fragments.

// Activity must extend AppCompatActivity or FragmentActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // We must override this method like this
    override fun onSupportNavigateUp() = findNavController(R.id.nav_host).navigateUp()
}
