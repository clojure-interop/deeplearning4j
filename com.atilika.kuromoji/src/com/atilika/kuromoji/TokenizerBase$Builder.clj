(ns com.atilika.kuromoji.TokenizerBase$Builder
  "Abstract Builder shared by all tokenizers"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji TokenizerBase$Builder]))

(defn ->builder
  "Constructor."
  (^TokenizerBase$Builder []
    (new TokenizerBase$Builder )))

(defn build
  "Creates a Tokenizer instance defined by this Builder

  returns: Tokenizer instance - `<T extends com.atilika.kuromoji.TokenizerBase> T`"
  ([^TokenizerBase$Builder this]
    (-> this (.build))))

(defn user-dictionary
  "Sets an optional user dictionary as an input stream

  The inpuut stream provided is not closed by this method

  input - user dictionary as an input stream - `java.io.InputStream`

  returns: this builder - `com.atilika.kuromoji.TokenizerBase$Builder`

  throws: java.io.IOException - if an error occurs when reading the user dictionary"
  (^com.atilika.kuromoji.TokenizerBase$Builder [^TokenizerBase$Builder this ^java.io.InputStream input]
    (-> this (.userDictionary input))))

