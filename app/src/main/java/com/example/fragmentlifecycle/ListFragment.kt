package com.example.fragmentlifecycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
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
            val bundle = bundleOf(ARG_EMAIL_ID to email.id)
            Navigation.findNavController(view).navigate(R.id.action_listFragment_to_emailFragment, bundle)
        }

        return view
    }
}