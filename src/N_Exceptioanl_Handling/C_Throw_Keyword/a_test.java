package N_Exceptioanl_Handling.C_Throw_Keyword;

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}

class Test {
    public static void main(String[] args) {
        int age = 16;
            if (age < 18) {
                throw new AgeException("");
            }

    }
}

