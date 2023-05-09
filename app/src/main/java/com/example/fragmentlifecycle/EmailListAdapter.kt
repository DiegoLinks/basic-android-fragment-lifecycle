package com.example.fragmentlifecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fragmentlifecycle.data.Email

class EmailListAdapter(
    private val emailList: List<Email>,
    private val onEmailItemClick: (Email) -> Unit
) : RecyclerView.Adapter<EmailListAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item_list, parent, false)
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
        private val ivSenderIcon: ImageView = itemView.findViewById(R.id.iv_sender_icon)
        private val tvFrom: TextView = itemView.findViewById(R.id.tv_sender_name)
        private val tvSubject: TextView = itemView.findViewById(R.id.tv_subject)
        private val tvDate: TextView = itemView.findViewById(R.id.tv_date)
        private val tvPreview: TextView = itemView.findViewById(R.id.tv_preview)

        fun bind(email: Email) {
            Glide
                .with(itemView.context)
                .load(email.image)
                .circleCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(ivSenderIcon)
            tvFrom.text = email.name
            tvSubject.text = email.subject
            tvDate.text = email.date
            tvPreview.text = email.preview
        }
    }
}