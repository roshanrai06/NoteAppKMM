package com.roshan.dev.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform