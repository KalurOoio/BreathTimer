package com.savk.breathtimer.breathSession

data class SessionParameters(
    var sessionLength: Int = 0,
    var sessionDelay1: Int = 0,
    var sessionDelay2: Int = 0,
    var inhale: Int = 0,
    var exhale: Int = 0
)
