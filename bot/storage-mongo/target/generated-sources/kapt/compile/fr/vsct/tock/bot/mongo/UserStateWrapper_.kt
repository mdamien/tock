package fr.vsct.tock.bot.mongo

import java.time.Instant
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.reflect.KProperty1
import org.litote.kmongo.property.KCollectionPropertyPath
import org.litote.kmongo.property.KPropertyPath

internal class UserStateWrapper_<T>(previous: KPropertyPath<T, *>?, property: KProperty1<*, UserTimelineCol.UserStateWrapper?>) : KPropertyPath<T, UserTimelineCol.UserStateWrapper?>(previous,property) {
    val creationDate: KProperty1<T, Instant?>
        get() = org.litote.kmongo.property.KPropertyPath(this,UserTimelineCol.UserStateWrapper::creationDate)

    val lastUpdateDate: KProperty1<T, Instant?>
        get() = org.litote.kmongo.property.KPropertyPath(this,UserTimelineCol.UserStateWrapper::lastUpdateDate)

    val flags: KProperty1<T, Map<String, UserTimelineCol.TimeBoxedFlagWrapper>?>
        get() = org.litote.kmongo.property.KPropertyPath(this,UserTimelineCol.UserStateWrapper::flags)
    companion object {
        val CreationDate: KProperty1<UserTimelineCol.UserStateWrapper, Instant?>
            get() = UserTimelineCol.UserStateWrapper::creationDate
        val LastUpdateDate: KProperty1<UserTimelineCol.UserStateWrapper, Instant?>
            get() = UserTimelineCol.UserStateWrapper::lastUpdateDate
        val Flags: KProperty1<UserTimelineCol.UserStateWrapper, Map<String, UserTimelineCol.TimeBoxedFlagWrapper>?>
            get() = UserTimelineCol.UserStateWrapper::flags}
}

internal class UserStateWrapper_Col<T>(previous: KPropertyPath<T, *>?, property: KProperty1<*, Collection<UserTimelineCol.UserStateWrapper>?>) : KCollectionPropertyPath<T, UserTimelineCol.UserStateWrapper?, UserStateWrapper_<T>>(previous,property) {
    val creationDate: KProperty1<T, Instant?>
        get() = org.litote.kmongo.property.KPropertyPath(this,UserTimelineCol.UserStateWrapper::creationDate)

    val lastUpdateDate: KProperty1<T, Instant?>
        get() = org.litote.kmongo.property.KPropertyPath(this,UserTimelineCol.UserStateWrapper::lastUpdateDate)

    val flags: KProperty1<T, Map<String, UserTimelineCol.TimeBoxedFlagWrapper>?>
        get() = org.litote.kmongo.property.KPropertyPath(this,UserTimelineCol.UserStateWrapper::flags)

    @Suppress("UNCHECKED_CAST")
    override fun memberWithAdditionalPath(additionalPath: String): UserStateWrapper_<T> = UserStateWrapper_(this, customProperty(this, additionalPath))}
