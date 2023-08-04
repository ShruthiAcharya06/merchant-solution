package com.merchant;

import com.merchant.algo.Algo;
import com.merchant.algo.SignalHandler;

public class SignalHandlerTwo implements SignalHandler {

    private static final Integer PARAM_TYPE_1 = 1;

    private static final Integer PARAM_VALUE_TYPE_1 = 80;

    private final Algo algo;

    public SignalHandlerTwo(Algo algo) {this.algo = algo;}

    @Override
    public void handleSignal(int signal) {
        algo.reverse();
        algo.setAlgoParam(PARAM_TYPE_1, PARAM_VALUE_TYPE_1);
        algo.submitToMarket();
        algo.doAlgo();
    }
}