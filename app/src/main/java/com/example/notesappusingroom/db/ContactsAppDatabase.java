package com.example.notesappusingroom.db;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.RoomDatabase;

import com.example.notesappusingroom.db.enitity.Contact;
import com.example.notesappusingroom.db.enitity.ContactDAO;

@Database(entities = {Contact.class},version = 1)

public abstract class ContactsAppDatabase extends RoomDatabase {
    public abstract ContactDAO getContactDAO();
}
