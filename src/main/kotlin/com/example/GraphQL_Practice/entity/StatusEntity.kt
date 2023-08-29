package com.example.GraphQL_Practice.entity

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

open class StatusEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?,
    @Column
    var type:String,
    @Column
    val level:Int) {
}