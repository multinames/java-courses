package Lesson8;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

class Example {

    public static void main(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        String json = mapper.writeValueAsString(new Test());
        System.out.println(json);
    }

    static class Test {
        private String help = "something";
        private String nope = null;

        public String getHelp() {
            return help;
        }

        public void setHelp(String help) {
            this.help = help;
        }

        public String getNope() {
            return nope;
        }

        public void setNope(String nope) {
            this.nope = nope;
        }
    }
}