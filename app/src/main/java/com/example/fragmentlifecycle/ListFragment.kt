package com.example.fragmentlifecycle

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentlifecycle.Args.ARG_EMAIL_ID
import com.example.fragmentlifecycle.data.MockEmailData

class ListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val emails = MockEmailData.getEmails()

        recyclerView.adapter = EmailListAdapter(emails) { email ->
            val intent = Intent(requireContext(), EmailActivity::class.java)
            intent.putExtra(ARG_EMAIL_ID, email.id)
            startActivity(intent)
        }

        return view
    }
}