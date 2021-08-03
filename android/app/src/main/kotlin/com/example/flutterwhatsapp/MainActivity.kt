package com.example.flutterwhatsapp

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
    fun doNothing() {
        val b: Int = 10
        if (b == 0) {  // Noncompliant
            //toto
        } else {
            doNothing()
        }
    }
}
