package com.example.fragmentlifecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentlifecycle.data.Email

class EmailListAdapter(
    private val emailList: List<Email>,
    private val onEmailItemClick: (Email) -> Unit
) : RecyclerView.Adapter<EmailListAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.emai_item_list, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.bind(email)
        holder.itemView.setOnClickListener { onEmailItemClick(email) }
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val fromTextView: TextView = itemView.findViewById(R.id.email_from_text_view)
        private val titleTextView: TextView = itemView.findViewById(R.id.email_title_text_view)
        private val dateTextView: TextView = itemView.findViewById(R.id.email_date_text_view)

        fun bind(email: Email) {
            fromTextView.text = email.from
            titleTextView.text = email.title
            dateTextView.text = email.date
        }
    }
}