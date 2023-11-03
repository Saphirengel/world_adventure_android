package com.example.worldadventure.data.model

data class CharakterWerte(
    val strenghtRange: IntRange,
    val dexteryRange: IntRange,
    val intelligenceRange: IntRange,
    val constituionRange: IntRange,
    val wisdomRange: IntRange,
    val charismaRange: IntRange,
    val luckRange: IntRange
) {}