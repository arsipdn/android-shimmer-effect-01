package com.adn.shimmerefect01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var container : ShimmerFrameLayout = findViewById(R.id.shimmer_container)
        container.startShimmer()
    }
}