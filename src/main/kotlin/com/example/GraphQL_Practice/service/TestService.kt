package com.example.GraphQL_Practice.service

import com.example.GraphQL_Practice.entity.StatusEntity
import com.example.GraphQL_Practice.entity.UserEntity
import com.example.GraphQL_Practice.repository.StatusRepository
import com.example.GraphQL_Practice.repository.UserRepository
import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Service

@Service
class TestService(private val userRepository: UserRepository,
                  private val statusRepository: StatusRepository):GraphQLQueryResolver,GraphQLMutationResolver {

    fun getAllUser():List<UserEntity>{
        return userRepository.findAll()
    }

    fun getUserById(id:Long): UserEntity {
        return userRepository.findById(id).get()
    }

    fun createUser(name:String,date:String,statusId:Long):UserEntity{
        val userStatus=statusRepository.findById(statusId).get()
        var user:UserEntity=UserEntity(null,name,date,userStatus)
        user=userRepository.save(user)
        return user
    }

    fun changeStatus(statusId:Long,type:String): StatusEntity {
        var status=statusRepository.findById(statusId).get()
        status.type=type
        status=statusRepository.save(status)
        return status
    }
}