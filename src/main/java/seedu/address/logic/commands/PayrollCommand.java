package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ENDDATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_STARTDATE;
import java.time.LocalDate;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class PayrollCommand extends Command{
    public static final String COMMAND_WORD = "payroll";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Generates a payroll for a time period. "
            + "Parameters: "
            + PREFIX_STARTDATE + "START DATE "
            + PREFIX_ENDDATE + "END DATE ";

    public static final String MESSAGE_SUCCESS = "Payroll generated for %1$s to %2$s";
    public static final String MESSAGE_FAILURE = "Payroll generation failed";
    private final LocalDate startDate;
    private final LocalDate endDate;

    public PayrollCommand(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        try {
            model.generatePayroll(startDate, endDate);
            return new CommandResult(String.format(MESSAGE_SUCCESS, startDate, endDate));
        } catch (Exception e) {
            return new CommandResult(MESSAGE_FAILURE);
        }
    }
}
