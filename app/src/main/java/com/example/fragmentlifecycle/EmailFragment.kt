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

    private var emailTitle: TextView? = null
    private var emailFrom: TextView? = null
    private var emailDate: TextView? = null
    private var emailBody: TextView? = null

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
        emailTitle = view?.findViewById(R.id.email_detail_title_text_view)
        emailFrom = view?.findViewById(R.id.email_detail_from_text_view)
        emailDate = view?.findViewById(R.id.email_detail_date_text_view)
        emailBody = view?.findViewById(R.id.email_detail_body_text_view)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email = getEmail()

        emailTitle?.text = email.title
        emailFrom?.text = email.from
        emailDate?.text = email.date
        emailBody?.text = email.body
    }

    private fun getEmail(): Email {
        val email = MockEmailData.getEmailById(emailId ?: "")
        return email ?: Email("", "", "", "", "")
    }
}