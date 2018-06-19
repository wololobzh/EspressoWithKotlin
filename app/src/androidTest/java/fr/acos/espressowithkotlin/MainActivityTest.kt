package fr.acos.espressowithkotlin

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Classe de test
 */
@LargeTest
class MainActivityTest
{
    /**
     * Permet de définir l'activité à tester
     */
    @Rule @JvmField val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    /**
     * Fonction qui définit un test.
     */
    @Test
    fun testRandom()
    {
        //Clic sur le bouton "Random Fact"
        onView(withId(R.id.btn_bonjour)).perform(click())
        //Regarde si l'affichage est bien égal à "Bonjour"
        onView(withId(R.id.tv_affichage)).check(matches(withText("Bonjour")))
    }
}