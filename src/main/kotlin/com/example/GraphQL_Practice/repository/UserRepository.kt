package com.example.GraphQL_Practice.repository

import com.example.GraphQL_Practice.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository<UserEntity,Long> {
}