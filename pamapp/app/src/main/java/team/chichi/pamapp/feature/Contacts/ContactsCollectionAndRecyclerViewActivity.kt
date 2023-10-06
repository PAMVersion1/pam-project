package team.chichi.pamapp.feature.Contacts

import android.content.pm.PackageManager
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import team.chichi.pamapp.R

class ContactsCollectionAndRecyclerViewActivity : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts_collection_and_recycler_view)

        // 퍼미션 허용했는지 확인
        val status = ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS")
        if (status == PackageManager.PERMISSION_GRANTED) {
            Log.d("test", "permission granted")
        } else {
            // 퍼미션 요청 다이얼로그 표시
            ActivityCompat.requestPermissions(this, arrayOf<String>("android.permission.READ_CONTACTS"),100)
            Log.d("test", "permission denied")
        }

        val projection =
            arrayOf( // ContactsContract.CommonDataKinds.Phone.CONTACT_ID // 인덱스 값, 중복될 수 있음 -- 한 사람 번호가 여러개인 경우
                ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                ContactsContract.CommonDataKinds.Phone.NUMBER,
            )

        val sortOrder =
            ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME


        fun getAllContacts(): MutableList<ContactsData> {
            val contentResolver = contentResolver
            val cursor: Cursor? = contentResolver.query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                projection,
                null,
                null,
                sortOrder
            )

            val contactsList: MutableList<ContactsData> = ArrayList()

            if (cursor != null) {
                while (cursor.moveToNext()) {
                    val nameIndex = cursor.getColumnIndex(projection[0])
                    val numberIndex = cursor.getColumnIndex(projection[1])
                    val name = cursor.getString(nameIndex)
                    val number = cursor.getString(numberIndex)
                    val contact = ContactsData(c_Phone = number, c_Name = name)
                    contactsList.add(contact)
                }
                cursor.close()
            }
            return contactsList



        }


        mRecyclerView = findViewById(R.id.mRecyclerView)

        val contactsList = getAllContacts()


        val adapter = ContactsListAdapter(contactsList)


        mRecyclerView.adapter = adapter

    }
}