package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrderBy
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.OrderType

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrderBy: NoteOrderBy = NoteOrderBy.Date(OrderType.Descending),
    onOrderChange: (NoteOrderBy) -> Unit
) {
    Column(modifier = modifier) {
        Row(modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Title",
                selected = noteOrderBy is NoteOrderBy.Title,
                onSelect = {
                    onOrderChange(NoteOrderBy.Title(noteOrderBy.orderType))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Date",
                selected = noteOrderBy is NoteOrderBy.Date,
                onSelect = {
                    onOrderChange(NoteOrderBy.Date(noteOrderBy.orderType))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Color",
                selected = noteOrderBy is NoteOrderBy.Color,
                onSelect = {
                    onOrderChange(NoteOrderBy.Color(noteOrderBy.orderType))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Ascending",
                selected = noteOrderBy.orderType is OrderType.Ascending,
                onSelect = {
                    onOrderChange(noteOrderBy.copy(OrderType.Ascending))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Descending",
                selected = noteOrderBy.orderType is OrderType.Descending,
                onSelect = {
                    onOrderChange(noteOrderBy.copy(OrderType.Descending))
                }
            )

        }
    }
}