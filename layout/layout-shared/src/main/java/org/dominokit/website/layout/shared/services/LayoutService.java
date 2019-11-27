package org.dominokit.website.layout.shared.services;

import org.dominokit.domino.rest.shared.request.service.annotations.RequestFactory;
import org.dominokit.website.layout.shared.model.LayoutResponse;
import org.dominokit.website.layout.shared.model.LayoutRequest;

import javax.ws.rs.Path;

@RequestFactory
public interface LayoutService {
    @Path("LayoutRequest")
    LayoutResponse request(LayoutRequest request);
}
