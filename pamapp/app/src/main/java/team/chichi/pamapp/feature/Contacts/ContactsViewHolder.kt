package team.chichi.pamapp.feature.Contacts

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import team.chichi.pamapp.R

class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val mName: TextView = itemView.findViewById(R.id.mName)
    private val mTel: TextView = itemView.findViewById(R.id.mTel)

    fun bind(contact: ContactsData) {
        mName.text = contact.c_Name
        mTel.text = contact.c_Phone
    }
}