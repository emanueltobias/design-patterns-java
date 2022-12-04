package com.emanueltobias.state.headphone.after.states;

import com.emanueltobias.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
