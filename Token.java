// This class models a token, which has two parts:
// 1) the token itself (e.g., "id" or "+")
// 2) the token's lexeme (e.g., "foo")

public class Token {

    private String token; // this is the identifier - finite
    private String lexeme; // this is the value the token represents

    public Token(String token, String lexeme) {
	this.token=token; // assigns the token
	this.lexeme=lexeme; // assigns the lexeme
    }

    public Token(String token) {
	this(token,token); // for tokens without lexemes (e.g ,)
    }

    public String tok() { return token; }  // returns token
    public String lex() { return lexeme; } // returns lexeme

    public boolean equals(Token t) {
	return token.equals(t.token); // checks if this token is equal to parameter
    }

    public String toString() {
	return "<"+tok()+","+lex()+">"; // string form
    }

}
