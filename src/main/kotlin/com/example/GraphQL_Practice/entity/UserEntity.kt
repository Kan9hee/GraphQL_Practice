package com.example.GraphQL_Practice.entity

import jakarta.persistence.*

@Entity
open class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?,
    @Column
    val name:String,
    @Column
    val date:String,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    val statusEntity:StatusEntity
) {}