package com.project.service;

import java.util.List;

import com.project.model.Registration;

public interface FormService {
   public boolean Insert(Registration r);
   public Registration login(Registration from);
   public boolean ConfirmUsernameAndPhone(Registration f);
   public boolean UpdatePassword(Registration f);
   public boolean Update(Registration f);
   public Registration getA(int id);
   public boolean changePassword(Registration r,int id);
   public boolean checkOldPassword(Registration r,int id);
   List<Registration> getAll();
   List<Registration> search(String input);
}
