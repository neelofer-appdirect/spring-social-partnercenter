package org.springframework.social.partnercenter.security;

import static org.springframework.social.partnercenter.api.uri.UriProvider.DEFAULT_URL_PROVIDER;

import org.springframework.social.partnercenter.PartnerCenter;
import org.springframework.social.partnercenter.PartnerCenterAdmin;
import org.springframework.social.partnercenter.api.PartnerCenterAdminTemplate;
import org.springframework.social.partnercenter.api.PartnerCenterTemplate;
import org.springframework.social.partnercenter.api.uri.SecurityRegion;
import org.springframework.social.partnercenter.api.uri.UriProvider;

public class PartnerCenterServiceProvider extends AbstractAzureADServiceProvider<PartnerCenter>{

	private final static String DEFAULT_API_VERSION = "v1";
	private final String apiVersion;
	private final UriProvider uriProvider;

	public PartnerCenterServiceProvider(String applicationId, String applicationSecret, String clientId, String domain){
		super(new AzureADAuthTemplate(applicationId, applicationSecret, clientId, domain, DEFAULT_URL_PROVIDER));
		apiVersion = DEFAULT_API_VERSION;
		this.uriProvider = DEFAULT_URL_PROVIDER;
	}
	public PartnerCenterServiceProvider(String applicationId, String applicationSecret, String clientId, String domain, SecurityRegion securityRegion){
		super(new AzureADAuthTemplate(applicationId, applicationSecret, clientId, domain, DEFAULT_URL_PROVIDER));
		apiVersion = DEFAULT_API_VERSION;
		this.uriProvider = UriProvider.fromSecurityRegion(securityRegion);
	}

	public PartnerCenterServiceProvider(String applicationId, String applicationSecret, String clientId, String domain, String authority, String resourceUrl, String partnerServiceApiRoot){
		super(new AzureADAuthTemplate(applicationId, applicationSecret, clientId, domain, authority, resourceUrl, partnerServiceApiRoot));
		apiVersion = DEFAULT_API_VERSION;
		uriProvider = UriProvider.builder().authority(authority).partnerServiceApiRoot(partnerServiceApiRoot).resourceUrl(resourceUrl).build();
	}

	public PartnerCenterServiceProvider(String applicationId, String applicationSecret, String clientId, String domain, String apiVersion, SecurityRegion region){
		super(new AzureADAuthTemplate(applicationId, applicationSecret, clientId, domain, region.getAuthority(), region.getResourceUrl(), region.getPartnerServiceApiRoot()));
		uriProvider = UriProvider.fromSecurityRegion(region);
		this.apiVersion = apiVersion;
	}

	public PartnerCenterServiceProvider(String applicationId, String applicationSecret, String clientId, String domain, String apiVersion, String authority, String resourceUrl, String partnerServiceApiRoot){
		super(new AzureADAuthTemplate(applicationId, applicationSecret, clientId, domain, authority, resourceUrl, partnerServiceApiRoot));
		uriProvider = UriProvider.builder().authority(authority).partnerServiceApiRoot(partnerServiceApiRoot).resourceUrl(resourceUrl).build();
		this.apiVersion = apiVersion;
	}

	@Override
	public PartnerCenter getApi(String accessToken) {
		return new PartnerCenterTemplate(uriProvider, accessToken, apiVersion);
	}

	public PartnerCenterAdmin getAdminApi(String accessToken) {
		return new PartnerCenterAdminTemplate(uriProvider, accessToken, apiVersion);
	}
}
