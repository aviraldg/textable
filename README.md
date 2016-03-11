Textable
========

[![](https://jitpack.io/v/com.aviraldg/textable.svg)](https://jitpack.io/#com.aviraldg/textable)

A basic library for creating pure-text tables written in Kotlin.

To install, add:

   ```gradle
   repositories {
        jcenter()
        maven { url "https://jitpack.io" }
   }
   dependencies {
         compile 'com.aviraldg:textable:1.0.0'
   }
   ```

Usage:

    val t = textable {
        row {
            cell("Number")
            cell("Alphabet")
        }
        (0..25).forEach {
            row {
                cell("${it+1}")
                cell("${'A'+it}")
            }
        }
    }

    println(t)
