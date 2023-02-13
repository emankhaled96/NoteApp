package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

sealed class NoteOrderBy(val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrderBy(orderType)
    class Date(orderType: OrderType) : NoteOrderBy(orderType)
    class Color(orderType: OrderType) : NoteOrderBy(orderType)


}
