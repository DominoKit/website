package org.dominokit.website.layout.client.routing;

import java.lang.Override;
import java.util.Arrays;
import javax.annotation.Generated;
import org.dominokit.domino.api.client.annotations.StartupTask;
import org.dominokit.domino.api.client.events.BaseRoutingAggregator;
import org.dominokit.domino.api.client.startup.BaseRoutingStartupTask;
import org.dominokit.domino.history.DominoHistory;
import org.dominokit.domino.history.TokenFilter;
import org.dominokit.website.layout.client.presenters.HomeProxy_PresenterCommand;
import org.dominokit.website.layout.shared.events.LayoutReadyEvent;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.apt.client.processors.module.client.presenters.PresenterProcessor")
@StartupTask
public class HomeProxy_PresenterHistoryListenerTask extends BaseRoutingStartupTask {
  public HomeProxy_PresenterHistoryListenerTask() {
    super(Arrays.asList(new EventsAggregator_0()));
  }

  @Override
  protected TokenFilter getTokenFilter() {
    return TokenFilter.endsWithPathFilter("home");
  }

  @Override
  protected TokenFilter getStartupTokenFilter() {
    return TokenFilter.startsWithPathFilter("home");
  }

  @Override
  protected void onStateReady(DominoHistory.State state) {
     new HomeProxy_PresenterCommand().onPresenterReady(presenter -> {
      bindPresenter(presenter);
      if(!presenter.isActivated()) {
        presenter.reveal();
      }
    } ).send();
  }

  private static class EventsAggregator_0 extends BaseRoutingAggregator {
    private EventsAggregator_0() {
      super(Arrays.asList(LayoutReadyEvent.class));
    }
  }
}
