package org.dominokit.website.layout.client.presenters;

import javax.annotation.Generated;
import org.dominokit.domino.api.client.annotations.presenter.Command;
import org.dominokit.domino.api.client.request.PresenterCommand;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.apt.client.processors.module.client.presenters.PresenterProcessor")
@Command
public class HomeProxy_PresenterCommand extends PresenterCommand<HomeProxy_Presenter> {
  public HomeProxy_PresenterCommand() {
    configure(new HomeProxy_Presenter_Config());
  }
}
