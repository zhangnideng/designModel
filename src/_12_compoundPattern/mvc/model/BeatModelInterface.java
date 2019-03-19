package _12_compoundPattern.mvc.model;

import _12_compoundPattern.mvc.view.BPMObserver;
import _12_compoundPattern.mvc.view.BeatObserver;

public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver o);

    void notifyBeatObservers();

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void notifyBPMObservers();

    void removeObserver(BPMObserver o);
}
