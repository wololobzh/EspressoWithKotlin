package fr.acos.espressowithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Fonction qui affiche bonjour lorsqu'il y a un clic sur le bouton
     */
    fun onClickButtonRandom(view:View)
    {
        tv_affichage.text = "Bonjour"
    }
}
