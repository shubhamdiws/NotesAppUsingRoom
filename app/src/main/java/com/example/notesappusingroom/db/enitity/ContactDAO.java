package com.example.notesappusingroom.db.enitity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ContactDAO {

@Insert
public long addContact(Contact contact);

@Update
public void updateContact(Contact contact);


@Delete
public void deleteContact(Contact contact);


@Query("select*from contacts")
public List<Contact> getContacts();


@Query("select*from  contacts where contact_id ==:ContactID")
    public Contact getContact(long ContactID);
}
