package com.manobixadminserver.service.impl;

import com.manobixadminserver.model.User;
import com.manobixadminserver.repository.UserRepository;
import com.manobixadminserver.service.Rest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImpl implements Rest<User> {

    private final UserRepository repository;

    public UserImpl(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public User get(String id) {
        return this.repository.getById(id);
    }

    @Override
    public List<User> getAll() {
        return this.repository.findAll();
    }

    @Override
    public User create(User entity) {
        return this.repository.save(entity);
    }

    @Override
    public User update(String id, User entity) {
        Optional<User> existingUserOptional = this.repository.findById(id);

        if (existingUserOptional.isPresent()) {
            User existingUser = existingUserOptional.get();
            existingUser.setName(entity.getName());
            existingUser.setCpf(entity.getCpf());
            existingUser.setRole(entity.getRole());

            return this.repository.save(existingUser);
        } else {
            return null;
        }
    }


    @Override
    public void delete(String id) {
        this.repository.deleteById(id);
    }
}
