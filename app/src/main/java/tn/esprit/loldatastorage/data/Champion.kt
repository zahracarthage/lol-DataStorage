package tn.esprit.leagueoflegendrecyclerview.data

const val PICTURE = "PICTURE"
const val NAME = "NAME"
const val ROLE = "ROLE"

//TODO 6 "Change this class to an Entity"

data class Champion(

    val id: Int,

    val champPic: Int,

    val champName: String,

    val champRole: String

)