import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.you.R

data class Services(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val price: String,
    @StringRes val hobbies: Int
)

val services = listOf(
    Services(R.drawable.coiffure_homme, R.string.service_name_1, "10.000fc", R.string.service_description_1),
    Services(R.drawable.coiffure_femme, R.string.service_name_2, "20.000fc", R.string.service_description_2),
    Services(R.drawable.Make_up, R.string.service_name_3, "50.000fc", R.string.service_description_3),
    Services(R.drawable.soins_capillaire, R.string.service_name_4, "100.000fc", R.string.service_description_4),
    Services(R.drawable.coloration, R.string.service_name_5, "15.000fc", R.string.service_description_5),
    Services(R.drawable.nails_art, R.string.service_name_6, "28.000fc", R.string.service_description_6),

)