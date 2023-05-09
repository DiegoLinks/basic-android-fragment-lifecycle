package com.example.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentlifecycle.Args.ARG_EMAIL_ID

class EmailActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private val fragmentTransaction = fragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        val emailId = intent.getStringExtra(ARG_EMAIL_ID)
        val bundle = Bundle()
        bundle.putString(ARG_EMAIL_ID, emailId)

        val fragment = EmailFragment()
        fragment.arguments = bundle
        fragmentTransaction.add(R.id.email_container, fragment)
        fragmentTransaction.commit()
    }
}