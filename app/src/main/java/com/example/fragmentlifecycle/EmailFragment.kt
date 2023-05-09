package com.example.fragmentlifecycle

import android.os.Bundle
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            emailId = it.getString(ARG_EMAIL_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_email, container, false)
        emailTitle = view.findViewById(R.id.tv_detail_subject)
        emailFrom = view.findViewById(R.id.tv_detail_from)
        emailDate = view.findViewById(R.id.tv_detail_date)
        emailBody = view.findViewById(R.id.tv_body)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email = getEmail()

        emailTitle.text = email.subject
        emailFrom.text = email.from
        emailDate.text = email.date
        emailBody.text = email.body
    }

    private fun getEmail(): Email {
        val email = MockEmailData.getEmailById(emailId ?: "")
        return email ?: Email("", "", "", "", "", "", "", "")
    }
}