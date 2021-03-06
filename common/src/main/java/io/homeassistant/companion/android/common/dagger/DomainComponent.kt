package io.homeassistant.companion.android.common.dagger

import dagger.Component
import io.homeassistant.companion.android.domain.authentication.AuthenticationUseCase
import io.homeassistant.companion.android.domain.integration.IntegrationUseCase
import io.homeassistant.companion.android.domain.url.UrlUseCase
import io.homeassistant.companion.android.domain.widgets.WidgetUseCase

@Component(dependencies = [DataComponent::class], modules = [DomainModule::class])
interface DomainComponent {

    fun urlUseCase(): UrlUseCase

    fun authenticationUseCase(): AuthenticationUseCase

    fun integrationUseCase(): IntegrationUseCase

    fun widgetUseCase(): WidgetUseCase
}
