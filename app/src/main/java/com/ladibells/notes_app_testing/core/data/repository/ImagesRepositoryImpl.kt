package com.ladibells.notes_app_testing.core.data.repository

import com.ladibells.notes_app_testing.core.data.mapper.toImages
import com.ladibells.notes_app_testing.core.data.remote.api.ImagesApi
import com.ladibells.notes_app_testing.core.domain.model.Images
import com.ladibells.notes_app_testing.core.domain.repository.ImagesRepository
import javax.inject.Inject

class ImagesRepositoryImpl @Inject constructor(
    private val imagesApi: ImagesApi
) : ImagesRepository {

    override suspend fun searchImages(
        query: String
    ): Images? {
        return imagesApi.searchImages(query)?.toImages()
    }

}


















