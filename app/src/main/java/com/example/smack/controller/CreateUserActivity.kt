package com.example.smack.controller

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smack.R
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {
    var userAvatar = "profiledefault"
    var avatarColor = "[0.5,0.5,0.5,1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }
    fun generateUserAvatarClicked(view:View){
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)
        if(color==0){
            userAvatar = "light$avatar"
        }else{
            userAvatar = "dark$avatar"
        }
        val resourceid = resources.getIdentifier(userAvatar,"drawable",packageName)
        createAvatarImageView.setImageResource(resourceid)
    }
    fun generateColorClicked(view: View){
        val ramdom = Random()
        val r = ramdom.nextInt(255)
        val g = ramdom.nextInt(255)
        val b = ramdom.nextInt(255)
        createAvatarImageView.setBackgroundColor(Color.rgb(r,g,b))
        val savedR = r.toDouble()/255
        val savedG = r.toDouble()/255
        val savedB = r.toDouble()/255
        avatarColor = "[$savedR,$savedG,$savedB,1]"
        println(avatarColor)

    }
    fun createUserClicked(view: View){

    }
}
