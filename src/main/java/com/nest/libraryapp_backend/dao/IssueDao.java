package com.nest.libraryapp_backend.dao;

import com.nest.libraryapp_backend.model.Issue;
import org.springframework.data.repository.CrudRepository;

public interface IssueDao extends CrudRepository<Issue,Integer> {
}
