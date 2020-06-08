package dev.mustaq.data.utils

import dev.mustaq.data.model.Dictionary
import dev.mustaq.domain.model.Meaning

/**
 * Created by Mustaq Sameer on 07/06/20
 */

internal val Dictionary.toMeaningObject: Meaning
    get() = Meaning(
        meaning = this.meaningList[0].meaning,
        example = this.meaningList[0].example
    )