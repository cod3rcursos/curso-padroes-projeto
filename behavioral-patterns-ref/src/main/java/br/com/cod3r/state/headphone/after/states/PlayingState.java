package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class PlayingState implements HPState {
	private static final HPState instance = new PlayingState();
	private PlayingState() {}

	@Override
	public void click(HeadPhone hp) {
		hp.setPlaying(false);
		System.out.println("> Stop Player");
		hp.setState(OnState.getInstance());
	}

	@Override
	public void longClick(HeadPhone hp) {
		hp.setOn(false);
		System.out.println("> Turning Off");
		hp.setState(OffState.getInstance());
	}

	public static HPState getInstance() {
		return instance;
	}

}
