(ns com.atilika.kuromoji.ipadic.Tokenizer
  "A tokenizer based on the IPADIC dictionary

 See Token for details on the morphological features produced by this tokenizer

 The following code example demonstrates how to use the Kuromoji tokenizer:


  package com.atilika.kuromoji.example;
  import com.atilika.kuromoji.ipadic.Token;
  import com.atilika.kuromoji.ipadic.Tokenizer;
  import java.util.List;

  public class KuromojiExample {
      public static void main(String[] args) {
          Tokenizer tokenizer = new Tokenizer() ;
          List<Token> tokens = tokenizer.tokenize(\"お寿司が食べたい。\");
          for (Token token : tokens) {
              System.out.println(token.getSurface()  \"\\t\"  token.getAllFeatures());
          }
      }
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.ipadic Tokenizer]))

(defn ->tokenizer
  "Constructor.

  Construct a default tokenizer"
  (^Tokenizer []
    (new Tokenizer )))

(defn tokenize
  "Tokenizes the provided text and returns a list of tokens with various feature information

  This method is thread safe

  text - text to tokenize - `java.lang.String`

  returns: list of Token, not null - `java.util.List<com.atilika.kuromoji.ipadic.Token>`"
  (^java.util.List [^Tokenizer this ^java.lang.String text]
    (-> this (.tokenize text))))

