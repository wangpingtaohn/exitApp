package com.wpt.exitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jumpBtn.setOnClickListener {
//            FlutterActivity
//                .withNewEngine()
//                .initialRoute("/my_route")
//                .build(this)
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            );
        }
    }
}
