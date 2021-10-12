package solutions.builder;

import java.time.LocalDateTime;

public class Logger {
    private String prefix;
    private String postfix;
    private boolean includeDate;

    public Logger(Builder builder) {
        this.prefix = builder.prefix;
        this.postfix = builder.postfix;
        this.includeDate = builder.includeDate;
    }

    public void log(String message) {
        if (prefix != null) message = prefix + " " + message;
        if (postfix != null) message = message + " " + postfix;
        if (includeDate) message = "[" + LocalDateTime.now() + "] " + message;
        System.out.println(message);
    }

    static class Builder {
        public String prefix = "";
        public String postfix = "";
        public boolean includeDate = false;

        public Builder withPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder withPostfix(String postfix) {
            this.postfix = postfix;
            return this;
        }

        public Builder includesDate(Boolean includeDate) {
            this.includeDate = includeDate;
            return this;
        }

        public Logger build() {
            return new Logger(this);
        }
    }
}
