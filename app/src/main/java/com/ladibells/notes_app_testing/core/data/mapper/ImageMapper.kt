package com.ladibells.notes_app_testing.core.data.mapper

import com.ladibells.notes_app_testing.core.data.remote.dto.ImageListDto
import com.ladibells.notes_app_testing.core.domain.model.Images

fun ImageListDto.toImages(): Images {
    return Images(
        images = hits?.map { imageDto ->
            imageDto.previewURL ?: ""
        } ?: emptyList()
    )
}

















