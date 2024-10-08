package com.ladibells.notes_app_testing.core.domain.repository

import com.ladibells.notes_app_testing.core.domain.model.Images

interface ImagesRepository {

    suspend fun searchImages(query: String): Images?

}