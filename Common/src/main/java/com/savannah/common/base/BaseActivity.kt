package com.savannah.common.base

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * Author:Savannah
 * Description:
 * ComponentizationProject 10/27/20
 */
class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(Companion.TAG, "/common/BaseActivity/onCreate: ")
    }

    companion object {
        private const val TAG = "BaseActivity"
    }
}