package com.example.contactsapp.contact

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.contactsapp.model.Contact

@Composable
fun ContactItem(contact: Contact) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(18.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = contact.imageRes),
                contentDescription = contact.name,
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(50))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = contact.name, fontWeight = FontWeight.Bold)
                Text(text = contact.email)
                Text(text = contact.address)
            }
        }
    }
}