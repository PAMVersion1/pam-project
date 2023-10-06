package team.chichi.pamapp.feature.CollectData

import lombok.Data
import java.sql.Timestamp

@Data
data class CALLData(
    val call_Id: Long,
    val u_Id: String,
    val c_Phone: String,
    val call_Type: Int,
    val call_Time: Timestamp,
    val call_Duration: String,
) {
    override fun toString(): String {
        return "$call_Id:$u_Id:$c_Phone:$call_Type:$call_Time:$call_Duration"
    }
}