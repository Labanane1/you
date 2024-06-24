import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.you.R

data class Services(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val price: Int,
    @StringRes val details: Int
)

val services = listOf(
    Services(R.drawable.coiffure_homme, R.string.service_name_1, 10, R.string.service_description_1),
    Services(R.drawable.coiffure_femme, R.string.service_name_2, 20, R.string.service_description_2),
    Services(R.drawable.make_up, R.string.service_name_3, 30, R.string.service_description_3),
    Services(R.drawable.soins_capillaire, R.string.service_name_4, 20, R.string.service_description_4),
    Services(R.drawable.coloration, R.string.service_name_5, 10, R.string.service_description_5),
    Services(R.drawable.nails_art, R.string.service_name_6, 15, R.string.service_description_6),

)