/* Generated by Together */

package com.javapatterns.command.drawlines;

public interface Command {
	abstract public void execute();

	abstract public void unexecute();

	abstract public boolean canExecute();

	abstract public boolean canUnexecute();
}
