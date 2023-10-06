package team.chichi.pamapp.feature.Contacts

import lombok.Data

@Data
data class ContactsData(

    val c_Phone: String,
    val c_Name: String

    ) {
    override fun toString(): String {
        return "$c_Name ($c_Phone)"
    }
}