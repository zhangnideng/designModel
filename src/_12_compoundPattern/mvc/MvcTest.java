package _12_compoundPattern.mvc;

import _12_compoundPattern.mvc.controller.ControllerInterface;
import _12_compoundPattern.mvc.controller.impl.BeatController;
import _12_compoundPattern.mvc.model.BeatModelInterface;
import _12_compoundPattern.mvc.model.impl.BeatModel;

public class MvcTest {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
