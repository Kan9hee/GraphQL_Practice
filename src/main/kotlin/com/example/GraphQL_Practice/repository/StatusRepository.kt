package com.example.GraphQL_Practice.repository

import com.example.GraphQL_Practice.entity.StatusEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StatusRepository:JpaRepository<StatusEntity,Long> {
}