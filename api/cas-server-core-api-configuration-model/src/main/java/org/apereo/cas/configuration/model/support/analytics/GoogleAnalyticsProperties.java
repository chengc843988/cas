package org.apereo.cas.configuration.model.support.analytics;

import org.apereo.cas.configuration.model.support.cookie.CookieProperties;
import org.apereo.cas.configuration.support.RequiresModule;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * This is {@link GoogleAnalyticsProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@RequiresModule(name = "cas-server-support-google-analytics", automated = true)
@Getter
@Setter
public class GoogleAnalyticsProperties implements Serializable {

    private static final long serialVersionUID = 5425678120443123345L;

    /**
     * The tracking id. Configuring the tracking
     * activated google analytics in CAS on UI views, etc.
     */
    private String googleAnalyticsTrackingId;

    /**
     * Cookie settings to be used with google analytics.
     */
    private Cookie cookie = new Cookie();

    @Getter
    @Setter
    public static class Cookie extends CookieProperties {
        private static final long serialVersionUID = -5432498833437602657L;

        /**
         * Attribute name to collect
         * from the authentication event
         * to serve as the cookie value.
         */
        private String attributeName;

        public Cookie() {
            setName("CasGoogleAnalytics");
            setPinToSession(false);
        }
    }
}
