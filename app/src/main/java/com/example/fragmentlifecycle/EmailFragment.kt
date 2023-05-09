package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentlifecycle.Args.ARG_EMAIL_ID
import com.example.fragmentlifecycle.data.Email
import com.example.fragmentlifecycle.data.MockEmailData

class EmailFragment : Fragment() {

    private var emailId: String? = null

    private lateinit var emailTitle: TextView
    private lateinit var emailFrom: TextView
    private lateinit var emailDate: TextView
    private lateinit var emailBody: TextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Info", "EmailFragment has passed onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            emailId = it.getString(ARG_EMAIL_ID)
        }
        Log.i("Info", "EmailFragment has passed onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Info", "EmailFragment has passed onCreateView")
        val view = inflater.inflate(R.layout.fragment_email, container, false)
        emailTitle = view.findViewById(R.id.tv_detail_subject)
        emailFrom = view.findViewById(R.id.tv_detail_from)
        emailDate = view.findViewById(R.id.tv_detail_date)
        emailBody = view.findViewById(R.id.tv_body)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Info", "EmailFragment has passed onViewCreated")

        val email = getEmail()

        emailTitle.text = email.subject
        emailFrom.text = email.from
        emailDate.text = email.date
        emailBody.text = email.body
    }

    override fun onStart() {
        super.onStart()
        Log.i("Info", "EmailFragment has passed onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Info", "EmailFragment has passed onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Info", "EmailFragment has passed onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Info", "EmailFragment has passed onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Info", "EmailFragment has passed onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Info", "EmailFragment has passed onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Info", "EmailFragment has passed onDetach")
    }

    private fun getEmail(): Email {
        val email = MockEmailData.getEmailById(emailId ?: "")
        return email ?: Email("", "", "", "", "", "", "", "")
    }
}