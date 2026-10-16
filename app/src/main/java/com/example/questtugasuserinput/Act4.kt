package com.example.questtugasuserinput

import android.app.DatePickerDialog
import android.text.format.DateFormat
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import java.util.Calendar

@Composable
fun FormBiodata() {

    var namaDepan by remember {
        mutableStateOf("")
    }

    var namaBelakang by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var tanggalLahir by remember {
        mutableStateOf("")
    }

    var experience by remember {
        mutableStateOf("")
    }

    var androidSkill by remember {
        mutableStateOf(false)
    }

    var uiuxSkill by remember {
        mutableStateOf(false)
    }

    var webSkill by remember {
        mutableStateOf(false)
    }

    var dropdownExpanded by remember {
        mutableStateOf(false)
    }

    val context = LocalContext.current

    val experienceList = stringArrayResource(
        id = R.array.experience_list
    )

    val formLengkap =
        namaDepan.isNotEmpty() &&
                namaBelakang.isNotEmpty() &&
                email.isNotEmpty() &&
                tanggalLahir.isNotEmpty() &&
                experience.isNotEmpty() &&
                (androidSkill || uiuxSkill || webSkill)

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = colorResource(
            id = R.color.screen_background
        )
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {


            Image(
                painter = painterResource(
                    id = R.drawable.header_biodata
                ),
                contentDescription = stringResource(
                    id = R.string.header_description
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(
                        dimensionResource(
                            id = R.dimen.header_height
                        )
                    ),
                contentScale = ContentScale.Crop
            )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = dimensionResource(
                            id = R.dimen.form_card_top
                        ),
                        start = dimensionResource(
                            id = R.dimen.screen_horizontal
                        ),
                        end = dimensionResource(
                            id = R.dimen.screen_horizontal
                        )
                    )

            ) {


                Text(
                    text = stringResource(
                        id = R.string.form_title
                    ),
                    color = colorResource(
                        id = R.color.primary_purple
                    ),
                    fontSize = dimensionResource(
                        id = R.dimen.title_text_size
                    ).value.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(
                        dimensionResource(
                            id = R.dimen.small_spacing
                        )
                    )
                )


                Text(
                    text = stringResource(
                        id = R.string.form_subtitle
                    ),
                    color = colorResource(
                        id = R.color.subtitle_gray
                    ),
                    fontSize = dimensionResource(
                        id = R.dimen.subtitle_text_size
                    ).value.sp
                )

                Spacer(
                    modifier = Modifier.height(
                        dimensionResource(
                            id = R.dimen.medium_spacing
                        )
                    )
                )


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(
                        dimensionResource(
                            id = R.dimen.field_spacing
                        )
                    )
                ) {

                    OutlinedTextField(
                        value = namaDepan,
                        onValueChange = {
                            namaDepan = it
                        },
                        modifier = Modifier.weight(1f),
                        singleLine = true,
                        shape = RoundedCornerShape(
                            dimensionResource(
                                id = R.dimen.field_corner
                            )
                        ),
                        label = {
                            Text(
                                text = stringResource(
                                    id = R.string.first_name
                                )
                            )
                        }
                    )

                    OutlinedTextField(
                        value = namaBelakang,
                        onValueChange = {
                            namaBelakang = it
                        },
                        modifier = Modifier.weight(1f),
                        singleLine = true,
                        shape = RoundedCornerShape(
                            dimensionResource(
                                id = R.dimen.field_corner
                            )
                        ),
                        label = {
                            Text(
                                text = stringResource(
                                    id = R.string.last_name
                                )
                            )
                        }
                    )
                }

                Spacer(
                    modifier = Modifier.height(
                        dimensionResource(
                            id = R.dimen.field_spacing
                        )
                    )
                )


            }
        }
    }
}