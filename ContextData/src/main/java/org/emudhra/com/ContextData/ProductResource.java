package org.emudhra.com.ContextData;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

@Path("/product")
public class ProductResource {

	@GET
	@Path("/get")
	public String getData(
				@Context HttpServletRequest request,
				@Context ResourceInfo resourceInfo,
				@Context UriInfo uriInfo,
				@Context HttpHeaders headers
			) {
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURL());
		System.out.println("----------------------");
		System.out.println(resourceInfo.getResourceMethod().getName());
		System.out.println(resourceInfo.getResourceMethod().getAnnotations()[0]);
		System.out.println(resourceInfo.getResourceMethod().getAnnotations()[1]);
		System.out.println("-----------------------");
		System.out.println(uriInfo.getPath());
		System.out.println(uriInfo.getAbsolutePath());
		System.out.println(uriInfo.getBaseUri());
		System.out.println(uriInfo.getPathParameters());
		System.out.println(uriInfo.getQueryParameters());
		System.out.println(uriInfo.getPathSegments());
		System.out.println("--------------------------");
		System.out.println(headers.getLength());
		System.out.println(headers.getMediaType());
		System.out.println(headers.getCookies());
		System.out.println(headers.getAcceptableMediaTypes());
		return "Git it!!!!";
		
	}
}
