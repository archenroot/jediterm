package com.jediterm.terminal.ui.settings;

import java.awt.Font;

import com.jediterm.terminal.TextStyle;
import com.jediterm.terminal.TtyConnector;
import com.jediterm.terminal.emulator.ColorPalette;

public interface UserSettingsProvider {
  ColorPalette getTerminalColorPalette();

  Font getTerminalFont();

  float getTerminalFontSize();

  float getLineSpace();

  TextStyle getDefaultStyle();

  TextStyle getSelectionColor();

  boolean useInverseSelectionColor();

  public boolean copyOnSelect();
  
  public boolean pasteOnMiddleMouseClick();

  boolean useAntialiasing();

  boolean audibleBell();
  
  boolean enableMouseReporting();
  
  int caretBlinkingMs();
}
