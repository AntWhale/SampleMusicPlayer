package com.sample.samplemusicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sample.samplemusicplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _viewBinding: ActivityMainBinding? = null
    private val viewBinding: ActivityMainBinding get() = requireNotNull(_viewBinding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        supportFragmentManager.beginTransaction()
            .replace(viewBinding.fragmentContainer.id, PlayerFragment.newInstance())
            .commit()


    }
}