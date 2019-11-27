package org.dominokit.website.layout.shared.services;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Generated;
import org.dominokit.domino.rest.shared.request.ServerRequest;
import org.dominokit.domino.rest.shared.request.service.annotations.Request;
import org.dominokit.domino.rest.shared.request.service.annotations.RestService;
import org.dominokit.jacksonapt.AbstractObjectReader;
import org.dominokit.jacksonapt.AbstractObjectWriter;
import org.dominokit.jacksonapt.JsonDeserializer;
import org.dominokit.jacksonapt.JsonSerializer;
import org.dominokit.website.layout.shared.model.LayoutRequest;
import org.dominokit.website.layout.shared.model.LayoutRequestBeanJsonSerializerImpl;
import org.dominokit.website.layout.shared.model.LayoutResponse;
import org.dominokit.website.layout.shared.model.LayoutResponseBeanJsonDeserializerImpl;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.rest.apt.RequestFactoryProcessor")
@RestService(LayoutService.class)
public class LayoutServiceFactory {
  public static final LayoutServiceFactory INSTANCE = new LayoutServiceFactory();

  public ServerRequest<LayoutRequest, LayoutResponse> request(LayoutRequest request) {
    LayoutService_request instance = new LayoutService_request(request);
    instance.addCallArgument("request", Objects.isNull(request)?"":String.valueOf(request));
    return instance;
  }

  @Request
  public class LayoutService_request extends ServerRequest<LayoutRequest, LayoutResponse> {
    LayoutService_request(LayoutRequest request) {
      super(request);
      setHttpMethod("GET");
      setContentType(new String[]{"application/json"});
      setAccept(new String[]{"application/json"});
      setPath("/LayoutRequest");
      setServiceRoot("");
      setRequestWriter(bean -> new AbstractObjectWriter<LayoutRequest>("org.dominokit.website.layout.shared.model.LayoutRequest") {
        @Override
        protected JsonSerializer<?> newSerializer() {
          return new LayoutRequestBeanJsonSerializerImpl();}
      }.write(bean));
      setResponseReader(response -> new AbstractObjectReader<LayoutResponse>("org.dominokit.website.layout.shared.model.LayoutResponse") {
        @Override
        protected JsonDeserializer<LayoutResponse> newDeserializer() {
          return new LayoutResponseBeanJsonDeserializerImpl();}
      }.read(response.getBodyAsString()));
      setRequestParametersReplacer((token, bean) ->  {
        if (token.hasVariables()) {
        }
        return token.value();
      } );
    }
  }
}
