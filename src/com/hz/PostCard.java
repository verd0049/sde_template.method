package com.hz;

public class PostCard {

    private boolean isPostCard;
    private boolean isHighSchoolGraduationCard;

    private Printer printer;

    public PostCard(Printer printer,
                    boolean isPostCard,
                    boolean isHighSchoolGraduationCard) {
        this.printer = printer;

        this.isPostCard = isPostCard;
        this.isHighSchoolGraduationCard = isHighSchoolGraduationCard;
    }

    public void print() {

        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    private void printHeader() {
        String header = "";

        if(this.isPostCard) {
            header = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

        } else if (this.isHighSchoolGraduationCard) {
            header = "--@--#--&----------------------&--#--@--";
        }
        this.printer.printLine(header);
    }

    private void printMessage() {
        String msg = "";

        if(this.isPostCard) {
            msg = "Greetings from the netherlands!";

        } else if (this.isHighSchoolGraduationCard) {
            msg = "This calls for celebrating! Congratulations!";
        }

        this.printer.printLine(msg);
    }

    private void printImage() {

        if(this.isPostCard) {
            this.printer.printLine("        Art by Hayley Jane Wakenshaw");
            this.printer.printLine("");
            this.printer.printLine("             /)  (\\");
            this.printer.printLine("        .-._((,~~.))_.-,");
            this.printer.printLine("         `=.   99   ,='");
            this.printer.printLine("           / ,o~~o. \\");
            this.printer.printLine("          { { .__. } }");
            this.printer.printLine("           ) `~~~\' (");
            this.printer.printLine("          /`-._  _\\.-\\");
            this.printer.printLine("         /         )  \\");
            this.printer.printLine("       ,-X        #   X-.");
            this.printer.printLine("hjw   /   \\          /   \\");
            this.printer.printLine("     (     )| |  | |(     )");
            this.printer.printLine("      \\   / | |  | | \\   /");
            this.printer.printLine("       \\_(.-( )--( )-.)_/");
            this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
            this.printer.printLine("           /_,\\  /._\\");
        }
        else if (this.isHighSchoolGraduationCard) {

            this.printer.printLine("     ,_");
            this.printer.printLine("| `\"\"---..._____");
            this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
            this.printer.printLine("       \\   ```` ``\"---...__  |");
            this.printer.printLine("       |`              |   ``!");
            this.printer.printLine("       |               |     A");
            this.printer.printLine("       |               /\\   /#\\");
            this.printer.printLine("       /`--..______..-'  |  ###");
            this.printer.printLine("      |   /  `\\    /`--. |  ###");
            this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
            this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
            this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
            this.printer.printLine("   \\_,                 /_/");
            this.printer.printLine("       `\\              /");
            this.printer.printLine("         '.  '.__.'  .'");
            this.printer.printLine(" jgs      `-,____,-'");
            this.printer.printLine("           /\"\"\"I\"\"\\");
            this.printer.printLine("           /`---'--'\\");

        }
    }

    private void printFooter() {
        String footer = "";

        if(this.isPostCard) {
            footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

        } else if (this.isHighSchoolGraduationCard) {
            footer = "--@--#--&----------------------&--#--@--";
        }
        this.printer.printLine(footer);
    }

}
