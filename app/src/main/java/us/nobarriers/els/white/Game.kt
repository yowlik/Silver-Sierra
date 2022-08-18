package us.nobarriers.els.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import us.nobarriers.els.R
import us.nobarriers.els.databinding.ActivityGameBinding
import kotlin.Result

class Game : AppCompatActivity() {
    val roll=mutableListOf<String>("1","2","3","4","5","6","7","8","9","10","11","12","13","14",
        "15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30")

    lateinit var time:String
    lateinit var binding:ActivityGameBinding

    private var timer: CountDownTimer?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val i=roll.random()
        check(i)

        binding.apply {
            startTimer(30000)
        }
    }
    private fun startTimer(timeMillis:Long){
        timer?.cancel()
        timer=object : CountDownTimer(timeMillis,500){

            override fun onTick(TimeEl: Long) {
                time="Your Time : ${((timeMillis-TimeEl)/1000).toString()}"
                binding.timend.text="${(TimeEl/1000).toString()}"
            }
            override fun onFinish() {
                val src="You Lose"
                val intent1=Intent(this@Game,Res::class.java)
                intent1.putExtra("lose",src)
                startActivity(intent1)
            }

        }.start()

    }

    fun intent1(){
        timer?.cancel()
        val intent=Intent(this@Game,Res::class.java)
        intent.putExtra("key",time)
        startActivity(intent)
    }

    fun check(i:String){
        if(i=="1"){
            binding.im1.setImageResource(R.drawable.smiler)
            binding.im1.setOnClickListener {
                intent1()
                binding.im1.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="2"){
            binding.im2.setImageResource(R.drawable.smiler)
            binding.im2.setOnClickListener {
                intent1()
                binding.im2.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="3"){
            binding.im3.setImageResource(R.drawable.smiler)
            binding.im3.setOnClickListener {
                intent1()
                binding.im3.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="4"){
            binding.im4.setImageResource(R.drawable.smiler)
            binding.im4.setOnClickListener {
                intent1()
                binding.im4.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="5"){
            binding.im5.setImageResource(R.drawable.smiler)
            binding.im5.setOnClickListener {
                intent1()
                binding.im5.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="6"){
            binding.im6.setImageResource(R.drawable.smiler)
            binding.im6.setOnClickListener {
                intent1()
                binding.im6.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="7"){
            binding.im7.setImageResource(R.drawable.smiler)
            binding.im7.setOnClickListener {
                intent1()
                binding.im7.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="8"){
            binding.im8.setImageResource(R.drawable.smiler)
            binding.im8.setOnClickListener {
                intent1()
                binding.im8.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="9"){
            binding.im9.setImageResource(R.drawable.smiler)
            binding.im9.setOnClickListener {
                intent1()
                binding.im9.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="10"){

            binding.im10.setImageResource(R.drawable.smiler)
            binding.im10.setOnClickListener {
                intent1()
                binding.im10.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="11"){
            binding.im11.setImageResource(R.drawable.smiler)
            binding.im11.setOnClickListener {
               intent1()
                binding.im11.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="12"){
            binding.im12.setImageResource(R.drawable.smiler)
            binding.im12.setOnClickListener {
                intent1()
                binding.im12.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="13"){
            binding.im13.setImageResource(R.drawable.smiler)
            binding.im13.setOnClickListener {
                intent1()
                binding.im13.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="14"){
            binding.im14.setImageResource(R.drawable.smiler)
            binding.im14.setOnClickListener {
                intent1()
                binding.im14.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="15"){
            binding.im15.setImageResource(R.drawable.smiler)
            binding.im15.setOnClickListener {
                intent1()
                binding.im15.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="16"){
            binding.im16.setImageResource(R.drawable.smiler)
            binding.im16.setOnClickListener {
                intent1()
                binding.im16.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="17"){
            binding.im17.setImageResource(R.drawable.smiler)
            binding.im17.setOnClickListener {
                intent1()
                binding.im17.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="18"){
            binding.im18.setImageResource(R.drawable.smiler)
            binding.im18.setOnClickListener {
                intent1()
                binding.im18.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="19"){
            binding.im19.setImageResource(R.drawable.smiler)
            binding.im19.setOnClickListener {
                intent1()
                binding.im19.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="20"){
            binding.im20.setImageResource(R.drawable.smiler)
            binding.im20.setOnClickListener {
                intent1()
                binding.im20.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="21"){
            binding.im21.setImageResource(R.drawable.smiler)
            binding.im21.setOnClickListener {
                intent1()
                binding.im21.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="22"){
            binding.im22.setImageResource(R.drawable.smiler)
            binding.im22.setOnClickListener {
                intent1()
                binding.im22.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="23"){
            binding.im23.setImageResource(R.drawable.smiler)
            binding.im23.setOnClickListener {
                intent1()
                binding.im23.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="24"){
            binding.im24.setImageResource(R.drawable.smiler)
            binding.im24.setOnClickListener {
                intent1()
                binding.im24.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="25"){
            binding.im25.setImageResource(R.drawable.smiler)
            binding.im25.setOnClickListener {
                intent1()
                binding.im25.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="26"){
            binding.im26.setImageResource(R.drawable.smiler)
            binding.im26.setOnClickListener {
                intent1()
                binding.im26.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="27"){
            binding.im27.setImageResource(R.drawable.smiler)
            binding.im27.setOnClickListener {
                timer!!.cancel()
                intent1()
                binding.im27.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="28"){
            binding.im28.setImageResource(R.drawable.smiler)
            binding.im28.setOnClickListener {
                intent1()
                binding.im28.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="29"){
            binding.im29.setImageResource(R.drawable.smiler)
            binding.im29.setOnClickListener {
                intent1()
                binding.im29.setImageResource(R.drawable.smile)
            }
        }
        else if (i=="30"){
            binding.im30.setImageResource(R.drawable.smiler)
            binding.im30.setOnClickListener {
                intent1()
                binding.im30.setImageResource(R.drawable.smile)
            }
        }
    }



}