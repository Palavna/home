  package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

  class MainActivity : AppCompatActivity() {

      var imyreall = "yana"
      var nom = "0702605843"
      var pasreall = "1111"
      var pas1reall = "1111"
      var sekv = "1111h"
      var sek2 = "1212"


      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)
          val imy = findViewById<EditText>(R.id.imy)
          val nom = findViewById<EditText>(R.id.nom)
          val pas = findViewById<EditText>(R.id.pas)
          val pas1 = findViewById<EditText>(R.id.pas1)
          val sekv = findViewById<EditText>(R.id.sekv)
          val sek2 = findViewById<EditText>(R.id.sek2)
          val clic = findViewById<Button>(R.id.clic)
          val uje = findViewById<Button>(R.id.uje)

          clic.setOnClickListener {
              if (imyreall == imy.text.toString() && pasreall == pas.text.toString() && pas1reall == pas1.text.toString()) {
                  Toast.makeText(this, "правильно", Toast.LENGTH_LONG).show()
                  Log.d("yana", "правильно")
              } else {
                  Toast.makeText(this, "неправильно", Toast.LENGTH_LONG).show()
                  Log.d("yana", "неправильно")
              }


          }

      }
  }

    fun editActions(view: View) {}
