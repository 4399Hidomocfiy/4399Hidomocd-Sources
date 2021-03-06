package bsh.util;

import bsh.ConsoleInterface;
import java.awt.Color;

public interface GUIConsoleInterface extends ConsoleInterface {
    void print(Object obj, Color color);

    void setNameCompletion(NameCompletion nameCompletion);

    void setWaitFeedback(boolean z);
}
