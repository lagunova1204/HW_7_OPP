package view.commands;

import view.Console;
import java.io.IOException;

public class LoadData extends Command {

    public LoadData(Console console) {
        super(console);
    }

    @Override
        public String description() {
            return "Загрузить сохраненные данные";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        getConsole().loadData();
    }

}
