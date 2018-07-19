package fr.vsct.tock.bot.admin.bot

import fr.vsct.tock.bot.connector.ConnectorType
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.reflect.KProperty1
import org.litote.kmongo.Id
import org.litote.kmongo.property.KCollectionPropertyPath
import org.litote.kmongo.property.KPropertyPath

class BotApplicationConfiguration_<T>(previous: KPropertyPath<T, *>?, property: KProperty1<*, BotApplicationConfiguration?>) : KPropertyPath<T, BotApplicationConfiguration?>(previous,property) {
    val applicationId: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::applicationId)

    val botId: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::botId)

    val namespace: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::namespace)

    val nlpModel: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::nlpModel)

    val connectorType: KProperty1<T, ConnectorType?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::connectorType)

    val ownerConnectorType: KProperty1<T, ConnectorType?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::ownerConnectorType)

    val name_: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::name)

    val baseUrl: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::baseUrl)

    val parameters_: KProperty1<T, Map<String, String>?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::parameters)

    val path_: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::path)

    val _id: KProperty1<T, Id<BotApplicationConfiguration>?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::_id)
    companion object {
        val ApplicationId: KProperty1<BotApplicationConfiguration, String?>
            get() = BotApplicationConfiguration::applicationId
        val BotId: KProperty1<BotApplicationConfiguration, String?>
            get() = BotApplicationConfiguration::botId
        val Namespace: KProperty1<BotApplicationConfiguration, String?>
            get() = BotApplicationConfiguration::namespace
        val NlpModel: KProperty1<BotApplicationConfiguration, String?>
            get() = BotApplicationConfiguration::nlpModel
        val ConnectorType: KProperty1<BotApplicationConfiguration, ConnectorType?>
            get() = BotApplicationConfiguration::connectorType
        val OwnerConnectorType: KProperty1<BotApplicationConfiguration, ConnectorType?>
            get() = BotApplicationConfiguration::ownerConnectorType
        val Name: KProperty1<BotApplicationConfiguration, String?>
            get() = BotApplicationConfiguration::name
        val BaseUrl: KProperty1<BotApplicationConfiguration, String?>
            get() = BotApplicationConfiguration::baseUrl
        val Parameters: KProperty1<BotApplicationConfiguration, Map<String, String>?>
            get() = BotApplicationConfiguration::parameters
        val Path: KProperty1<BotApplicationConfiguration, String?>
            get() = BotApplicationConfiguration::path
        val _id: KProperty1<BotApplicationConfiguration, Id<BotApplicationConfiguration>?>
            get() = BotApplicationConfiguration::_id}
}

class BotApplicationConfiguration_Col<T>(previous: KPropertyPath<T, *>?, property: KProperty1<*, Collection<BotApplicationConfiguration>?>) : KCollectionPropertyPath<T, BotApplicationConfiguration?, BotApplicationConfiguration_<T>>(previous,property) {
    val applicationId: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::applicationId)

    val botId: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::botId)

    val namespace: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::namespace)

    val nlpModel: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::nlpModel)

    val connectorType: KProperty1<T, ConnectorType?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::connectorType)

    val ownerConnectorType: KProperty1<T, ConnectorType?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::ownerConnectorType)

    val name_: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::name)

    val baseUrl: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::baseUrl)

    val parameters_: KProperty1<T, Map<String, String>?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::parameters)

    val path_: KProperty1<T, String?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::path)

    val _id: KProperty1<T, Id<BotApplicationConfiguration>?>
        get() = org.litote.kmongo.property.KPropertyPath(this,BotApplicationConfiguration::_id)

    @Suppress("UNCHECKED_CAST")
    override fun memberWithAdditionalPath(additionalPath: String): BotApplicationConfiguration_<T> = BotApplicationConfiguration_(this, customProperty(this, additionalPath))}
